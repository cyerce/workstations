package net.aepherastudios.workstations.client.screen.custom;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.client.menu.custom.GlassblowerMenu;
import net.aepherastudios.workstations.recipe.books.GlassblowingRecipebookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class GlassblowerScreen extends AbstractFurnaceScreen<GlassblowerMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(ImprovedWorkstations.MOD_ID, "textures/gui/container/glassblower.png");

    public GlassblowerScreen(GlassblowerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new GlassblowingRecipebookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
