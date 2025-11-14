package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ZenderCurtainBlock extends AbstractDirectionalBlock{
    //---VARIABLES---//
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0, 0, 6, 16, 16, 10);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(6, 0, 0, 10, 16, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0, 0, 6, 16, 16, 10);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(6, 0, 0, 10, 16, 16);
    public ZenderCurtainBlock(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING))
        {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }
}
