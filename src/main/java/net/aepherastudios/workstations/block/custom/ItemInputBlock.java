package net.aepherastudios.workstations.block.custom;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class ItemInputBlock extends Block {
    public static final EnumProperty<Pos> POS = EnumProperty.create("pos", Pos.class);
    public static final BooleanProperty ASSEMBLED = BooleanProperty.create("assembled");

    public ItemInputBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(POS, Pos.DEFAULT)
                .setValue(ASSEMBLED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POS, ASSEMBLED);
    }

    public static enum Pos implements StringRepresentable {
        DEFAULT("default"),
        BOTTOM_BACK_LEFT("bottom_back_left"),
        BOTTOM_BACK_RIGHT("bottom_back_right"),
        BOTTOM_FRONT_LEFT("bottom_front_left"),
        BOTTOM_FRONT_RIGHT("bottom_front_right"),
        TOP_BACK_LEFT("top_back_left"),
        TOP_BACK_RIGHT("top_back_right"),
        TOP_FRONT_LEFT("top_front_left"),
        TOP_FRONT_RIGHT("top_front_right");

        private final String name;

        Pos(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}
