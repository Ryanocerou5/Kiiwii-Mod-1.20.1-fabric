package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundEventInit {
    public static final SoundEvent MY_TRACK = registerSoundEvent("my_track");
    public static final SoundEvent MY_TRACK_2 = registerSoundEvent("my_track_2");

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(KiiwiiMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSoundEvents()
    {
        KiiwiiMod.LOGGER.info("Registering Sound Events for " + KiiwiiMod.MOD_ID);
    }
}
