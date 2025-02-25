package net.energyzd.biomeoverhaul.item;

import net.energyzd.biomeoverhaul.BiomeOverhaul;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BiomeOverhaul.MOD_ID);

    public static final DeferredItem<Item> EXAMPLE = ITEMS.register("example",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
