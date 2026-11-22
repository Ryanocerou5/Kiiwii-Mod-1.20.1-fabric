package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.particle.AbstractParticle;
import github.ryanocerou5.kiiwii.particle.ConfettiParticle;
import github.ryanocerou5.kiiwii.particle.SoundboardBubbleParticle;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.particle.SpriteProvider;

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
        ParticleFactoryRegistry.getInstance().register(
                ParticleInit.ABSTRACT_PARTICLE,
                AbstractParticle.Factory::new
        );
    }
}
