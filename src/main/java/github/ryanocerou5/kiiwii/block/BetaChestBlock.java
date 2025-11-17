package github.ryanocerou5.kiiwii.block;

import github.ryanocerou5.kiiwii.blockentity.BetaChestBlockEntity;
import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
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

public class BetaChestBlock extends AbstractInventoryBlock{
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public BetaChestBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected BlockEntity createInventoryBlockEntity(BlockPos pos, BlockState state) {
        return new BetaChestBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void scatterItems(World world, BlockPos pos) {
        BlockEntity be = world.getBlockEntity(pos);
        if (be instanceof BetaChestBlockEntity betaChestBE)
        {
            ItemScatterer.spawn(world, pos, betaChestBE.getItems());
        }
    }
}
