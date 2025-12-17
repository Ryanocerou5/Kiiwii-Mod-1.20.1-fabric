package github.ryanocerou5.kiiwii.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AbstractCooldownItem extends Item {
    private final int cooldown;
    public AbstractCooldownItem(Settings settings, int cooldown) {
        super(settings);
        this.cooldown = cooldown;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (user instanceof PlayerEntity player)
        {
            player.getItemCooldownManager().set(this, cooldown);
        }

        return result;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getItemCooldownManager().isCoolingDown(this))
        {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }

        return super.use(world, user, hand);
    }
}
