package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ConfettiCannonItem extends Item {
    public ConfettiCannonItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient())
        {
            int particleCount = 100;
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(particleCount);

            Vec3d look = user.getRotationVector();
            buf.writeDouble(look.x);
            buf.writeDouble(look.y);
            buf.writeDouble(look.z);

            ServerPlayNetworking.send((ServerPlayerEntity) user,
                    new Identifier(KiiwiiMod.MOD_ID, "confetti_cannon"), buf);
        }

        user.getItemCooldownManager().set(this, 400);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
