package lcyzsdh.chinaoccult.world;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FlowerGeneration {
    public static void flowerGen(final BiomeLoadingEvent event){
        event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                Feature.FLOWER.configured(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(COBlocks.ORCHID_FLOWER.get().defaultBlockState()), SimpleBlockPlacer.INSTANCE)
                        .tries(1).build()).decorated(Features.Placements.HEIGHTMAP_SQUARE).count(1));
    }
}
