package lcyzsdh.chinaoccult.items;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, COUtils.MOD_ID);
    public static final RegistryObject<Item> BLACK_STEEL_INGOT =ITEMS.register("black_steel_ingot", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> CINNABAR =ITEMS.register("cinnabar", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> SILVER_INGOT =ITEMS.register("silver_ingot", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> SILVER_COIN =ITEMS.register("silver_coin", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> GOLD_COIN =ITEMS.register("gold_coin", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> PELLET_ORDINARY =ITEMS.register("pellet_ordinary", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> PELLET_FIRE_PORTECTION =ITEMS.register("pellet_fire_protection", ()->new Item(new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> SICKLE=ITEMS.register("sickle",()->new ItemSickle(ItemTier.WOOD,0.5f,-2.0f,new Item.Properties().tab(COUtils.COtItemGroup)));

    //BlockItem
    public static final RegistryObject<Item> CINNABAR_ORE=ITEMS.register("cinnabar_ore",()->new BlockItem(COBlocks.CINNABAR_ORE.get(),new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> SILVER_ORE=ITEMS.register("silver_ore",()->new BlockItem(COBlocks.SILVER_ORE.get(),new Item.Properties().tab(COUtils.COtItemGroup)));
    public static final RegistryObject<Item> ORCHID_FLOWER=ITEMS.register("orchid_flower",()->new BlockItem(COBlocks.ORCHID_FLOWER.get(),new Item.Properties().tab(COUtils.COtItemGroup)));
}
