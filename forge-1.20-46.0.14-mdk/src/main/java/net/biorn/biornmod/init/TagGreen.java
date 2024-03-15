package net.biorn.biornmod.init;

import net.biorn.biornmod.BiornMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagGreen {
    public static final TagKey<Block> NEEDS_GREEN_TOOL = tag("needs_needs_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(BiornMod.MOD_ID, name));
    }
}
