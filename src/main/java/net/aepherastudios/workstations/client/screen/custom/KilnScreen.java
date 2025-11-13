package net.aepherastudios.workstations.client.screen.custom;

import net.aepherastudios.workstations.client.menu.custom.KilnMenu;
import net.aepherastudios.workstations.recipe.recipies.books.KilnBakingRecipeBookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class KilnScreen extends AbstractFurnaceScreen {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/kiln.png");

    public KilnScreen(KilnMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new KilnBakingRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}