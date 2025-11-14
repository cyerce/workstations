package net.aepherastudios.workstations.client.menu.custom;

import net.aepherastudios.workstations.client.IWMenuTypes;
import net.aepherastudios.workstations.recipe.recipies.GlassblowerRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipeType;

public class GlassblowerMenu extends AbstractFurnaceMenu {
    public GlassblowerMenu(int pContainer, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf){
        this(pContainer, pPlayerInventory);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory, Container pFurnaceContainer, ContainerData pFurnaceData) {
        super(IWMenuTypes.GLASSBLOWER_MENU.get(), GlassblowerRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, pFurnaceContainer, pFurnaceData);
    }

    public GlassblowerMenu(int pContainerId, Inventory pPlayerInventory) {
        super(IWMenuTypes.GLASSBLOWER_MENU.get(), GlassblowerRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
