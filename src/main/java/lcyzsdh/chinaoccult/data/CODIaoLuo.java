package lcyzsdh.chinaoccult.data;

import lcyzsdh.chinaoccult.items.COItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraftforge.common.data.ForgeRecipeProvider;

import java.util.function.Consumer;

public class CODIaoLuo extends ForgeRecipeProvider {
    public CODIaoLuo(DataGenerator generator){
        super(generator);
    }
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){
        ShapedRecipeBuilder.shaped(COItems.BLACK_STEEL_INGOT.get()).pattern("III").pattern("III").pattern("III")
                .define('I',COItems.CINNABAR.get()).unlockedBy("ironIngot", InventoryChangeTrigger.Instance.hasItems(Items.IRON_INGOT)).save(consumer);
    }
}

