package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LockerScreen extends AbstractScreen<AbstractScreenHandler<LockerBlockEntity>>{
    private static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/locker_gui.png");
    public LockerScreen(AbstractScreenHandler<LockerBlockEntity> handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected Identifier getTexture() {
        return TEXTURE;
    }

    @Override
    protected int getBackgroundWidth() {
        return 176;
    }

    @Override
    protected int getBackgroundHeight() {
        return 196;
    }

    @Override
    protected void init() {
        super.init();

        playerInventoryTitleY = 1000;
    }
}
