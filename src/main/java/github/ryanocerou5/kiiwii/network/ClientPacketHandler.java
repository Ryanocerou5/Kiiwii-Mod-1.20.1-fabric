package github.ryanocerou5.kiiwii.network;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class ClientPacketHandler {
    public static void register() {
        ClientPlayNetworking.registerGlobalReceiver(
                PacketInit.EXAMPLE_S2C,
                (minecraftClient, clientPlayNetworkHandler, packetByteBuf, packetSender) -> {
                    minecraftClient.execute(() -> {
                        System.out.println("Received packet from server!");
                    });
                }
        );
    }
}
