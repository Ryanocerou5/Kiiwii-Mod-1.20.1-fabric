package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GarfieldPlushBlock extends AbstractDirectionalBlock{
    //---VARIABLES---//
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(3, 0, 3, 14, 15, 14);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(3, 0, 2, 14, 15, 13);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(2, 0, 2, 13, 15, 13);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(2, 0, 3, 13, 15, 14);
    public GarfieldPlushBlock(Settings settings) {
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
