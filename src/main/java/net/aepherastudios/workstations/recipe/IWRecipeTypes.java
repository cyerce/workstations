package net.aepherastudios.workstations.recipe;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class IWRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, ImprovedWorkstations.MOD_ID);



    public static void register(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
    }
}