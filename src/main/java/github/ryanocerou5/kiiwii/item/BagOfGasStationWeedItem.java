package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.ItemInit;
import github.ryanocerou5.kiiwii.screen.SoundboardScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BagOfGasStationWeedItem extends Item {
    public BagOfGasStationWeedItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient())
        {
            stack.decrement(1);

            user.getInventory().insertStack(ItemInit.HALF_FILLED_BAG_OF_GAS_STATION_WEED.getDefaultStack());
            user.getInventory().insertStack(ItemInit.BUD_OF_GAS_STATION_WEED.getDefaultStack());
        }

        return TypedActionResult.success(stack, world.isClient());
    }
}
