package lcyzsdh.chinaoccult;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.blocks.tileentities.COTileEntities;
import lcyzsdh.chinaoccult.client.COContainers;
import lcyzsdh.chinaoccult.items.COItems;
import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class ChinaOccult {
    public ChinaOccult(){
        IEventBus modBus=FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        COItems.ITEMS.register(modBus);
        COBlocks.BLOCKS.register(modBus);
        //COBiomes.BIOMES.register(modBus);
        COTileEntities.TILE_ENTITIES.register(modBus);
        COContainers.CONTAINER.register(modBus);
        modBus.addListener(this::onCLientEvent);
    }
    public void onCLientEvent(final FMLClientSetupEvent event){
//        event.enqueueWork(()->{
//            ScreenManager.;
//        });
    }
}
