package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.SoundEventInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class AbstractCigaretteItem extends Item {
    public AbstractCigaretteItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (user instanceof PlayerEntity player) {

            float random = player.getRandom().nextFloat();

            if (random < 0.5F) {
                SoundEvent[] coughSounds = new SoundEvent[]{
                        SoundEventInit.DRY_COUGH,
                        SoundEventInit.MUTED_COUGH,
                        SoundEventInit.CRAZY_COUGH
                };
                SoundEvent chosen = coughSounds[player.getRandom().nextInt(coughSounds.length)];

                if (player.getWorld().isClient()) {
                    player.playSound(chosen, 1.0f, 1.0f);
                }
            }
        }

        return result;
    }
}
