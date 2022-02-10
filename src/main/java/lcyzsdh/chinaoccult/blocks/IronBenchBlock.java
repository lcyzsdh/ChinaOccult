package lcyzsdh.chinaoccult.blocks;

import lcyzsdh.chinaoccult.blocks.tileentities.IronBenchTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class IronBenchBlock extends Block {
    public IronBenchBlock(){
        super(Properties.of(Material.STONE));
    }
    @Override
    public boolean hasTileEntity(BlockState state){
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world){
        return new IronBenchTileEntity();
    }
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {
        if(!world.isClientSide&&hand==Hand.MAIN_HAND){
            IronBenchTileEntity ironBenchTileEntity=(IronBenchTileEntity) world.getBlockEntity(pos);
            NetworkHooks.openGui((ServerPlayerEntity) player,ironBenchTileEntity,(PacketBuffer buffer)->{
                buffer.writeBlockPos(ironBenchTileEntity.getBlockPos());
            });
        }
        return ActionResultType.SUCCESS;
    }
}
