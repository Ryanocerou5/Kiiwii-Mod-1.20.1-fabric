package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.blockentity.BetaChestBlockEntity;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;

public class BetaChestScreenHandler extends AbstractScreenHandler<BetaChestBlockEntity>{
    public BetaChestScreenHandler(int syncId, PlayerInventory playerInventory, PacketByteBuf buf) {
        super(ScreenHandlerInit.BETA_CHEST_SCREEN_HANDLER, syncId, playerInventory, buf, BetaChestBlockEntity.class);
    }

    public BetaChestScreenHandler(int syncId, PlayerInventory playerInventory, BetaChestBlockEntity blockEntity) {
        super(ScreenHandlerInit.BETA_CHEST_SCREEN_HANDLER, syncId, playerInventory, blockEntity);
    }

    @Override
    protected void addSlots(Inventory inventory) {
        int index = 0;
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                this.addSlot(new Slot(inventory, index++, 43 + x * 18, 17 + y * 18));
            }
        }
    }
}
