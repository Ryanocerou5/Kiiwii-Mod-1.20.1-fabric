package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.ParticleInit;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ConfettiCannonItem extends Item {

    public ConfettiCannonItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        Vec3d look = user.getRotationVec(1.0F).normalize();
        Vec3d eyePos = user.getEyePos();
        Vec3d spawnPos = eyePos.add(look.multiply(0.5));
        int particles = 200;

        // Only run this on the client
        if (world.isClient && world instanceof ClientWorld clientWorld) {
            double baseSpeed = 1; // forward velocity
            double spread = 1;    // how far from straight line
            for (int i = 0; i < particles; i++) {
                // start with forward direction
                Vec3d velocity = look.multiply(baseSpeed);

                // add a small random offset for the cone
                velocity = velocity.add(
                        (world.random.nextDouble() * 2 - 1) * spread, // X
                        (world.random.nextDouble() * 2 - 1) * spread, // Y
                        (world.random.nextDouble() * 2 - 1) * spread  // Z
                );


                clientWorld.addParticle(
                        ParticleInit.CONFETTI,
                        spawnPos.x,
                        spawnPos.y,
                        spawnPos.z,
                        velocity.x,
                        velocity.y,
                        velocity.z
                );
            }
        }

        if (user instanceof PlayerEntity) {
            user.getItemCooldownManager().set(this, 20 * 20); // 20 seconds
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
