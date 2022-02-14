package lcyzsdh.chinaoccult.blocks.tileentities;

import lcyzsdh.chinaoccult.client.IronBenchContainer;
import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class IronBenchTileEntity extends TileEntity implements INamedContainerProvider {
    Inventory inventory =new Inventory(1);
    public IronBenchTileEntity(){
        super(COTileEntities.IBTE.get());
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("gui."+ COUtils.MOD_ID+"iron_bench");
    }

    @Nullable
    @Override
    public Container createMenu(int sycID, PlayerInventory inventory, PlayerEntity player) {
        return new IronBenchContainer(sycID,this.level,this.worldPosition,inventory,player);
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        super.deserializeNBT(nbt);
    }

    @Override
    public void deserializeNBT(BlockState state, CompoundNBT nbt) {
        super.deserializeNBT(state, nbt);
    }
    public Inventory getInventory(){
        return inventory;
    }

}
