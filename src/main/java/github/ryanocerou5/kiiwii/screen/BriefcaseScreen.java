package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BriefcaseScreen extends AbstractScreen<BriefcaseScreenHandler>{
    public static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/briefcase_ui.png");
    public BriefcaseScreen(BriefcaseScreenHandler handler, PlayerInventory inventory, Text title) {
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
        return 190;
    }

    @Override
    protected void init() {
        playerInventoryTitleY = 92;
        super.init();
    }
}
