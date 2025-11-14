package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.scoreboard.ScoreboardCriterion;

public class KiiwiiModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WHITE_ROAD_LINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.YELLOW_ROAD_LINE, RenderLayer.getCutout());
    }
}
