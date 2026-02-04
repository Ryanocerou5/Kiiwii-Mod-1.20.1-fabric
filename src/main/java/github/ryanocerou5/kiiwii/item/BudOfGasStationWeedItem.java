package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BudOfGasStationWeedItem extends Item {
    public BudOfGasStationWeedItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack mainStack = user.getStackInHand(hand);
        ItemStack offhandStack = user.getOffHandStack();

        if (!world.isClient() && offhandStack.isOf(ItemInit.ROLLING_PAPER))
        {
            mainStack.decrement(1);
            offhandStack.decrement(1);

            user.getInventory().insertStack(ItemInit.JOINT.getDefaultStack());
        }

        return TypedActionResult.success(mainStack, world.isClient());
    }
}
