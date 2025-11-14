package net.aepherastudios.workstations.recipe.recipies;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.aepherastudios.workstations.block.IWBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

public class GlassblowerRecipe extends AbstractCookingRecipe {
    public GlassblowerRecipe(ResourceLocation pId, String pGroup, CookingBookCategory pCategory, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(Type.INSTANCE, pId, pGroup, pCategory, pIngredient, pResult, pExperience, pCookingTime);
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(IWBlocks.GLASSBLOWER.get());
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Type implements RecipeType<GlassblowerRecipe> {
        public static final GlassblowerRecipe.Type INSTANCE = new GlassblowerRecipe.Type();
    }

    public static class Serializer implements RecipeSerializer<GlassblowerRecipe> {
        private final int defaultCookingTime;
        public static final GlassblowerRecipe.Serializer INSTANCE = new GlassblowerRecipe.Serializer(50);

        public Serializer(int defaultCookingTime){
            this.defaultCookingTime = defaultCookingTime;
        }


        public GlassblowerRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
            String s = GsonHelper.getAsString(pJson, "group", "");
            CookingBookCategory cookingbookcategory = (CookingBookCategory)CookingBookCategory.CODEC.byName(GsonHelper.getAsString(pJson, "category", (String)null), CookingBookCategory.MISC);
            JsonElement jsonelement = (JsonElement)(GsonHelper.isArrayNode(pJson, "ingredient") ? GsonHelper.getAsJsonArray(pJson, "ingredient") : GsonHelper.getAsJsonObject(pJson, "ingredient"));
            Ingredient ingredient = Ingredient.fromJson(jsonelement, false);
            if (!pJson.has("result")) {
                throw new JsonSyntaxException("Missing result, expected to find a string or object");
            } else {
                ItemStack itemstack;
                if (pJson.get("result").isJsonObject()) {
                    itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));
                } else {
                    String s1 = GsonHelper.getAsString(pJson, "result");
                    ResourceLocation resourcelocation = new ResourceLocation(s1);
                    itemstack = new ItemStack((ItemLike) BuiltInRegistries.ITEM.getOptional(resourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s1 + " does not exist")));
                }

                float f = GsonHelper.getAsFloat(pJson, "experience", 0.0F);
                int i = GsonHelper.getAsInt(pJson, "cookingtime", this.defaultCookingTime);
                return new GlassblowerRecipe(pRecipeId, s, cookingbookcategory, ingredient, itemstack, f, i);
            }
        }

        public GlassblowerRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            String s = pBuffer.readUtf();
            CookingBookCategory cookingbookcategory = (CookingBookCategory)pBuffer.readEnum(CookingBookCategory.class);
            Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
            ItemStack itemstack = pBuffer.readItem();
            float f = pBuffer.readFloat();
            int i = pBuffer.readVarInt();
            return new GlassblowerRecipe(pRecipeId, s, cookingbookcategory, ingredient, itemstack, f, i);
        }

        public void toNetwork(FriendlyByteBuf pBuffer, GlassblowerRecipe pRecipe) {
            pBuffer.writeUtf(pRecipe.group);
            pBuffer.writeEnum(pRecipe.category());
            pRecipe.ingredient.toNetwork(pBuffer);
            pBuffer.writeItem(pRecipe.result);
            pBuffer.writeFloat(pRecipe.experience);
            pBuffer.writeVarInt(pRecipe.cookingTime);
        }

    }
}
