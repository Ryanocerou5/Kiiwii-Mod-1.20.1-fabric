package github.ryanocerou5.kiiwii.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

public class SoundboardBubbleParticle extends SpriteBillboardParticle {
    protected SoundboardBubbleParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);

        this.velocityY = 0.05 + world.random.nextFloat() * 0.03;
        this.scale = 0.2f;
        this.maxAge = 20 + world.random.nextInt(10);

        this.gravityStrength = 0;

        this.setSprite(spriteProvider);
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {

        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider)
        {
            this.spriteProvider  = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(DefaultParticleType type, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new SoundboardBubbleParticle(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider);
        }
    }
}
