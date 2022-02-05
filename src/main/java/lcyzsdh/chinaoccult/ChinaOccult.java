package lcyzsdh.chinaoccult;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.items.COItems;
import lcyzsdh.chinaoccult.utils.OreGenEventHandler;
import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class ChinaOccult {
    public static final ItemGroup ChinaOccultItemGroup= new ItemGroup("chinaoccult") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(COItems.blackSteelIngot.get());
        }
    };
    public ChinaOccult(){
        IEventBus modBus=FMLJavaModLoadingContext.get().getModEventBus();
        COItems.ITEMS.register(modBus);
        COBlocks.BLOCKS.register(modBus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGenEventHandler::oreGeneration);
    }
}
