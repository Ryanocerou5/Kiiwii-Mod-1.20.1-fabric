package github.ryanocerou5.kiiwii.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.function.Function;

public class AbstractCrossBlock extends AbstractDirectionalBlock{

    //---VARIABLES---//
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(3, 0, 0, 13, 14, 4);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(0, 0, 3, 4, 14, 13);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(3, 0, 12, 13, 14, 16);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(12, 0, 3, 16, 14, 13);

    public AbstractCrossBlock(Settings settings) {
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
