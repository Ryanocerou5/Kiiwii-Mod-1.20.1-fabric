package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.particle.ConfettiParticle;
import github.ryanocerou5.kiiwii.particle.SoundboardBubbleParticle;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

@Environment(EnvType.CLIENT)
public class ParticlesClientInit {
    public static void register() {

        ParticleFactoryRegistry.getInstance().register(
                ParticleInit.SOUNDBOARD_BUBBLE,
                SoundboardBubbleParticle.Factory::new
        );

        ParticleFactoryRegistry.getInstance().register(
                ParticleInit.CONFETTI,
                ConfettiParticle.Factory::new
        );
    }
}
