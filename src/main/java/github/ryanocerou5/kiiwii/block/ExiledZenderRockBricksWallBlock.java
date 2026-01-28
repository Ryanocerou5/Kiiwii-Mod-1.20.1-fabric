package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ExiledZenderRockBricksWallBlock extends AbstractConvertibleWallBlock {
    public ExiledZenderRockBricksWallBlock(Settings settings, int conversionDelayTicks) {
        super(settings, conversionDelayTicks);
    }

    @Override
    protected Block getConvertedBlock() {
        return Blocks.STONE_BRICK_WALL;
    }
}
