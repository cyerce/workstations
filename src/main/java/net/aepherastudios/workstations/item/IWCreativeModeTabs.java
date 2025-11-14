package net.aepherastudios.workstations.item;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.block.IWBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IWCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ImprovedWorkstations.MOD_ID);



        public static final RegistryObject<CreativeModeTab> CREATEDEFENSIVE_SPACE = CREATIVE_MODE_TABS.register("workstations",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(IWBlocks.KILN.get()))
                    .title(Component.translatable("creativetab.workstations"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(IWItems.BLAST_CLAY.get());
                        pOutput.accept(IWItems.BLAST_BRICK.get());
                        pOutput.accept(IWBlocks.BLAST_BRICKS.get());
                        pOutput.accept(IWBlocks.KILN.get());
                        pOutput.accept(IWBlocks.COKING_OVEN.get());
                        pOutput.accept(IWBlocks.GLASSBLOWER.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
