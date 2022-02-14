package lcyzsdh.chinaoccult.data;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenHandler {
    @SubscribeEvent
    public static void dataGen(GatherDataEvent event){
        event.getGenerator().addProvider(new CODIaoLuo(event.getGenerator()));
    }
}
