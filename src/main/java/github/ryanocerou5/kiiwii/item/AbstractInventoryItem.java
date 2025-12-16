package github.ryanocerou5.kiiwii.item;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractInventoryItem<T extends ScreenHandler> extends Item {
    public AbstractInventoryItem(Settings settings) {
        super(settings);
    }

    /**
     * Must return a new instance of the screen handler for this item.
     * This is what subclasses implement to specify their inventory type.
     */
    protected abstract T createScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int slotIndex);

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient) {
            int slotIndex = getSlotIndex(user, hand);

            user.openHandledScreen(new ExtendedScreenHandlerFactory() {
                @Override
                public void writeScreenOpeningData(ServerPlayerEntity serverPlayerEntity, PacketByteBuf buf) {
                    buf.writeItemStack(stack); // send the item to the client
                    buf.writeInt(slotIndex);
                }

                @Override
                public Text getDisplayName() {
                    return Text.translatable(stack.getTranslationKey());
                }

                @Override
                public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
                    return createScreenHandler(syncId, playerInventory, stack, slotIndex);
                }
            });
        }

        return TypedActionResult.success(stack, world.isClient());
    }

    public static int getSlotIndex(PlayerEntity user, Hand hand)
    {
        PlayerInventory inv = user.getInventory();

        if (hand == Hand.MAIN_HAND)
        {
            return inv.selectedSlot;
        }
        else
        {
            return 40;
        }
    }
}
