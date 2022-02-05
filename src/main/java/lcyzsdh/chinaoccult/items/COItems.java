package lcyzsdh.chinaoccult.items;

import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COItems {
    public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> blackSteelIngot=ITEMS.register("black_steel_ingot", BlackSteelIngotItem::new);
}
