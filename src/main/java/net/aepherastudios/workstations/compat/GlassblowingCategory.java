package net.aepherastudios.workstations.compat;

import mezz.jei.api.helpers.IGuiHelper;
import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.IWBlocks;
import net.aepherastudios.workstations.recipe.custom.GlassblowingRecipe;
import net.minecraft.resources.ResourceLocation;

public class GlassblowingCategory extends AbstractCookingCategory<GlassblowingRecipe> {
    public static final mezz.jei.api.recipe.RecipeType<GlassblowingRecipe> JEI_GLASSBLOWING_TYPE =
            new mezz.jei.api.recipe.RecipeType<>(new ResourceLocation(ImprovedWorkstations.MOD_ID, "glassblowing"), GlassblowingRecipe.class);

    public GlassblowingCategory(IGuiHelper guiHelper) {
        super(guiHelper, JEI_GLASSBLOWING_TYPE, IWBlocks.GLASSBLOWER.get(), "gui.workstations.category.glassblowing", 100);
    }
}