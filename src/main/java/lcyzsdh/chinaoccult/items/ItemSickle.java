package lcyzsdh.chinaoccult.items;

import com.google.common.collect.ImmutableSet;
import lcyzsdh.chinaoccult.blocks.COBlocks;
import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Set;

public class ItemSickle extends ToolItem {

    public static final ToolType SICKLE=ToolType.get(COUtils.MOD_ID+"_sickle");
    private static final Set<Block> EFFECT= ImmutableSet.of(COBlocks.ORCHID_FLOWER.get());

    public ItemSickle(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties properties){
        super(attackDamageIn,attackSpeedIn,tier,EFFECT,properties);
    }

    @Override
    public boolean canAttackBlock(BlockState blockState, World world, BlockPos pos, PlayerEntity player) {
        return !player.isCreative();
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state){
        if (EFFECT.contains(state.getBlock())){
            return this.speed;
        }
        return super.getDestroySpeed(stack,state);
    }

}