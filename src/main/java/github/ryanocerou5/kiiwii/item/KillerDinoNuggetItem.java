package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.DamageTypeInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class KillerDinoNuggetItem extends Item {
    public KillerDinoNuggetItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player)
        {
            player.damage(DamageTypeInit.of(world, DamageTypeInit.KILLER_DINO_NUGGET), Float.MAX_VALUE);
        }

        return result;
    }
}
