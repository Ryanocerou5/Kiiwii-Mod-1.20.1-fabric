package github.ryanocerou5.kiiwii.screen;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SoundboardScreen extends Screen implements ScreenHandlerProvider<SoundboardScreenHandler> {

    private final SoundboardScreenHandler handler;
    private final PlayerInventory playerInventory;

    public SoundboardScreen(SoundboardScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(title);
        this.handler = handler;
        this.playerInventory = playerInventory;
    }

    @Override
    protected void init() {
        super.init();

        int buttonWidth = 16;
        int buttonHeight = 16;
        int centerX = (this.width - buttonWidth) / 2;
        int centerY = (this.height - buttonHeight) / 2;

        addDrawableChild(new StaticSpriteWidget(
                centerX, centerY, 112, 112, 16, 16, new Identifier(KiiwiiMod.MOD_ID, "textures/screens/soundboard.png"), 128, 128
        ));

        addDrawableChild(new SoundboardButton(
                centerX, centerY - 64, 64, 16, 80, 16, () -> playSoundboardSound(0)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 64, centerY - 48, 64, 32, 80, 32, () -> playSoundboardSound(1)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 32, centerY - 48,  32, 32, 48, 32, () -> playSoundboardSound(2)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 32, centerY - 48,  32, 64, 48, 64, () -> playSoundboardSound(3)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 64, centerY - 48,  96, 32, 112, 32, () -> playSoundboardSound(4)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 80, centerY - 16,  96, 0, 112, 0, () -> playSoundboardSound(5)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 48, centerY - 16,  0, 16, 16, 16, () -> playSoundboardSound(6)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 48, centerY - 16,  32, 16, 48, 16, () -> playSoundboardSound(7)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 80, centerY - 16,  32, 0, 48, 0, () -> playSoundboardSound(8)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 80, centerY + 16,  64, 0, 80, 0, () -> playSoundboardSound(9)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 48, centerY + 16,  0, 32, 16, 32, () -> playSoundboardSound(10)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 48, centerY + 16,  96, 48, 112, 48, () -> playSoundboardSound(11)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 80, centerY + 16,  96, 16, 112, 16, () -> playSoundboardSound(12)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 64, centerY + 48, 0, 0, 16, 0, () -> playSoundboardSound(13)
        ));

        addDrawableChild(new SoundboardButton(
                centerX - 32, centerY + 48,  0, 48, 16, 48, () -> playSoundboardSound(14)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 32, centerY + 48,  64, 48, 80, 48, () -> playSoundboardSound(15)
        ));

        addDrawableChild(new SoundboardButton(
                centerX + 64, centerY + 48,  0, 64, 16, 64, () -> playSoundboardSound(16)
        ));

        addDrawableChild(new SoundboardButton(
                centerX, centerY + 64, 32, 48, 48, 48, () -> playSoundboardSound(17)
        ));
    }

    private void playSoundboardSound(int soundId) {
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeInt(soundId);
        ClientPlayNetworking.send(new Identifier(KiiwiiMod.MOD_ID, "soundboard_sound"), buf);
        MinecraftClient.getInstance().setScreen(null);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY , delta);
    }

    @Override
    public SoundboardScreenHandler getScreenHandler() {
        return this.handler;
    }
}
