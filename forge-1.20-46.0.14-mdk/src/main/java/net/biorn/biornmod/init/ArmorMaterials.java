package net.biorn.biornmod.init;

import net.biorn.biornmod.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterials {
    public static final ModArmorMaterial GREEN = new ModArmorMaterial(
            new int[] {380, 550, 330, 300},
            new int[] {9, 13, 7, 8},
            13,
            SoundEvents.BAMBOO_BREAK,
            ()-> Ingredient.of(ItemInit.GREEN_METAL_BLOCK::get),
            "green_metal",
            0.4f,
            0.15f
    );
}
