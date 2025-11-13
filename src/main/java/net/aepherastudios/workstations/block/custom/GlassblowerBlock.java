package net.aepherastudios.workstations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class GlassblowerBlock extends AbstractFurnaceBlock {
    protected GlassblowerBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected void openContainer(Level pLevel, BlockPos pPos, Player pPlayer) {

    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
