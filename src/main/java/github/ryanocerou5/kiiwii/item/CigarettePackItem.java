package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.screen.CigarettePackScreenHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public class CigarettePackItem extends AbstractInventoryItem<CigarettePackScreenHandler>{
    public CigarettePackItem(Settings settings) {
        super(settings);
    }

    @Override
    protected CigarettePackScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int slotIndex) {
        return new CigarettePackScreenHandler(syncId, playerInventory, stack, slotIndex);
    }
}
