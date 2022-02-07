package lcyzsdh.chinaoccult.blocks;


import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COBlocks {

    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> BRONZE_ORE=BLOCKS.register("bronze_ore",()->new Block(COBasicBlock.basicStone()));
    public static final RegistryObject<Block> MITHRIL_ORE=BLOCKS.register("mithril_ore",()->new Block(COBasicBlock.basicStone()));

}
