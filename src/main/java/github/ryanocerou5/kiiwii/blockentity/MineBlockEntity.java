package github.ryanocerou5.kiiwii.blockentity;

import github.ryanocerou5.kiiwii.init.BlockEntityInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class MineBlockEntity extends BlockEntity implements BlockEntityTicker<MineBlockEntity> {
    private boolean triggered = false;
    private int fuseTicks = 0;
    public MineBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.MINE_BLOCK_ENTITY, pos, state);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);

        nbt.putBoolean("Triggered", triggered);
        nbt.putInt("FuseTicks", fuseTicks);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        this.triggered = nbt.getBoolean("Triggered");
        this.fuseTicks = nbt.getInt("FuseTicks");
    }

    @Override
    public void tick(World world, BlockPos pos, BlockState state, MineBlockEntity be) {
        if (world.isClient()) return;

        if (!triggered) {
            List<PlayerEntity> players = world.getEntitiesByClass(
                    PlayerEntity.class,
                    new Box(pos).expand(0.15),
                    p -> !p.isSpectator()
            );

            if (!players.isEmpty()) {
                triggered = true;
                fuseTicks = 3;
                markDirty();
            }
        } else {
            fuseTicks--;
            if (fuseTicks <= 0) {
                explode(world, pos);
            } else {
                markDirty();
            }
        }
    }

    private void explode(World world, BlockPos pos) {
        if (world.isClient()) return;

        world.createExplosion(
                null,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                4.0F, // TNT power
                World.ExplosionSourceType.NONE
        );

        world.breakBlock(pos, false); // remove mine
    }
}
