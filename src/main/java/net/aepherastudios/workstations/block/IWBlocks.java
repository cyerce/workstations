package net.aepherastudios.workstations.block;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.custom.KilnBlock;
import net.aepherastudios.workstations.item.IWItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class IWBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ImprovedWorkstations.MOD_ID);


    public static final RegistryObject<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASSBLOWER = registerBlock("glassblower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COKING_OVEN = registerBlock("coking_oven",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(1f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return IWItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
