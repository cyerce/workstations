package net.aepherastudios.workstations.recipe;

import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;

public interface IWRecipeSerializer<T extends Recipe<?>> extends net.minecraftforge.common.extensions.IForgeRecipeSerializer<T> {

    RecipeSerializer<ShapedRecipe> KILN_BAKING = register("kiln_baking", new ShapedRecipe.Serializer());

    T fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe);

    @org.jetbrains.annotations.Nullable
    T fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer);

    void toNetwork(FriendlyByteBuf pBuffer, T pRecipe);

    static <S extends RecipeSerializer<T>, T extends Recipe<?>> S register(String pKey, S pRecipeSerializer) {
        return Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, pKey, pRecipeSerializer);
    }
}
