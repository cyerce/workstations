package net.aepherastudios.workstations.client.screen.custom;

import net.aepherastudios.workstations.client.menu.custom.CokingOvenMenu;
import net.aepherastudios.workstations.recipe.recipies.books.CokingRecipeBookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class CokingOvenScreen extends AbstractFurnaceScreen<CokingOvenMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/coking_oven.png");

    public CokingOvenScreen(CokingOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new CokingRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
