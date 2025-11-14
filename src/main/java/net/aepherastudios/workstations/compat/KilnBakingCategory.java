package net.aepherastudios.workstations.compat;

import mezz.jei.api.helpers.IGuiHelper;
import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.IWBlocks;
import net.aepherastudios.workstations.recipe.custom.KilnBakingRecipe;
import net.minecraft.resources.ResourceLocation;


public class KilnBakingCategory extends AbstractCookingCategory<KilnBakingRecipe> {
    public static final mezz.jei.api.recipe.RecipeType<KilnBakingRecipe> JEI_KILN_TYPE =
            new mezz.jei.api.recipe.RecipeType<>(new ResourceLocation(ImprovedWorkstations.MOD_ID, "kiln_baking"), KilnBakingRecipe.class);

    public KilnBakingCategory(IGuiHelper guiHelper) {
        super(guiHelper, JEI_KILN_TYPE, IWBlocks.KILN.get(), "gui.workstations.category.kiln_baking", 100);
    }
}
