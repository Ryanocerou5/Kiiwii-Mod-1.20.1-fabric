package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.blockentity.CarvedOakLogBlockEntity;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.slot.Slot;

public class CarvedOakLogScreenHandler extends AbstractScreenHandler<CarvedOakLogBlockEntity>{
    public CarvedOakLogScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.CARVED_OAK_LOG_SCREEN_HANDLER, syncId, playerInventory, buf, CarvedOakLogBlockEntity.class);
    }

    public CarvedOakLogScreenHandler(int syncId, PlayerInventory playerInventory, CarvedOakLogBlockEntity blockEntity) {
        super(ScreenHandlerInit.CARVED_OAK_LOG_SCREEN_HANDLER, syncId, playerInventory, blockEntity);
    }

    @Override
    protected void addSlots(Inventory inventory) {
        int index = 0;
            for (int x = 0; x < 3; x++) {
                this.addSlot(new Slot(inventory, index++, 61 + x * 18, 39));
        }

    }
}
