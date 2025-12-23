package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.screen.SoundboardScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SoundboardItem extends Item {
    public SoundboardItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient())
        {
            user.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                    (syncId, playerInventory, player) -> new SoundboardScreenHandler(syncId, playerInventory),
                    Text.literal("Soundboard")
            ));
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
