package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.SoundEventInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FlipPhoneItem extends AbstractCooldownItem {
    public FlipPhoneItem(Settings settings) {
        super(settings, 200);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        TypedActionResult<ItemStack> result = super.use(world, user, hand);

        if (!world.isClient) {
            user.playSound(
                    SoundEventInit.NEW_PHONE_SOUND_1,
                    SoundCategory.PLAYERS,
                    1.0f,
                    1.0f
            );
        }

        return result;
    }
}
