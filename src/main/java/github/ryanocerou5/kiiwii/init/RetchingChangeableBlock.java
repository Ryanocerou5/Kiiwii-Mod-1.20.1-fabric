package github.ryanocerou5.kiiwii.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RetchingChangeableBlock extends PillarBlock {
    public RetchingChangeableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isClient()) return;

        Direction dir = Direction.fromVector(
                sourcePos.getX() - pos.getX(),
                sourcePos.getY() - pos.getY(),
                sourcePos.getZ() - pos.getZ()
        );

        if (dir == null) return;

        Direction.Axis axis = (state.get(PillarBlock.AXIS));

        if (dir.getAxis() != axis) return;

        world.scheduleBlockTick(pos, this, 3);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        for (Direction dir : Direction.values()) {
            BlockPos neighborPos = pos.offset(dir); // get neighbor in that direction
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.isOf(BlockInit.RETCHING_FOUNDATION) || neighborState.isOf(BlockInit.RETCHING_PILLAR)) {
                if (state.isOf(BlockInit.RETCHING_PILLAR_SCRAPS)) {
                    world.setBlockState(pos,
                            BlockInit.RETCHING_PILLAR.getDefaultState()
                                    .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                            3
                    );
                }
                if (state.isOf(BlockInit.RETCHING_CONNECTOR_SCRAPS)) {
                    world.setBlockState(pos,
                            BlockInit.RETCHING_CONNECTOR.getDefaultState()
                                    .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                            3
                    );
                }
            } else if (neighborState.isOf(BlockInit.RETCHING_FOUNDATION_SCRAPS) || neighborState.isOf(BlockInit.RETCHING_PILLAR_SCRAPS)) {
                if (state.isOf(BlockInit.RETCHING_PILLAR)) {
                    world.setBlockState(pos,
                            BlockInit.RETCHING_PILLAR_SCRAPS.getDefaultState()
                                    .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                            3
                    );
                }
                if (state.isOf(BlockInit.RETCHING_CONNECTOR)) {
                    world.setBlockState(pos,
                            BlockInit.RETCHING_CONNECTOR_SCRAPS.getDefaultState()
                                    .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                            3
                    );
                }
            }
        }
        super.scheduledTick(state, world, pos, random);
    }
}
