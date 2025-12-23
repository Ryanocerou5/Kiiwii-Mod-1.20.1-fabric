package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.PressableWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SoundboardButton extends PressableWidget {
    private final Identifier TEXTURE = new Identifier(KiiwiiMod.MOD_ID, "textures/screens/soundboard.png");
    private final int u, v, hoverU, hoverV;
    private final Runnable pressAction;

    public SoundboardButton(int x, int y, int u, int v, int hoverU, int hoverV, Runnable pressAction) {
        super(x, y, 16, 16, Text.empty());
        this.u = u;
        this.v = v;
        this.hoverU = hoverU;
        this.hoverV = hoverV;
        this.pressAction = pressAction;
    }

    @Override
    protected void renderButton(DrawContext context, int mouseX, int mouseY, float delta) {
        int drawU = this.isHovered() ? hoverU : u;
        int drawV = this.isHovered() ? hoverV : v;

        context.drawTexture(TEXTURE, getX(), getY(), drawU, drawV, 16, 16, 128, 128);
    }

    @Override
    public void onPress() {
        if (pressAction != null) {
            pressAction.run();
        }
    }

    @Override
    protected void appendClickableNarrations(NarrationMessageBuilder builder) {

    }
}
