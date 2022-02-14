package lcyzsdh.chinaoccult.blocks;


import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.block.*;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COBlocks {

    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, COUtils.MOD_ID);
    public static final RegistryObject<Block> CINNABAR_ORE =BLOCKS.register("cinnabar_ore",()->new Block(COBlockBase.basicStone()));
    public static final RegistryObject<Block> SILVER_ORE =BLOCKS.register("silver_ore",()->new Block(COBlockBase.basicStone()));
    public static final RegistryObject<Block> ORCHID_FLOWER= BLOCKS.register("orchid_flower",()->new FlowerBlock(Effects.NIGHT_VISION,2, AbstractBlock.Properties.copy(Blocks.DANDELION)));
    public static final RegistryObject<Block> IRONBEN= BLOCKS.register("ironben",()->new Block(COBlockBase.basicStone()));
    public static final RegistryObject<Block> PEACH_LEAVES=BLOCKS.register("peach_leaves",()->new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PEACH_LOG=BLOCKS.register("peach_log",()->new RotatedPillarBlock(AbstractBlock.Properties.copy(Blocks.OAK_LOG)));
}
