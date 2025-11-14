package net.aepherastudios.workstations.client.menu.custom;

import net.aepherastudios.workstations.client.IWMenuTypes;
import net.aepherastudios.workstations.recipe.recipies.CokingOvenRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;


public class CokingOvenMenu extends AbstractFurnaceMenu {
    public CokingOvenMenu(int pContainer, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf){
        this(pContainer, pPlayerInventory);
    }

    public CokingOvenMenu(int pContainerId, Inventory pPlayerInventory, Container pFurnaceContainer, ContainerData pFurnaceData) {
        super(IWMenuTypes.COKING_OVEN_MENU.get(), CokingOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, pFurnaceContainer, pFurnaceData);
    }

    public CokingOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(IWMenuTypes.COKING_OVEN_MENU.get(), CokingOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
