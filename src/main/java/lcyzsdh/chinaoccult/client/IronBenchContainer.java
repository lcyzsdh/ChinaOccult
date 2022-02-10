package lcyzsdh.chinaoccult.client;

import lcyzsdh.chinaoccult.blocks.tileentities.IronBenchTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IronBenchContainer extends Container {
    public IronBenchContainer(int id, World world, BlockPos pos,PlayerInventory inventory,PlayerEntity player){
        super(COContainers.IRON_BENCH_CONTAINER.get(),id);
        IronBenchTileEntity ironBenchTileEntity =(IronBenchTileEntity) world.getBlockEntity(pos);
        this.addSlot(new Slot(ironBenchTileEntity.getInventory(),0,80,32));

    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return true;
    }
    @Override
    public ItemStack quickMoveStack(PlayerEntity player,int ind){
        return ItemStack.EMPTY;
    }
}
