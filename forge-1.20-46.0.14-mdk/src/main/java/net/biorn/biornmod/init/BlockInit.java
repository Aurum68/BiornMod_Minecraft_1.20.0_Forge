package net.biorn.biornmod.init;

import net.biorn.biornmod.BiornMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BiornMod.MOD_ID);

    public static final RegistryObject<Block> FIRST_BLOCK = BLOCKS.register("block_one",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> GREEN_METAL_BLOCK = BLOCKS.register("green_metal_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .strength(5F, 11F)
            ));

    public static final RegistryObject<DropExperienceBlock> GREEN_METAL_ORE_BLOCK = BLOCKS.register("green_metal_ore_block",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),
                    UniformInt.of(4, 9)));

    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_GREEN_METAL_ORE_BLOCK = BLOCKS.register("deepslate_green_metal_ore_block",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE),
                    UniformInt.of(4, 9)));

    public static final RegistryObject<DropExperienceBlock> NETHER_GREEN_METAL_ORE_BLOCK = BLOCKS.register("nether_green_metal_ore_block",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                    UniformInt.of(4, 9)));

    public static final RegistryObject<DropExperienceBlock> END_GREEN_METAL_ORE_BLOCK = BLOCKS.register("end_green_metal_ore_block",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE),
                    UniformInt.of(4, 9)));
}
