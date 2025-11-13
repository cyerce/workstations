package net.aepherastudios.workstations.client.menu.custom;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipeType;

public class GlassblowerMenu extends AbstractFurnaceMenu {
    protected GlassblowerMenu(int pContainer, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf){
        this(pContainer, pPlayerInventory);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory, Container pFurnaceContainer, ContainerData pFurnaceData) {
        super(MenuType.FURNACE, RecipeType.SMELTING, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, pFurnaceContainer, pFurnaceData);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory) {
        super(MenuType.FURNACE, RecipeType.SMELTING, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
