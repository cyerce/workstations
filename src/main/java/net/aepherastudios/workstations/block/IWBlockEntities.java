package net.aepherastudios.workstations.block;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.entity.CokingOvenBlockEntity;
import net.aepherastudios.workstations.block.entity.GlassblowerBlockEntity;
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

    public static final RegistryObject<BlockEntityType<CokingOvenBlockEntity>> COKING_OVEN_BE =
            BLOCK_ENTITIES.register("coking_oven_block_entity", () ->
                    BlockEntityType.Builder.of(CokingOvenBlockEntity::new,
                            IWBlocks.COKING_OVEN.get()).build(null));


    public static final RegistryObject<BlockEntityType<GlassblowerBlockEntity>> GLASSBLOWER_BE =
            BLOCK_ENTITIES.register("glassblower_block_entity", () ->
                    BlockEntityType.Builder.of(GlassblowerBlockEntity::new,
                            IWBlocks.GLASSBLOWER.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
