package lcyzsdh.chinaoccult.world.features;

import lcyzsdh.chinaoccult.blocks.COBlocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class COFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig,?> PEACH_TREE= Feature.TREE.configured(new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(COBlocks.PEACH_LOG.get().defaultBlockState()),
            new SimpleBlockStateProvider(COBlocks.PEACH_LEAVES.get().defaultBlockState()),
            new BlobFoliagePlacer(FeatureSpread.fixed(2),FeatureSpread.fixed(0),3),
            new StraightTrunkPlacer(6,4,3),
            new TwoLayerFeature(1,0,1)
    ).ignoreVines().build());
}
