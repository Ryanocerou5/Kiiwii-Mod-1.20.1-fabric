package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.screen.PillBottleScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PillBottleItem extends AbstractInventoryItem<PillBottleScreenHandler> {

    public PillBottleItem(Settings settings) {
        super(settings);
    }

    @Override
    protected PillBottleScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int slotIndex) {
        return new PillBottleScreenHandler(syncId, playerInventory, stack, slotIndex);
    }
}
