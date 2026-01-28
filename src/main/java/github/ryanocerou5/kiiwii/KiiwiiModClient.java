package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.init.BlockInit;
import github.ryanocerou5.kiiwii.init.FluidInit;
import github.ryanocerou5.kiiwii.init.ParticlesClientInit;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import github.ryanocerou5.kiiwii.screen.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
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
    }
}
