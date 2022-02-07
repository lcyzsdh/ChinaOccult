package lcyzsdh.chinaoccult;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.items.COItems;
import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class ChinaOccult {
    public ChinaOccult(){
        IEventBus modBus=FMLJavaModLoadingContext.get().getModEventBus();
        COItems.ITEMS.register(modBus);
        COBlocks.BLOCKS.register(modBus);
    }
}
