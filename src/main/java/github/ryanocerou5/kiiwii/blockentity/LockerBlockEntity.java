package github.ryanocerou5.kiiwii.blockentity;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.init.BlockEntityInit;
import github.ryanocerou5.kiiwii.screen.LockerScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class LockerBlockEntity extends AbstractInventoryBlockEntity{
    public static final int SIZE = 25;
    public LockerBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.LOCKER_BLOCK_ENTITY, pos, state, SIZE);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(KiiwiiMod.MOD_ID + ".lockerDisplayName");
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new LockerScreenHandler(syncId, playerInventory, this);
    }
}
