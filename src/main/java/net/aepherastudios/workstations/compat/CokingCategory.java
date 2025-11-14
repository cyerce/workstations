package net.aepherastudios.workstations.compat;

import mezz.jei.api.helpers.IGuiHelper;
import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.IWBlocks;
import net.aepherastudios.workstations.recipe.custom.CokingRecipe;
import net.minecraft.resources.ResourceLocation;

public class CokingCategory extends AbstractCookingCategory<CokingRecipe> {
    public static final mezz.jei.api.recipe.RecipeType<CokingRecipe> JEI_COKING_TYPE =
            new mezz.jei.api.recipe.RecipeType<>(new ResourceLocation(ImprovedWorkstations.MOD_ID, "coking"), CokingRecipe.class);

    public CokingCategory(IGuiHelper guiHelper) {
        super(guiHelper, JEI_COKING_TYPE, IWBlocks.COKING_OVEN.get(), "gui.workstations.category.coking", 100);
    }
}
