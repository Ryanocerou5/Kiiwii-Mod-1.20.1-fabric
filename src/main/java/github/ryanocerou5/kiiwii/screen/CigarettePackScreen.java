package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CigarettePackScreen extends AbstractScreen<CigarettePackScreenHandler>{
    public static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/cigarette_box_ui.png");

    public CigarettePackScreen(CigarettePackScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.titleY = 1000;
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
