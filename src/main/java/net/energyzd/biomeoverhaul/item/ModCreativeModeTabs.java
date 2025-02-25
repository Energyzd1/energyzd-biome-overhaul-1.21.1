package net.energyzd.biomeoverhaul.item;

import net.energyzd.biomeoverhaul.BiomeOverhaul;
import net.energyzd.biomeoverhaul.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BiomeOverhaul.MOD_ID);

    public static final Supplier<CreativeModeTab> BIOMEOVERHAUL_TAB = CREATIVE_MODE_TAB.register("biomeoverhaul_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PALM_PLANKS.get()))
                    .title(Component.translatable("creativetab.biomeoverhaul.biomeoverhaul"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PALM_LOG);
                        output.accept(ModBlocks.PALM_WOOD);
                        output.accept(ModBlocks.STRIPPED_PALM_LOG);
                        output.accept(ModBlocks.STRIPPED_PALM_WOOD);
                        output.accept(ModBlocks.PALM_PLANKS);
                        output.accept(ModBlocks.PALM_STAIRS);
                        output.accept(ModBlocks.PALM_SLAB);
                        output.accept(ModBlocks.PALM_FENCE);
                        output.accept(ModBlocks.PALM_FENCE_GATE);
                        output.accept(ModBlocks.PALM_DOOR);
                        output.accept(ModBlocks.PALM_TRAPDOOR);
                        output.accept(ModBlocks.PALM_PRESSURE_PLATE);
                        output.accept(ModBlocks.PALM_BUTTON);
                        output.accept(ModBlocks.BARREL_CACTUS);
                        output.accept(ModBlocks.SANDSTONE_BRICKS);
                        output.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.SANDSTONE_BRICK_WALL);
                        output.accept(ModBlocks.BEACH_GRASS);
                        output.accept(ModBlocks.DRY_GRASS);
                        output.accept(ModBlocks.CACTUS_FLOWER);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
