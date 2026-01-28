package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.List;
public class TweakersWandItem extends Item {
    public static final List<Block> NUMBER_PLATES = List.of(
            BlockInit.NUMBER_PLATE_1A,
            BlockInit.NUMBER_PLATE_1B,
            BlockInit.NUMBER_PLATE_1B_2,
            BlockInit.NUMBER_PLATE_1W,
            BlockInit.NUMBER_PLATE_2B,
            BlockInit.NUMBER_PLATE_2W,
            BlockInit.NUMBER_PLATE_3ABC,
            BlockInit.NUMBER_PLATE_3BR,
            BlockInit.NUMBER_PLATE_3C,
            BlockInit.NUMBER_PLATE_3W,
            BlockInit.NUMBER_PLATE_4A,
            BlockInit.NUMBER_PLATE_4B,
            BlockInit.NUMBER_PLATE_4C,
            BlockInit.NUMBER_PLATE_4W,
            BlockInit.NUMBER_PLATE_5B,
            BlockInit.NUMBER_PLATE_5W,
            BlockInit.NUMBER_PLATE_6W,
            BlockInit.NUMBER_PLATE_7W
    );
    public TweakersWandItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();

        if (world.isClient()) {
            return ActionResult.CONSUME; // Only run logic on server
        }

        Block currentBlock = state.getBlock();

        // Check if the block is in the number plates list
        int index = NUMBER_PLATES.indexOf(currentBlock);
        if (index != -1) {
            // Get the next block in the list (wrap around)
            Block nextBlock = NUMBER_PLATES.get((index + 1) % NUMBER_PLATES.size());

            // Preserve facing
            Direction facing = state.get(Properties.HORIZONTAL_FACING); // inherited from AbstractDirectionalBlock
            BlockState newState = nextBlock.getDefaultState().with(Properties.HORIZONTAL_FACING, facing);

            world.setBlockState(pos, newState, Block.NOTIFY_ALL);

            if (player != null) {
                player.swingHand(context.getHand(), true);
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
