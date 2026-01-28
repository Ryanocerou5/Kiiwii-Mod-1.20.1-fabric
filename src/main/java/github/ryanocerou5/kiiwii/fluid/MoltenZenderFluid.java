package github.ryanocerou5.kiiwii.fluid;

import github.ryanocerou5.kiiwii.init.FluidInit;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.LavaFluid;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public abstract class MoltenZenderFluid extends LavaFluid {

    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }
    @Override
    public Fluid getStill() {
        return FluidInit.STILL_MOLTEN_ZENDER;
    }

    @Override
    public Fluid getFlowing() {
        return FluidInit.FLOWING_MOLTEN_ZENDER;
    }

    @Override
    public Item getBucketItem() {
        return FluidInit.MOLTEN_ZENDER_BUCKET;
    }

    @Override
    public BlockState toBlockState(FluidState state) {
        return FluidInit.MOLTEN_ZENDER_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public static class Flowing extends MoltenZenderFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

    public static class Still extends MoltenZenderFluid {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }
}