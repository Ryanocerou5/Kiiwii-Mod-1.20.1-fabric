package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class ExiledZenderRockBricksStairsBlock extends AbstractConvertibleStairsBlock {
    public ExiledZenderRockBricksStairsBlock(BlockState baseBlockState, Settings settings, int conversionDelayTicks) {
        super(baseBlockState, settings, conversionDelayTicks);
    }

    @Override
    protected Block getConvertedBlock() {
        return Blocks.STONE_BRICK_STAIRS;
    }
}
