package net.aepherastudios.workstations.client.menu.custom;

import net.aepherastudios.workstations.client.IWMenuTypes;
import net.aepherastudios.workstations.recipe.recipies.KilnRecipe;
import net.aepherastudios.workstations.recipe.recipies.books.KilnBakingRecipeBookComponent;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;

public class KilnMenu extends AbstractFurnaceMenu {
    public KilnMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public KilnMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(IWMenuTypes.KILN_MENU.get(), KilnRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public KilnMenu(int pContainerId, Inventory pPlayerInventory) {
        super(IWMenuTypes.KILN_MENU.get(), KilnRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }

}
