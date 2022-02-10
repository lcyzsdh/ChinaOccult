package lcyzsdh.chinaoccult.world;

import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Utils.MOD_ID)
public class BiomeLoadEvent {

    @SubscribeEvent
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        //矿物生成
        OreGeneration.oreGeneration(event);
        FlowerGeneration.flowerGen(event);
    }
}
