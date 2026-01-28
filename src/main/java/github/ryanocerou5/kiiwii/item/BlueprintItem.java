package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.screen.BlueprintScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BlueprintItem extends Item {

    public BlueprintItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                    (syncId, inventory, player) -> new BlueprintScreenHandler(syncId, inventory),
                    Text.empty()
            ));
        }

        return TypedActionResult.success(user.getStackInHand(hand), world.isClient());
    }
}
