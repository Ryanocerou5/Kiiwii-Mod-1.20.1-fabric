package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PillBottleScreen extends AbstractScreen<PillBottleScreenHandler> {
    public static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/pill_bottle_inventory.png");
    @Override
    protected Identifier getTexture() {
        return TEXTURE;
    }

    @Override
    protected int getBackgroundWidth() {
        return 178;
    }

    @Override
    protected int getBackgroundHeight() {
        return 176;
    }
    public PillBottleScreen(PillBottleScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }
}
