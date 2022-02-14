package lcyzsdh.chinaoccult.blocks.tileentities;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COTileEntities {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES=DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, COUtils.MOD_ID);
    public static final RegistryObject<TileEntityType<IronBenchTileEntity>> IBTE=
            TILE_ENTITIES.register("iron_bench_tileentity",()->TileEntityType.Builder.of(IronBenchTileEntity::new, COBlocks.IRONBEN.get()).build(null));
}
