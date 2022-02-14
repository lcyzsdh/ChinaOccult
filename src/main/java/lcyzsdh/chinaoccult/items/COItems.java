package lcyzsdh.chinaoccult.items;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, COUtils.MOD_ID);
    public static final RegistryObject<Item> BLACK_STEEL_INGOT =ITEMS.register("black_steel_ingot", ()->new Item(new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> CINNABAR =ITEMS.register("cinnabar", ()->new Item(new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> SILVER_INGOT =ITEMS.register("silver_ingot", ()->new Item(new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));

    //BlockItem
    public static final RegistryObject<Item> BRONZE_ORE=ITEMS.register("bronze_ore",()->new BlockItem(COBlocks.BRONZE_ORE.get(),new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> SILVER_ORE=ITEMS.register("silver_ore",()->new BlockItem(COBlocks.SILVER_ORE.get(),new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));
    public static final RegistryObject<Item> ORCHID_FLOWER=ITEMS.register("orchid_flower",()->new BlockItem(COBlocks.ORCHID_FLOWER.get(),new Item.Properties().tab(COUtils.ChinaOccultItemGroup)));
}
