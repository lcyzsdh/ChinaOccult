package lcyzsdh.chinaoccult.items;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> BLACK_STEEL_INGOT =ITEMS.register("black_steel_ingot", ()->new Item(new Item.Properties().tab(Utils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> BRONZE_INGOT=ITEMS.register("bronze_ingot", ()->new Item(new Item.Properties().tab(Utils.ChinaOccultItemGroup)));

    //BlockItem
    public static final RegistryObject<Item> BRONZE_ORE=ITEMS.register("bronze_ore",()->new BlockItem(COBlocks.BRONZE_ORE.get(),new Item.Properties().tab(Utils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> MITHRIL_ORE=ITEMS.register("mithril_ore",()->new BlockItem(COBlocks.MITHRIL_ORE.get(),new Item.Properties().tab(Utils.ChinaOccultItemGroup)));
}
