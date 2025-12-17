package github.ryanocerou5.kiiwii.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ChiliPepperItem extends AbstractCooldownItem{
    private final boolean isGolden;
    public ChiliPepperItem(Settings settings, boolean isGolden) {
        super(settings, 200);
        this.isGolden = isGolden;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player)
        {
            shootFireball(world, player, this.isGolden);
        }

        return result;
    }

    private void shootFireball(World world, PlayerEntity player, boolean isGolden) {
        double x = player.getX();
        double y = player.getEyeY();
        double z = player.getZ();

        Vec3d look = player.getRotationVec(1.0f);

        double velocity = 1.5;
        spawnFireball(world, player, x, y, z, look.multiply(velocity));

        if (isGolden) {
            double spread = Math.toRadians(10);

            Vec3d left = rotateY(look, -spread);
            Vec3d right = rotateY(look, spread);

            spawnFireball(world, player, x, y, z, left.multiply(velocity));
            spawnFireball(world, player, x, y, z, right.multiply(velocity));
        }
    }

    private void spawnFireball(World world, PlayerEntity player, double x, double y, double z, Vec3d velocity) {
        SmallFireballEntity fireball = new SmallFireballEntity(world, player, velocity.x, velocity.y, velocity.z);
        fireball.setPos(x + velocity.x, y + velocity.y, z + velocity.z);
        world.spawnEntity(fireball);
    }

    private Vec3d rotateY(Vec3d vec, double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        double newX = vec.x * cos - vec.z * sin;
        double newZ = vec.x * sin + vec.z * cos;
        return new Vec3d(newX, vec.y, newZ);
    }
}
