package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BlueprintScreen extends AbstractScreen<BlueprintScreenHandler> {
    public static final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/blueprint.png");

    public BlueprintScreen(BlueprintScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected Identifier getTexture() {
        return TEXTURE;
    }

    @Override
    protected int getBackgroundWidth() {
        return 400;
    }

    @Override
    protected int getBackgroundHeight() {
        return 200;
    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {

    }
}

