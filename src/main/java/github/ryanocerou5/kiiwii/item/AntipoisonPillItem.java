package github.ryanocerou5.kiiwii.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AntipoisonPillItem extends AbstractPillItem{
    public AntipoisonPillItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player)
        {
            player.removeStatusEffect(StatusEffects.POISON);
            player.removeStatusEffect(StatusEffects.WITHER);
        }

        return result;
    }
}
