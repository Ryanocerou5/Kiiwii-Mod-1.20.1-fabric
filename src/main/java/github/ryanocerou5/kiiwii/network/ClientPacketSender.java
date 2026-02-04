package github.ryanocerou5.kiiwii.network;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.network.PacketByteBuf;

public class ClientPacketSender {
    public static void sendToggleSpectator() {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());

        ClientPlayNetworking.send(
                PacketInit.TOGGLE_SPECTATOR_C2S,
                buf
        );
    }
}
