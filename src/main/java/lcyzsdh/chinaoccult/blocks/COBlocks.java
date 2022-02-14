package lcyzsdh.chinaoccult.blocks;


import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COBlocks {

    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, COUtils.MOD_ID);
    public static final RegistryObject<Block> BRONZE_ORE=BLOCKS.register("bronze_ore",()->new Block(COBlockBase.basicStone()));
    public static final RegistryObject<Block> SILVER_ORE =BLOCKS.register("silver_ore",()->new Block(COBlockBase.basicStone()));
    public static final RegistryObject<Block> ORCHID_FLOWER= BLOCKS.register("orchid_flower",()->new FlowerBlock(Effects.NIGHT_VISION,2, AbstractBlock.Properties.copy(Blocks.DANDELION)));
}
