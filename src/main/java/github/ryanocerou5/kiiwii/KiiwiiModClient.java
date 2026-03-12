package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.armor.*;
import github.ryanocerou5.kiiwii.init.*;
import github.ryanocerou5.kiiwii.network.ClientKeyInputHandler;
import github.ryanocerou5.kiiwii.network.ClientPacketHandler;
import github.ryanocerou5.kiiwii.renderer.ModArmorRenderer;
import github.ryanocerou5.kiiwii.screen.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class KiiwiiModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WHITE_ROAD_LINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.YELLOW_ROAD_LINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ZENDER_SPORES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DEAD_ZENDER_SPORES, RenderLayer.getCutout());

        HandledScreens.register(ScreenHandlerInit.LOCKER_SCREEN_HANDLER, LockerScreen::new);
        HandledScreens.register(ScreenHandlerInit.BETA_CHEST_SCREEN_HANDLER, BetaChestScreen::new);
        HandledScreens.register(ScreenHandlerInit.CARVED_OAK_LOG_SCREEN_HANDLER, CarvedOakLogScreen::new);
        HandledScreens.register(ScreenHandlerInit.PILL_BOTTLE_SCREEN_HANDLER, PillBottleScreen::new);
        HandledScreens.register(ScreenHandlerInit.CIGARETTE_PACK_SCREEN_HANDLER, CigarettePackScreen::new);
        HandledScreens.register(ScreenHandlerInit.BRIEFCASE_SCREEN_HANDLER, BriefcaseScreen::new);
        HandledScreens.register(ScreenHandlerInit.SOUNDBOARD_SCREEN_HANDLER, SoundboardScreen::new);
        HandledScreens.register(ScreenHandlerInit.BLUEPRINT_SCREEN_HANDLER, BlueprintScreen::new);

        ParticlesClientInit.register();

        FluidRenderHandlerRegistry.INSTANCE.register(FluidInit.STILL_MOLTEN_ZENDER, FluidInit.FLOWING_MOLTEN_ZENDER,
                new SimpleFluidRenderHandler(
                        new Identifier("kiiwii:block/molten_zender_still"),
                        new Identifier("kiiwii:block/molten_zender_flow")
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                FluidInit.STILL_MOLTEN_ZENDER, FluidInit.FLOWING_MOLTEN_ZENDER);

        registerZenderTint();
        ClientPacketHandler.register();
        ClientKeyInputHandler.register();
        KeybindInit.register();

        EntityModelLayerRegistry.registerModelLayer(
                CrownHelmetItem.MODEL_LAYER,
                CrownHelmetModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                CremMaskItem.MODEL_LAYER,
                CremMaskModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                ElfEarsItem.MODEL_LAYER,
                ElfEarsModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                WinsweepMaskItem.MODEL_LAYER,
                WinsweepMaskModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                AcesHatItem.MODEL_LAYER,
                AcesHatModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                KrustyKrabHatItem.MODEL_LAYER,
                KrustyKrabHatModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                UfoHatItem.MODEL_LAYER,
                UfoHatModel::getTexturedModelData
        );
        EntityModelLayerRegistry.registerModelLayer(
                YeshGlassesItem.MODEL_LAYER,
                YeshGlassesModel::getTexturedModelData
        );

        MinecraftClient.getInstance().execute(() -> {
            System.out.println("Registering ModArmorRenderer for CROWN");
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.CROWN
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.CREMS_MASK
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.ELF_EARS
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.WINSWEEPS_MASK
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.ACES_HAT
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.KRUSTY_KRAB_HAT
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.UFO_HELMET
            );
            ArmorRenderer.register(
                    new ModArmorRenderer(MinecraftClient.getInstance().getEntityModelLoader()),
                    ItemInit.GLASSES
            );
        });
    }

    private void registerZenderTint() {
        HudRenderCallback.EVENT.register((ctx, tickDelta) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            PlayerEntity player = client.player;
            if (player == null) return;

            StatusEffectInstance effect = player.getStatusEffect(StatusEffectInit.ZENDER_EFFECT);
            if (effect == null) return;

            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();
            int color = 0x44660088;

            ctx.fill(0, 0, width, height, color);
        });
    }
}
