package github.ryanocerou5.kiiwii.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EmptiableFoodItem extends AbstractCooldownItem{
    private final ItemStack returnStack;
    private final int eatSpeed;
    public EmptiableFoodItem(Settings settings, int cooldown, ItemStack returnStack, int eatSpeed) {
        super(settings, cooldown);
        this.returnStack = returnStack;
        this.eatSpeed = eatSpeed;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player)
        {
            if (!player.getInventory().insertStack(returnStack)) {
                player.dropItem(returnStack, false);
            }
        }

        return result;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return eatSpeed;
    }
}
