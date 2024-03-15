package net.biorn.biornmod.client.events;

import net.biorn.biornmod.BiornMod;
import net.biorn.biornmod.client.model.FirstEntityModel;
import net.biorn.biornmod.client.renderer.FirstEntityRenderer;
import net.biorn.biornmod.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BiornMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.FIRST_ENTITY.get(), FirstEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(FirstEntityModel.LAYER_LOCATION, FirstEntityModel::createBodyLayer);
    }
}
