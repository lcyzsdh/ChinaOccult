package lcyzsdh.chinaoccult.client;

import lcyzsdh.chinaoccult.utils.Utils;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class COContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINER=DeferredRegister.create(ForgeRegistries.CONTAINERS, Utils.MOD_ID);
    public static final RegistryObject<ContainerType<IronBenchContainer>> IRON_BENCH_CONTAINER =CONTAINER.register("iron_bench_container",()->
            IForgeContainerType.create((int id, PlayerInventory inv, PacketBuffer data)->
                    new IronBenchContainer(id, inv.player.getCommandSenderWorld(),data.readBlockPos(), inv,inv.player)));
}
