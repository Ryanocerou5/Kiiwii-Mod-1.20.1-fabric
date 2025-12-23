package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ParticleInit {
    public static final DefaultParticleType SOUNDBOARD_BUBBLE =
            FabricParticleTypes.simple();
    public static final DefaultParticleType CONFETTI =
            FabricParticleTypes.simple();

    public static void registerParticleTypes() {
        Registry.register(
                Registries.PARTICLE_TYPE,
                new Identifier(KiiwiiMod.MOD_ID, "speaker"),
                SOUNDBOARD_BUBBLE
        );

        Registry.register(
                Registries.PARTICLE_TYPE,
                new Identifier(KiiwiiMod.MOD_ID, "confetti"),
                CONFETTI
        );
    }
}
