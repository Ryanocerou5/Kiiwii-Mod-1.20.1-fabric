package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.DamageTypeInit;
import github.ryanocerou5.kiiwii.init.ParticleInit;
import github.ryanocerou5.kiiwii.init.StatusEffectInit;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class AbstractionInABottleItem extends EmptiableFoodItem {

    public AbstractionInABottleItem(Settings settings) {
        super(settings, 400, Items.GLASS_BOTTLE.getDefaultStack(), 30);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!(entity instanceof LivingEntity living)) return;

        // Always add status effect if selected
        if (selected && !world.isClient) {
            living.addStatusEffect(
                    new StatusEffectInstance(StatusEffectInit.ABSTRACTION_SICKNESS_EFFECT, 200, 0, true, true, true)
            );
        }

        if (world.isClient) {
            ClientWorld clientWorld = (ClientWorld) world;

            // Spawn particles occasionally (10% chance per tick)
            if (world.random.nextFloat() < 0.1f) {
                // Random position around player in a 1 block radius
                double px = living.getX() + (world.random.nextDouble() - 0.5) * 2;
                double py = living.getEyeY() + (world.random.nextDouble() - 0.5); // mid-body
                double pz = living.getZ() + (world.random.nextDouble() - 0.5) * 2;

                // Target = player center
                double targetX = living.getX();
                double targetY = living.getEyeY();
                double targetZ = living.getZ();

                clientWorld.addParticle(
                        ParticleInit.ABSTRACT_PARTICLE,
                        px, py, pz,
                        targetX, targetY, targetZ
                );
            }
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient && user instanceof PlayerEntity player) {
            stack.decrement(1);
            ItemStack bottle = Items.GLASS_BOTTLE.getDefaultStack();
            if (!player.getInventory().insertStack(bottle)) {
                player.dropItem(bottle, false);
            }

            player.damage(DamageTypeInit.of(world, DamageTypeInit.ABSTRACTION), Float.MAX_VALUE);
        }

        return stack.isEmpty() ? ItemStack.EMPTY : stack;
    }
}
