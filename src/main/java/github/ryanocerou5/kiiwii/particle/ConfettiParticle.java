package github.ryanocerou5.kiiwii.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

public class ConfettiParticle extends SpriteBillboardParticle {

    private static final float[][] COLORS = {
            {1f, 0f, 0f}, // red
            {0f, 1f, 0f}, // green
            {0f, 0f, 1f}, // blue
            {0f, 1f, 1f}, // cyan
            {1f, 0f, 1f}, // magenta
            {1f, 1f, 0f}, // yellow
            {1f, 1f, 1f}  // white
    };
    public ConfettiParticle(ClientWorld world,
                            double x, double y, double z,
                            double velocityX, double velocityY, double velocityZ,
                            SpriteProvider spriteProvider,
                            float r, float g, float b) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        this.maxAge = 350 + world.random.nextInt(51);

        this.setSprite(spriteProvider);

        this.red = r;
        this.green = g;
        this.blue = b;
    }

    @Override
    public void tick() {
        super.tick();

        // simple physics
        this.velocityY -= 0.004; // gravity
        this.velocityX *= 0.9; // drag
        this.velocityY *= 0.9;
        this.velocityZ *= 0.9;

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
        public @Nullable Particle createParticle(DefaultParticleType type, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            float[] rgb = COLORS[world.random.nextInt(COLORS.length)];
            return new ConfettiParticle(world, x, y, z, velocityX, velocityY, velocityZ, spriteProvider, rgb[0], rgb[1], rgb[2]);
        }
    }
}
