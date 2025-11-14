package net.aepherastudios.workstations.block.entity;

import net.aepherastudios.workstations.block.IWBlockEntities;
import net.aepherastudios.workstations.client.menu.custom.CokingOvenMenu;
import net.aepherastudios.workstations.recipe.custom.CokingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CokingOvenBlockEntity extends AbstractFurnaceBlockEntity {
    public CokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(IWBlockEntities.COKING_OVEN_BE.get(), pPos, pBlockState, CokingRecipe.Type.INSTANCE);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.workstations.coking_oven");
    }


    protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
        return new CokingOvenMenu(pId, pPlayer, this, dataAccess);
    }

    protected int getBurnDuration(ItemStack pFuel) {
        return super.getBurnDuration(pFuel) / 2;
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, CokingOvenBlockEntity be) {
        AbstractFurnaceBlockEntity.serverTick(level, pos, state, be);
    }
}
