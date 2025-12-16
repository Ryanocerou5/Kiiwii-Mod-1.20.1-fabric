package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.init.BlockInit;
import github.ryanocerou5.kiiwii.init.ScreenHandlerInit;
import github.ryanocerou5.kiiwii.screen.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

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
    }
}
