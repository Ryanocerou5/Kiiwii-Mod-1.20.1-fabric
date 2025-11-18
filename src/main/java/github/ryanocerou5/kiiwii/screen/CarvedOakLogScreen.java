package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.blockentity.CarvedOakLogBlockEntity;
import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CarvedOakLogScreen extends AbstractScreen<AbstractScreenHandler<CarvedOakLogBlockEntity>>{
    private static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/carved_oak_log_gui.png");
    public CarvedOakLogScreen(AbstractScreenHandler<CarvedOakLogBlockEntity> handler, PlayerInventory inventory, Text title) {
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
        return 166;
    }
}
