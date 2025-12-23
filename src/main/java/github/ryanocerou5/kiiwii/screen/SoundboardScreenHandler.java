package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;

public class SoundboardScreenHandler extends ScreenHandler {
    public SoundboardScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ScreenHandlerInit.SOUNDBOARD_SCREEN_HANDLER, syncId);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
