package lcyzsdh.chinaoccult.world;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerationHandler {

    public static void oreGeneration(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            //生成铜矿
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, COBlocks.BRONZE_ORE.get().defaultBlockState(), 8, 15, 80, 12);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder set, RuleTest ft, BlockState st,
                                    int size, int minHeight, int maxHeight, int amount) {
        set.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(ft, st, size
        )).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)).squared().count(amount)));
    }
}
