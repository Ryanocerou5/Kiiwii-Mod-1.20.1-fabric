package github.ryanocerou5.kiiwii.screen;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;

public abstract class AbstractScreenHandler<T extends BlockEntity & Inventory> extends ScreenHandler {
    protected int getPlayerInventoryYOffset()
    {
        return 84;
    }
    private final Inventory inventory;
    public final T blockEntity;

    protected abstract void addSlots(Inventory inventory);

    public AbstractScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, PacketByteBuf buf, Class<T> beClass)
    {
        this(type, syncId, playerInventory, getBlockEntityFromBuf(playerInventory, buf, beClass));
    }

    private static <T extends BlockEntity> T getBlockEntityFromBuf(PlayerInventory playerInventory, PacketByteBuf buf, Class<T> beClass)
    {
        BlockPos pos = buf.readBlockPos();
        BlockEntity be = playerInventory.player.getWorld().getBlockEntity(pos);

        if (beClass.isInstance(be))
        {
            return beClass.cast(be);
        } else
        {
            throw new IllegalStateException("Expected block entity of type " + beClass.getSimpleName() +
                    " but found " + (be != null ? be.getClass().getSimpleName() : "null"));
        }
    }
    protected AbstractScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, T blockEntity)
    {
        super(type, syncId);
        this.inventory = blockEntity;
        this.blockEntity = blockEntity;

        inventory.onOpen(playerInventory.player);

        addSlots(inventory);
        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, getPlayerInventoryYOffset() + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, getPlayerInventoryYOffset() + 58));
        }
    }
}
