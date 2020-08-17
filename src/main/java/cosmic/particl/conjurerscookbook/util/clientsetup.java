package cosmic.particl.conjurerscookbook.util;

import cosmic.particl.conjurerscookbook.block.BlockHolder;
import cosmic.particl.conjurerscookbook.block.Mandrakecrop;
import cosmic.particl.conjurerscookbook.conjurerscookbook;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
@Mod.EventBusSubscriber(modid = conjurerscookbook.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class clientsetup {
    @SubscribeEvent
    public static void clientRegistry(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockHolder.MANDRAKE_CROP, RenderType.getCutout());
    }
}
