package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ExiledZenderRockBricksBlock extends AbstractConvertibleBlock {
    public ExiledZenderRockBricksBlock(Settings settings) {
        super(settings, 200);
    }

    @Override
    protected Block getConvertedBlock() {
        return Blocks.STONE_BRICKS;
    }
}
