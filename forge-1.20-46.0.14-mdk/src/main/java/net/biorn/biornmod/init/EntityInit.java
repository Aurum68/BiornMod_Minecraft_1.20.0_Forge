package net.biorn.biornmod.init;

import net.biorn.biornmod.BiornMod;
import net.biorn.biornmod.entity.FirstEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITY_TYPES, BiornMod.MOD_ID);

    public static final RegistryObject<EntityType<FirstEntity>> FIRST_ENTITY = ENTITIES.register("first_entity",
            ()->EntityType.Builder.<FirstEntity>of(FirstEntity::new, MobCategory.CREATURE)
                    .sized(3f, 1.0f)
                    .build(new ResourceLocation(BiornMod.MOD_ID, "first_entity").toString()));
}
