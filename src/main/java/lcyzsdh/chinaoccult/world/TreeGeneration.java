package lcyzsdh.chinaoccult.world;

import lcyzsdh.chinaoccult.world.features.COFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TreeGeneration {
    public static void treeGen(final BiomeLoadingEvent event){
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            event.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, COFeatures.PEACH_TREE.decorated(Features.Placements.HEIGHTMAP_SQUARE)
                    .decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(1,0.25f,2)))
            );
        }
    }
}
