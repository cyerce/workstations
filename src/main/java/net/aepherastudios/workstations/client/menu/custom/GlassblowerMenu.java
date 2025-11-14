package net.aepherastudios.workstations.client.menu.custom;

import net.aepherastudios.workstations.client.IWMenuTypes;
import net.aepherastudios.workstations.recipe.custom.GlassblowingRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;

public class GlassblowerMenu extends AbstractFurnaceMenu {
    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(IWMenuTypes.GLASSBLOWER_MENU.get(), GlassblowingRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory) {
        super(IWMenuTypes.GLASSBLOWER_MENU.get(), GlassblowingRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }

}
