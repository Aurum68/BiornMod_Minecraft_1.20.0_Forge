package net.biorn.biornmod.init;

import net.biorn.biornmod.BiornMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static net.biorn.biornmod.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BiornMod.MOD_ID);

    public static final RegistryObject<Item> MANDARIN = addToTab(ITEMS.register("mandarin",
            ()->new Item(new Item.Properties().food(new FoodProperties.Builder().
                    nutrition(2).saturationMod(0.1F).build()))));

    public static final RegistryObject<Item> PINEAPPLE = addToTab(ITEMS.register("pineapple",
            ()->new Item(new Item.Properties().food(new FoodProperties.Builder().
                    nutrition(2).saturationMod(0.1F).build()))));

    public static final RegistryObject<Item> EMPTY_GLASS = addToTab(ITEMS.register("empty_glass",
            ()->new Item(new Item.Properties())));

    public static final RegistryObject<Item> MANDARIN_JUICE = addToTab(ITEMS.register("mandarin_juice",
            MandarinJuice::new));

    public static final RegistryObject<Item> GREEN_METAL_INGOT = addToTab(ITEMS.register("green_metal_ingot",
            ()->new Item(new Item.Properties())));

    public static final RegistryObject<Item> FIRST_BLOCK = addToTab(ITEMS.register("block_one",
            ()->new BlockItem(BlockInit.FIRST_BLOCK.get(), new Item.Properties())));

    public static final RegistryObject<Item> GREEN_METAL_BLOCK = addToTab(ITEMS.register("green_metal_block",
            ()->new BlockItem(BlockInit.GREEN_METAL_BLOCK.get(), new Item.Properties())));

    public static final RegistryObject<Item> GREEN_METAL_ORE_BLOCK = ITEMS.register("green_metal_ore_block",
            ()->new BlockItem(BlockInit.GREEN_METAL_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> DEEPSLATE_GREEN_METAL_ORE_BLOCK = addToTab(ITEMS.register("deepslate_green_metal_ore_block",
            ()->new BlockItem(BlockInit.GREEN_METAL_BLOCK.get(), new Item.Properties())));

    public static final RegistryObject<Item> NETHER_GREEN_METAL_ORE_BLOCK = ITEMS.register("nether_green_metal_ore_block",
            ()->new BlockItem(BlockInit.GREEN_METAL_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> END_GREEN_METAL_ORE_BLOCK = ITEMS.register("end_green_metal_ore_block",
            ()->new BlockItem(BlockInit.GREEN_METAL_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<SwordItem> SWORD_GREEN = addToTab(ITEMS.register("sword_green",
            ()->new SwordItem(Tier.GREEN, 5, 2.5F, new Item.Properties().stacksTo(1))));

    public static final RegistryObject<PickaxeItem> PICKAXE_GREEN = addToTab(ITEMS.register("pickaxe_green",
            ()->new PickaxeItem(Tier.GREEN, 5, 2.5F, new Item.Properties().stacksTo(1))));

    public static final RegistryObject<AxeItem> AXE_GREEN = addToTab(ITEMS.register("axe_green",
            ()->new AxeItem(Tier.GREEN, 5, 2.5F, new Item.Properties().stacksTo(1))));

    public static final RegistryObject<ShovelItem> SHOVEL_GREEN = addToTab(ITEMS.register("shovel_green",
            ()->new ShovelItem(Tier.GREEN, 5, 2.5F, new Item.Properties().stacksTo(1))));

    public static final RegistryObject<HoeItem> HOE_GREEN = addToTab(ITEMS.register("hoe_green",
            ()->new HoeItem(Tier.GREEN, 5, 2.5F, new Item.Properties().stacksTo(1))));

    public static final RegistryObject<ArmorItem> HELMET_GREEN = addToTab(ITEMS.register("helmet_green",
            ()->new ArmorItem(
                    ArmorMaterials.GREEN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties())));

    public static final RegistryObject<ArmorItem> CHESTPLATE_GREEN = addToTab(ITEMS.register("chestplate_green",
            ()->new ArmorItem(
                    ArmorMaterials.GREEN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties())));

    public static final RegistryObject<ArmorItem> LEGGINGS_GREEN = addToTab(ITEMS.register("leggings_green",
            ()->new ArmorItem(
                    ArmorMaterials.GREEN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties())));

    public static final RegistryObject<ArmorItem> BOOTS_GREEN = addToTab(ITEMS.register("boots_green",
            ()->new ArmorItem(
                    ArmorMaterials.GREEN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties())));

    public static final RegistryObject<ForgeSpawnEggItem> FIRST_ENTITY_SPAWN_EGG = ITEMS.register("first_entity_spawn_egg",
            ()->new ForgeSpawnEggItem(EntityInit.FIRST_ENTITY, 0x5A753C, 0x00C876, new Item.Properties()));
}
