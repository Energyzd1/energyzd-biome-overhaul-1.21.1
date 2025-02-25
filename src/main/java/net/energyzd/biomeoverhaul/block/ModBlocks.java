package net.energyzd.biomeoverhaul.block;

import net.energyzd.biomeoverhaul.BiomeOverhaul;
import net.energyzd.biomeoverhaul.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BiomeOverhaul.MOD_ID);

    public static final DeferredBlock<Block> PALM_LOG = registerBlock("palm_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()) {
                @Override
                public BlockState getStateForPlacement(BlockPlaceContext context) {
                    Direction direction = context.getClickedFace();
                    if (direction == Direction.UP || direction == Direction.DOWN) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Y);
                    } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                    } else {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.X);
                    }
                }
            });
    public static final DeferredBlock<Block> PALM_WOOD = registerBlock("palm_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()) {
                @Override
                public BlockState getStateForPlacement(BlockPlaceContext context) {
                    Direction direction = context.getClickedFace();
                    if (direction == Direction.UP || direction == Direction.DOWN) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Y);
                    } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                    } else {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.X);
                    }
                }
            });
    public static final DeferredBlock<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()) {
                @Override
                public BlockState getStateForPlacement(BlockPlaceContext context) {
                    Direction direction = context.getClickedFace();
                    if (direction == Direction.UP || direction == Direction.DOWN) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Y);
                    } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                    } else {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.X);
                    }
                }
            });
    public static final DeferredBlock<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()) {
                @Override
                public BlockState getStateForPlacement(BlockPlaceContext context) {
                    Direction direction = context.getClickedFace();
                    if (direction == Direction.UP || direction == Direction.DOWN) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Y);
                    } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                    } else {
                        return this.defaultBlockState().setValue(AXIS, Direction.Axis.X);
                    }
                }
            });
    public static final DeferredBlock<Block> PALM_PLANKS = registerBlock("palm_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<StairBlock> PALM_STAIRS = registerBlock("palm_stairs",
            () -> new StairBlock(ModBlocks.PALM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.CHERRY_WOOD)
                            .ignitedByLava()));
    public static final DeferredBlock<SlabBlock> PALM_SLAB = registerBlock("palm_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sound(SoundType.CHERRY_WOOD)
                            .ignitedByLava()));
    public static final DeferredBlock<FenceBlock> PALM_FENCE = registerBlock("palm_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<FenceGateBlock> PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<DoorBlock> PALM_DOOR = registerBlock("palm_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()
                    .noOcclusion()));
    public static final DeferredBlock<PressurePlateBlock> PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<ButtonBlock> PALM_BUTTON = registerBlock("palm_button",
            () -> new ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.CHERRY_WOOD)
                    .ignitedByLava()
                    .noCollission()));
    public static final DeferredBlock<CactusBlock> BARREL_CACTUS = registerBlock("barrel_cactus",
            () -> new CactusBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .strength(0.4F)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
                    .noOcclusion()
            ) {
                @Override
                public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
                    double shiftX = (1.0 - 10.0 / 16.0) / 2.0;
                    double shiftZ = (1.0 - 10.0 / 16.0) / 2.0;
                    double height = 8.0 / 16.0;

                    return Shapes.box(shiftX, 0.0, shiftZ, 1.0 - shiftX, height, 1.0 - shiftZ);
                }
                @Override
                public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
                    double shiftX = (1.0 - 10.0 / 16.0) / 2.0;
                    double shiftZ = (1.0 - 10.0 / 16.0) / 2.0;
                    double height = 8.0 / 16.0;

                    return Shapes.box(shiftX, 0.0, shiftZ, 1.0 - shiftX, height, 1.0 - shiftZ);
                }
            });
    public static final DeferredBlock<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<StairBlock> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                            .mapColor(MapColor.SAND)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(0.8F)
                            .sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(0.8F)
                    .sound(SoundType.STONE)));
    public static final DeferredBlock<BeachGrassBlock> BEACH_GRASS = registerBlock("beach_grass",
            () -> new BeachGrassBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XYZ)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
            ));
    public static final DeferredBlock<DryGrassBlock> DRY_GRASS = registerBlock("dry_grass",
            () -> new DryGrassBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XYZ)
                    .ignitedByLava()
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
            ));
    public static final DeferredBlock<CactusFlowerBlock> CACTUS_FLOWER = registerBlock("cactus_flower",
            () -> new CactusFlowerBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
