package lcyzsdh.chinaoccult.utils;

import lcyzsdh.chinaoccult.items.COItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Utils {
    public static final String MOD_ID = "chinaoccult";
    public static final ItemGroup ChinaOccultItemGroup= new ItemGroup("chinaoccult") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(COItems.BLACK_STEEL_INGOT.get());
        }
    };
}
