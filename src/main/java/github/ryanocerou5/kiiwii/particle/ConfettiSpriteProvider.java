package github.ryanocerou5.kiiwii.particle;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

import java.util.List;
import java.util.function.Function;

public class ConfettiSpriteProvider implements SpriteProvider {
    Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.PARTICLE_ATLAS_TEXTURE);
    private final List<Sprite> sprites = List.of(
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/blue_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/cyan_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/indigo_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/lime_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/magenta_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/orange_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/pink_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/purple_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/red_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/teal_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/violet_confetti")),
            atlas.apply(new Identifier(KiiwiiMod.MOD_ID, "particle/yellow_confetti"))
    );

    private final java.util.Random random = new java.util.Random();
    @Override
    public Sprite getSprite(int age, int maxAge) {
        return sprites.get(random.nextInt(sprites.size()));
    }

    @Override
    public Sprite getSprite(Random random) {
        return sprites.get(random.nextInt(sprites.size()));
    }
}
