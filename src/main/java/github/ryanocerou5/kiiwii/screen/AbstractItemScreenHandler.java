package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.blockentity.ImplementedInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.collection.DefaultedList;

public abstract class AbstractItemScreenHandler extends ScreenHandler implements ImplementedInventory {
    protected final DefaultedList<ItemStack> items;
    protected final ItemStack stack;
    protected final int inventorySize;
    protected abstract void addInventorySlots();

    public AbstractItemScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, PacketByteBuf buf, int inventorySize) {
        super(type, syncId);
        this.stack = buf.readItemStack();
        this.inventorySize = inventorySize;
        this.items = DefaultedList.ofSize(inventorySize, ItemStack.EMPTY);

        readFromStack();
        addInventorySlots();
        addPlayerSlots(playerInventory);
    }

    public AbstractItemScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ItemStack stack, int inventorySize) {
        super(type, syncId);
        this.stack = stack;
        this.inventorySize = inventorySize;
        this.items = DefaultedList.ofSize(inventorySize, ItemStack.EMPTY);

        readFromStack();
        addInventorySlots();
        addPlayerSlots(playerInventory);
    }

    protected boolean enablePlayerInventory()
    {
        return true;
    }

    protected int getPlayerInventoryX()
    {
        return 9;
    }
    protected int getPlayerInventoryY()
    {
        return 95;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if(ItemStack.areEqual(originalStack, stack))
            {
                return ItemStack.EMPTY;
            }
            if (invSlot < inventorySize) {
                if (!this.insertItem(originalStack, inventorySize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, inventorySize, false)) {
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

    protected void readFromStack() {
        NbtCompound root = stack.getNbt();
        if (root != null && root.contains("inventory")) {
            Inventories.readNbt(root.getCompound("inventory"), items);
        }
    }

    protected void writeToStack() {
        if (stack.getItem() == null) return;
        NbtCompound root = stack.getOrCreateNbt();
        NbtCompound invTag = new NbtCompound();
        Inventories.writeNbt(invTag, items);
        root.put("inventory", invTag);
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        if (!player.getWorld().isClient) {
            writeToStack();
        }
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    protected boolean insertItem(ItemStack stack, int startIndex, int endIndex, boolean fromLast) {
        if (stack.isOf(this.stack.getItem()) && ItemStack.areEqual(stack, this.stack)) {
            return false; // prevent putting the item inside itself
        }
        return super.insertItem(stack, startIndex, endIndex, fromLast);
    }

    protected void addPlayerSlots(PlayerInventory playerInventory) {
        if(!enablePlayerInventory())
        {
            return;
        }
        // --- Player inventory slots ---
        int startX = getPlayerInventoryX();
        int startY = getPlayerInventoryY();
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9,
                        startX + col * 18, startY + row * 18));

        // --- Hotbar slots ---
        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInventory, col, startX + col * 18, startY + 58));
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
