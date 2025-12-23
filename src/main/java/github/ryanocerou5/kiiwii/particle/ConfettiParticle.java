package github.ryanocerou5.kiiwii.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.texture.atlas.Sprite;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.Vec3d;

public class ConfettiParticle extends SpriteBillboardParticle {
    private ConfettiParticle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz, SpriteProvider sprite) {
        super(world, x, y, z, vx, vy, vz);
        this.setSprite(sprite);
        this.scale(0.2f); // size of particle
        this.maxAge = 40 + world.random.nextInt(20); // lifespan
        this.gravityStrength = 0.02f;
    }

    @Override
    public void tick() {
        velocityX *= 0.9;
        velocityY *= 0.9;
        velocityZ *= 0.9;
        super.tick();
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType type, ClientWorld world, double x, double y, double z, double vx, double vy, double vz) {
            return new ConfettiParticle(world, x, y, z, vx, vy, vz, spriteProvider);
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
}
