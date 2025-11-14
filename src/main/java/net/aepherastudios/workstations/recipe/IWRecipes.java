package net.aepherastudios.workstations.recipe;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.recipe.custom.CokingRecipe;
import net.aepherastudios.workstations.recipe.custom.GlassblowingRecipe;
import net.aepherastudios.workstations.recipe.custom.KilnBakingRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IWRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ImprovedWorkstations.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, ImprovedWorkstations.MOD_ID);


    public static final RegistryObject<RecipeSerializer<KilnBakingRecipe>> KILN_SERIALIZER =
            SERIALIZERS.register("kiln_baking", () -> KilnBakingRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<GlassblowingRecipe>> GLASSBLOWER_SERIALIZER =
            SERIALIZERS.register("glassblowing", () -> GlassblowingRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CokingRecipe>> COKING_OVEN_SERIALIZER =
            SERIALIZERS.register("coking", () -> CokingRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeType<KilnBakingRecipe>> KILN =
            RECIPE_TYPES.register("kiln_baking",
                    () -> RecipeType.simple(new ResourceLocation(ImprovedWorkstations.MOD_ID, "kiln_baking")));
    public static final RegistryObject<RecipeType<GlassblowingRecipe>> GLASSBLOWER =
            RECIPE_TYPES.register("glassblowing",
                    () -> RecipeType.simple(new ResourceLocation(ImprovedWorkstations.MOD_ID, "glassblowing")));
    public static final RegistryObject<RecipeType<CokingRecipe>> COKING_OVEN =
            RECIPE_TYPES.register("coking",
                    () -> RecipeType.simple(new ResourceLocation(ImprovedWorkstations.MOD_ID, "coking")));



    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}
