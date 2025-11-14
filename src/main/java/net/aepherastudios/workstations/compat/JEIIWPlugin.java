package net.aepherastudios.workstations.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.IWBlocks;
import net.aepherastudios.workstations.client.screen.custom.CokingOvenScreen;
import net.aepherastudios.workstations.client.screen.custom.GlassblowerScreen;
import net.aepherastudios.workstations.client.screen.custom.KilnScreen;
import net.aepherastudios.workstations.recipe.custom.CokingRecipe;
import net.aepherastudios.workstations.recipe.custom.GlassblowingRecipe;
import net.aepherastudios.workstations.recipe.custom.KilnBakingRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIIWPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ImprovedWorkstations.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new KilnBakingCategory(registration.getJeiHelpers().getGuiHelper()),
                new CokingCategory(registration.getJeiHelpers().getGuiHelper()),
                new GlassblowingCategory(registration.getJeiHelpers().getGuiHelper())
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<KilnBakingRecipe> kilnBakingRecipes = recipeManager.getAllRecipesFor(KilnBakingRecipe.Type.INSTANCE);
        List<CokingRecipe> cokingRecipes = recipeManager.getAllRecipesFor(CokingRecipe.Type.INSTANCE);
        List<GlassblowingRecipe> glassblowingRecipes = recipeManager.getAllRecipesFor(GlassblowingRecipe.Type.INSTANCE);


        registration.addRecipes(KilnBakingCategory.JEI_KILN_TYPE, kilnBakingRecipes);
        registration.addRecipes(CokingCategory.JEI_COKING_TYPE, cokingRecipes);
        registration.addRecipes(GlassblowingCategory.JEI_GLASSBLOWING_TYPE, glassblowingRecipes);

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(KilnScreen.class, 60, 30, 20, 30,
                KilnBakingCategory.JEI_KILN_TYPE);
        registration.addRecipeClickArea(CokingOvenScreen.class, 60, 30, 20, 30,
                CokingCategory.JEI_COKING_TYPE);
        registration.addRecipeClickArea(GlassblowerScreen.class, 60, 30, 20, 30,
                GlassblowingCategory.JEI_GLASSBLOWING_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(
                new ItemStack(IWBlocks.KILN.get()),
                KilnBakingCategory.JEI_KILN_TYPE
        );

        registration.addRecipeCatalyst(
                new ItemStack(IWBlocks.GLASSBLOWER.get()),
                GlassblowingCategory.JEI_GLASSBLOWING_TYPE
        );

        registration.addRecipeCatalyst(
                new ItemStack(IWBlocks.COKING_OVEN.get()),
                CokingCategory.JEI_COKING_TYPE
        );
    }
}