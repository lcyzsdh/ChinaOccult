package lcyzsdh.chinaoccult.blocks;


import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COBlocks {

    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> BRONZE_BLOCK=BLOCKS.register("bronze_block",BlockBronze::new);
    public static final RegistryObject<Block> BRONZE_ORE=BLOCKS.register("bronze_ore",()->new OreBlock(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F)));

    private static
}
