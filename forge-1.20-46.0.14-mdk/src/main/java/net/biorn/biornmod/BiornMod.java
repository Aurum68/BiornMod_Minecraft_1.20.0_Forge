package net.biorn.biornmod;

import com.mojang.logging.LogUtils;
import net.biorn.biornmod.init.BlockInit;
import net.biorn.biornmod.init.CreativeTabInit;
import net.biorn.biornmod.init.EntityInit;
import net.biorn.biornmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BiornMod.MOD_ID)
public class BiornMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "biornmod";

    public BiornMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EntityInit.ENTITIES.register(modEventBus);
        CreativeTabInit.TABS.register(modEventBus);
    }

}
