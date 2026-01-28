package github.ryanocerou5.kiiwii.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractConvertibleWallBlock extends WallBlock {
    private final int conversionDelayTicks;

    public AbstractConvertibleWallBlock(Settings settings, int conversionDelayTicks) {
        super(settings);
        this.conversionDelayTicks = conversionDelayTicks;
    }

    protected abstract Block getConvertedBlock();

    protected boolean isTouchingWater(BlockState state, WorldView world, BlockPos pos) {
        if (state.contains(Properties.WATERLOGGED) && state.get(Properties.WATERLOGGED)) {
            return true;
        }

        for (Direction dir : Direction.values()) {
            BlockPos offset = pos.offset(dir);
            if (world.getFluidState(offset).isIn(FluidTags.WATER)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient && isTouchingWater(state, world, pos)) {
            world.scheduleBlockTick(pos, this, conversionDelayTicks);
        }
        super.onPlaced(world, pos, state, placer, itemStack);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClient && isTouchingWater(state, world, pos)) {
            world.scheduleBlockTick(pos, this, conversionDelayTicks);
        }
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    private static <T extends Comparable<T>> BlockState setPropertySafely(BlockState target, Property<T> property, BlockState source) {
        return target.with(property, (T) source.get(property));
    }
    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (isTouchingWater(state, world, pos)) {
            BlockState newState = getConvertedBlock().getDefaultState();

            // Copy all properties that exist in both states
            for (Property<?> property : state.getProperties()) {
                if (newState.contains(property)) {
                    newState = setPropertySafely(newState, property, state);
                }
            }

            world.setBlockState(pos, newState);
        }
    }
}
