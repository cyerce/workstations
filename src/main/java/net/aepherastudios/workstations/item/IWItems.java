package net.aepherastudios.workstations.item;

import net.aepherastudios.workstations.ImprovedWorkstations;
import net.aepherastudios.workstations.item.custom.MultiblockHammerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IWItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ImprovedWorkstations.MOD_ID);

    public static final RegistryObject<Item> MULTIBLOCK_HAMMER = ITEMS.register("multiblock_hammer", () -> new MultiblockHammerItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
