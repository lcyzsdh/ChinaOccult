package lcyzsdh.chinaoccult.world.biome;

import lcyzsdh.chinaoccult.utils.COUtils;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COBiomes {
    public static final DeferredRegister<Biome> BIOMES=DeferredRegister.create(ForgeRegistries.BIOMES, COUtils.MOD_ID);
//    public static final RegistryObject<Biome> MEDVALLEY=BIOMES.register("medvalley",()->biomeBuild());
//    private static Biome biomeBuild(){
//        MobSpawnInfo.Builder builder=(new MobSpawnInfo.Builder()).creatureGenerationProbability(0.07f);
//
//    }
}
