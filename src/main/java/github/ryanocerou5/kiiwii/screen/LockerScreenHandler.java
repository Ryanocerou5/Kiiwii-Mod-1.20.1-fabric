package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.slot.Slot;

public class LockerScreenHandler extends AbstractScreenHandler<LockerBlockEntity>{
    public LockerScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.LOCKER_SCREEN_HANDLER, syncId, playerInventory, buf, LockerBlockEntity.class);
    }

    public LockerScreenHandler(int syncId, PlayerInventory playerInventory, LockerBlockEntity blockEntity) {
        super(ScreenHandlerInit.LOCKER_SCREEN_HANDLER, syncId, playerInventory, blockEntity);
    }

    @Override
    protected int getPlayerInventoryYOffset() {
        return 114;
    }

    @Override
    protected void addSlots(Inventory inventory) {
        int index = 0;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                this.addSlot(new Slot(inventory, index++, 43 + x * 18, 17 + y * 18));
            }
        }
    }
}
