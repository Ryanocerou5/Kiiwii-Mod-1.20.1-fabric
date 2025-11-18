package github.ryanocerou5.kiiwii.block;

import github.ryanocerou5.kiiwii.blockentity.CarvedOakLogBlockEntity;
import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CarvedOakLogBlock extends AbstractInventoryBlock{
    public static final DirectionProperty FACING = FacingBlock.FACING;
    public CarvedOakLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerLookDirection().getOpposite());
    }

    @Override
    protected BlockEntity createInventoryBlockEntity(BlockPos pos, BlockState state) {
        return new CarvedOakLogBlockEntity(pos, state);
    }

    @Override
    protected void scatterItems(World world, BlockPos pos) {
        BlockEntity be = world.getBlockEntity(pos);
        if (be instanceof CarvedOakLogBlockEntity carvedOakLogBE)
        {
            ItemScatterer.spawn(world, pos, carvedOakLogBE.getItems());
        }
    }
}
