package lcyzsdh.chinaoccult.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public class IronBenchScreen extends ContainerScreen<IronBenchContainer> {
    private final int texWidth=176;
    private final int texHeight=166;
    public IronBenchScreen(IronBenchContainer container, PlayerInventory inv, ITextComponent title) {
        super(container, inv, title);
    }

    @Override
    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {

    }
}
