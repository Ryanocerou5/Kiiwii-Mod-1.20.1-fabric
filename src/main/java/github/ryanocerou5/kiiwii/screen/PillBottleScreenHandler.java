package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.init.ItemInit;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.slot.Slot;

public class PillBottleScreenHandler extends AbstractItemScreenHandler {
    //---VARIABLES---//
    public static final int INVENTORY_SIZE = 9;

    public PillBottleScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.PILL_BOTTLE_SCREEN_HANDLER, syncId, playerInventory, buf, INVENTORY_SIZE);
    }

    public PillBottleScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack) {
        super(ScreenHandlerInit.PILL_BOTTLE_SCREEN_HANDLER, syncId, playerInventory, stack, INVENTORY_SIZE);
    }

    @Override
    protected void addInventorySlots() {
        int startX = 62;
        int startY = 28;
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                int index = col + row * 3;
                this.addSlot(new Slot(this, index, startX + col * 18, startY + row * 18)
                {
                    @Override
                    public boolean canInsert(ItemStack stack) {
                        return !ItemStack.areEqual(stack, ItemInit.PILL_BOTTLE.getDefaultStack());
                    }
                });
            }
        }
    }
}
