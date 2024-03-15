package net.biorn.biornmod.client.renderer;

import net.biorn.biornmod.BiornMod;
import net.biorn.biornmod.client.model.FirstEntityModel;
import net.biorn.biornmod.entity.FirstEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FirstEntityRenderer extends MobRenderer<FirstEntity, FirstEntityModel<FirstEntity>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(BiornMod.MOD_ID, "textures/entity/first_entity.png");
    public FirstEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new FirstEntityModel<>(context.bakeLayer(FirstEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(FirstEntity p_114482_) {
        return TEXTURE;
    }
}
