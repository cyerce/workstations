package net.aepherastudios.workstations.block.entity;

import net.aepherastudios.workstations.block.IWBlockEntities;
import net.aepherastudios.workstations.client.menu.custom.GlassblowerMenu;
import net.aepherastudios.workstations.recipe.custom.GlassblowingRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class GlassblowerBlockEntity extends AbstractFurnaceBlockEntity {
    public GlassblowerBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(IWBlockEntities.GLASSBLOWER_BE.get(), pPos, pBlockState, GlassblowingRecipe.Type.INSTANCE);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.workstations.glassblower");
    }


    protected AbstractContainerMenu createMenu(int pId, Inventory pPlayer) {
        return new GlassblowerMenu(pId, pPlayer, this, dataAccess);
    }

    protected int getBurnDuration(ItemStack pFuel) {
        return super.getBurnDuration(pFuel) / 2;
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, GlassblowerBlockEntity be) {
        AbstractFurnaceBlockEntity.serverTick(level, pos, state, be);
    }
}
