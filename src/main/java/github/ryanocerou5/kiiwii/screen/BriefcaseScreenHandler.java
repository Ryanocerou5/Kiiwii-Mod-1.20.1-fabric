package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.slot.Slot;

public class BriefcaseScreenHandler extends AbstractItemScreenHandler{
    //---VARIABLES---//
    public static final int INVENTORY_SIZE = 6;

    public BriefcaseScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.BRIEFCASE_SCREEN_HANDLER, syncId, playerInventory, buf, INVENTORY_SIZE);
    }

    public BriefcaseScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int itemSlotIndex) {
        super(ScreenHandlerInit.BRIEFCASE_SCREEN_HANDLER, syncId, playerInventory, stack, INVENTORY_SIZE, itemSlotIndex);
    }

    @Override
    protected void addInventorySlots() {
        int startX = 44;
        int startY = 34;
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                int index = col + row * 3;
                if(row == 0)
                {
                    this.addSlot(new Slot(this, index, startX + col * 25, startY + row * 19));
                }
                else
                {
                    this.addSlot(new Slot(this, index, startX + 14 + col * 24, startY + row * 19));
                }
            }
        }
    }

    @Override
    protected int getPlayerInventoryY() {
        return 107;
    }
}
