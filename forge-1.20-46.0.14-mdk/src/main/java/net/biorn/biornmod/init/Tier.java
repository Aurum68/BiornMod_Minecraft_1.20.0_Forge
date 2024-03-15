package net.biorn.biornmod.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tier {
    public static final ForgeTier GREEN = new ForgeTier(
            3,
            333,
            1F,
            4,
            10,
            TagGreen.NEEDS_GREEN_TOOL,
            ()-> Ingredient.of(ItemInit.GREEN_METAL_BLOCK::get));

    }
