package github.ryanocerou5.kiiwii.blockentity;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.init.BlockEntityInit;
import github.ryanocerou5.kiiwii.screen.CarvedOakLogScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class CarvedOakLogBlockEntity extends AbstractInventoryBlockEntity{
    public static final int SIZE = 3;
    public CarvedOakLogBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.CARVED_OAK_LOG_BLOCK_ENTITY, pos, state, SIZE);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(KiiwiiMod.MOD_ID + ".carvedOakLogDisplayName");
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new CarvedOakLogScreenHandler(syncId, playerInventory, this);
    }
}
