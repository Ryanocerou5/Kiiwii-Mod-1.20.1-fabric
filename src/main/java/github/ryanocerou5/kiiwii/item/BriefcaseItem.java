package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.screen.BriefcaseScreenHandler;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;

public class BriefcaseItem extends AbstractInventoryItem<BriefcaseScreenHandler>{
    public BriefcaseItem(Settings settings) {
        super(settings);
    }

    @Override
    protected BriefcaseScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory, ItemStack stack, int slotIndex) {
        return new BriefcaseScreenHandler(syncId, playerInventory, stack, slotIndex);
    }
}
