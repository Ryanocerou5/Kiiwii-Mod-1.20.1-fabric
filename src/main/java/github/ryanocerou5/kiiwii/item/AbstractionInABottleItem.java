package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.StatusEffectInit;
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
        if (world.isClient) return;

        if (selected) {
            living.addStatusEffect(
                    new StatusEffectInstance(StatusEffectInit.ABSTRACTION_SICKNESS_EFFECT, 200, 0, true, true, true)
            );
        }
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient && user instanceof PlayerEntity player) {
            // Give status effect
            player.addStatusEffect(
                    new StatusEffectInstance(StatusEffectInit.ABSTRACTION_SICKNESS_EFFECT, 1200, 0, true, true, true)
            );

            // Handle return item
            ItemStack returnStackCopy = returnStack.copy(); // important!
            stack.decrement(1); // consume one from the used stack

            if (!player.getInventory().insertStack(returnStackCopy)) {
                player.dropItem(returnStackCopy, false);
            }
        }

        // Return the stack after decrement
        return stack.isEmpty() ? ItemStack.EMPTY : stack;
    }
}
