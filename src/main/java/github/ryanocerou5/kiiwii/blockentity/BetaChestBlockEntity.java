package github.ryanocerou5.kiiwii.blockentity;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.init.BlockEntityInit;
import github.ryanocerou5.kiiwii.screen.BetaChestScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class BetaChestBlockEntity extends AbstractInventoryBlockEntity{
    public static final int SIZE = 27;
    public BetaChestBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.BETA_CHEST_BLOCK_ENTITY, pos, state, SIZE);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(KiiwiiMod.MOD_ID + ".betaChestDisplayName");
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new BetaChestScreenHandler(syncId, playerInventory, this);
    }
}
