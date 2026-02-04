package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class JointItem extends Item {
    public JointItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack mainStack = user.getStackInHand(hand);
        ItemStack offhandStack = user.getOffHandStack();

        if (!world.isClient() && offhandStack.isOf(Items.FLINT_AND_STEEL))
        {
            mainStack.decrement(1);
            offhandStack.decrement(1);

            user.getInventory().insertStack(ItemInit.LIT_JOINT.getDefaultStack());
        }

        return TypedActionResult.success(mainStack, world.isClient());
    }
}
