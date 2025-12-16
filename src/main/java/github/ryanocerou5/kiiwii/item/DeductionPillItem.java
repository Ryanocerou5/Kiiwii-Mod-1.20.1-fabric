package github.ryanocerou5.kiiwii.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class DeductionPillItem extends AbstractPillItem {
    public DeductionPillItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result =  super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player) {
            int levels = player.experienceLevel;

            if (levels <= 0)
            {
                player.sendMessage(
                        Text.literal("You do not meet the required amount of experience levels to use this!"),
                        true
                );

                return stack;
            }

            if (levels > 0)
            {
                player.addExperienceLevels(-levels);

                ItemStack bottle = new ItemStack(Items.EXPERIENCE_BOTTLE);

                for (int i = 0; i < levels; i++)
                {
                    if (!player.getInventory().insertStack(bottle.copy()))
                    {
                        player.dropItem(bottle.copy(), false);
                    }
                }
            }

        }
        return result;
    }
}
