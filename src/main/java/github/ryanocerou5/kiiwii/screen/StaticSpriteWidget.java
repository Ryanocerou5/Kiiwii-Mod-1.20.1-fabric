package github.ryanocerou5.kiiwii.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.IconWidget;
import net.minecraft.util.Identifier;

public class StaticSpriteWidget extends IconWidget {

    private final Identifier TEXTURE;
    private final int u, v;
    private final int texWidth, texHeight;

    public StaticSpriteWidget(int x, int y, int u, int v, int width, int height,
                              Identifier texture, int texWidth, int texHeight) {
        super(x, y, width, height, texture);
        this.u = u;
        this.v = v;
        this.texWidth = texWidth;
        this.texHeight = texHeight;
        this.TEXTURE = texture;
    }

    @Override
    public void renderButton(DrawContext context, int mouseX, int mouseY, float delta) {
        // draw the portion of the texture
        context.drawTexture(this.TEXTURE, getX(), getY(), u, v, width, height, texWidth, texHeight);
    }

    @Override
    protected void appendClickableNarrations(NarrationMessageBuilder builder) {}
}