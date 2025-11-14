package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ScannerBlock extends AbstractDirectionalBlock{
    //---VARIABLES---//
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(1, 0, 11, 15, 15, 16);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(11, 0, 1, 16, 15, 15);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(1, 0, 0, 15, 15, 5);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(0, 0, 1, 5, 15, 15);
    public ScannerBlock(Settings settings) {
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
