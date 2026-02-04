package github.ryanocerou5.kiiwii.network;

import github.ryanocerou5.kiiwii.init.StatusEffectInit;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;

public class ServerPacketHandler {
    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(
                PacketInit.TOGGLE_SPECTATOR_C2S,
                (minecraftServer, serverPlayerEntity, serverPlayNetworkHandler, packetByteBuf, packetSender) -> {
                    minecraftServer.execute(() -> {
                        handleToggleSpectator(serverPlayerEntity);
                    });
                }
        );
    }

    private static void handleToggleSpectator(ServerPlayerEntity player) {
        if (!player.hasPermissionLevel(2)) {
            player.sendMessage(
                    Text.literal("You do not have permission to enter spectator mode."),
                    true
            );
            return;
        }
        if (!player.hasStatusEffect(StatusEffectInit.AEONIAN_SHELL_EFFECT)) {
            player.sendMessage(
                    Text.literal("You must have Aeonian Shell to enter spectator mode."),
                    true
            );
            return;
        }

        GameMode current = player.interactionManager.getGameMode();

        if (current == GameMode.SPECTATOR) {
            player.clearStatusEffects();
            player.changeGameMode(GameMode.SURVIVAL);
        } else {
            player.changeGameMode(GameMode.SPECTATOR);
        }
    }
}
