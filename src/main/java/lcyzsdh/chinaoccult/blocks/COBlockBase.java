package lcyzsdh.chinaoccult.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;


/**
 * ChinaOccult标准方块，提供预设的配置
 */
public class COBlockBase {
    public static Block.Properties basicStone(){
        return Block.Properties.of(Material.STONE, MaterialColor.STONE)
                .strength(3.0f,6.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops();
    }
}
