package net.aepherastudios.workstations.recipe;


import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.recipe.custom.KilnRecipe;
import net.aepherastudios.workstations.recipe.serializer.KilnRecipeSerializer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IWRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ImprovedWorkstations.MOD_ID);

    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, ImprovedWorkstations.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KilnRecipe>> KILN_SERIALIZER =
            SERIALIZERS.register("kiln", KilnRecipeSerializer::new);

    public static final RegistryObject<RecipeType<KilnRecipe>> KILN_TYPE =
            TYPES.register("kiln", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return ImprovedWorkstations.MOD_ID + ":kiln";
                }
            });

    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}