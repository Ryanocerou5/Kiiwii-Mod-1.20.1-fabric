package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.init.ItemInit;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.slot.Slot;

public class CigarettePackScreenHandler extends AbstractItemScreenHandler{
    //---VARIABLES---//
    public static final int INVENTORY_SIZE = 10;
    public CigarettePackScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.CIGARETTE_PACK_SCREEN_HANDLER, syncId, playerInventory, buf, INVENTORY_SIZE);
    }

    public CigarettePackScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int itemSlotIndex) {
        super(ScreenHandlerInit.CIGARETTE_PACK_SCREEN_HANDLER, syncId, playerInventory, stack, INVENTORY_SIZE, itemSlotIndex);
    }

    @Override
    protected void addInventorySlots() {
        int startX = 43;
        int startY = 8;
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                int index = col + row * 3;
                this.addSlot(new Slot(this, index, startX + col * 18, startY + row * 18));
            }
        }
    }

    @Override
    protected int getPlayerInventoryY() {
        return 84;
    }
}
