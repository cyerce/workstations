package net.aepherastudios.workstations.block;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.entity.KilnBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IWBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ImprovedWorkstations.MOD_ID);


    public static final RegistryObject<BlockEntityType<KilnBlockEntity>> KILN_BE =
            BLOCK_ENTITIES.register("kiln_block_entity", () ->
                    BlockEntityType.Builder.of(KilnBlockEntity::new,
                            IWBlocks.KILN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
