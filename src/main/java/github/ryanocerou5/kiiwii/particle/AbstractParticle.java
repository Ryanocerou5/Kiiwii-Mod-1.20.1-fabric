package github.ryanocerou5.kiiwii.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;
public class AbstractParticle extends SpriteBillboardParticle {
    private final double targetX;
    private final double targetY;
    private final double targetZ;
    public AbstractParticle(ClientWorld world,
                            double x, double y, double z,
                            double targetX, double targetY, double targetZ,
                            SpriteProvider spriteProvider) {
        super(world, x, y, z, targetX, targetY, targetZ);
        this.maxAge = 40 + world.random.nextInt(21);
        this.gravityStrength = 0;

        this.targetX = targetX;
        this.targetY = targetY;
        this.targetZ = targetZ;

        this.setSprite(spriteProvider);

        this.scale(0.2f);
    }

    @Override
    public void tick() {
        super.tick();

        double dx = targetX - this.x;
        double dy = targetY - this.y;
        double dz = targetZ - this.z;

        this.velocityX = dx * 0.025;
        this.velocityY = dy * 0.025;
        this.velocityZ = dz * 0.025;

        this.move(this.velocityX, this.velocityY, this.velocityZ);
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
        public @Nullable Particle createParticle(DefaultParticleType type, ClientWorld world,
                                                 double x, double y, double z,
                                                 double velocityX, double velocityY, double velocityZ) {
            return new AbstractParticle(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider);
        }
    }
}
