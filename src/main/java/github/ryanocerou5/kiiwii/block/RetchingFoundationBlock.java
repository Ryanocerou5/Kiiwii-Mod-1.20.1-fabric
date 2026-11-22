package github.ryanocerou5.kiiwii.block;

import github.ryanocerou5.kiiwii.init.BlockInit;
import github.ryanocerou5.kiiwii.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RetchingFoundationBlock extends PillarBlock {
    private final boolean isScraps;
    public RetchingFoundationBlock(Settings settings, boolean isScraps) {
        super(settings);
        this.isScraps = isScraps;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient()) {
            if (isScraps && stack.getItem() == ItemInit.ABSTRACTION_IN_A_BOTTLE) {
                world.setBlockState(
                        pos,
                        BlockInit.RETCHING_FOUNDATION.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                        3);

                if (!player.isCreative()) {
                    player.setStackInHand(hand, new ItemStack(Items.GLASS_BOTTLE));
                }

                return ActionResult.SUCCESS;
            }

            if (!isScraps && stack.getItem() == Items.GLASS_BOTTLE) {
                world.setBlockState(
                        pos,
                        BlockInit.RETCHING_FOUNDATION_SCRAPS.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)),
                        3);

                if (!player.isCreative()) {
                    player.setStackInHand(hand, new ItemStack(ItemInit.ABSTRACTION_IN_A_BOTTLE));
                }
            }
        }

        return ActionResult.PASS;
    }
}
