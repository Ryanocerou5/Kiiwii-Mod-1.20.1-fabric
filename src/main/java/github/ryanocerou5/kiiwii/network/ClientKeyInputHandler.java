package github.ryanocerou5.kiiwii.network;

import github.ryanocerou5.kiiwii.init.KeybindInit;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class ClientKeyInputHandler {
    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (KeybindInit.TOGGLE_SPECTATOR.wasPressed()) {
                if (client.player == null || client.getNetworkHandler() == null)
                {
                    return;
                }

                ClientPacketSender.sendToggleSpectator();
            }
        });
    }
}
