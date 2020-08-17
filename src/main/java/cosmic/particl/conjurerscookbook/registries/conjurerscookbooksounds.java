package cosmic.particl.conjurerscookbook.registries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static cosmic.particl.conjurerscookbook.conjurerscookbook.MODID;


@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class conjurerscookbooksounds {

    public static final SoundEvent mandrake_scream = makeSoundEvent("mandrake_scream");
    @SubscribeEvent
    public static void onRegisterSounds(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(
                mandrake_scream
        );
    }

    private static SoundEvent makeSoundEvent(String name) {
        SoundEvent sound = new SoundEvent(new ResourceLocation(MODID,name));
        sound.setRegistryName(new ResourceLocation(MODID, name));
        return sound;
    }
}