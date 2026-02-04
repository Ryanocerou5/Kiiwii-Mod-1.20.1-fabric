package github.ryanocerou5.kiiwii.network;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.util.Identifier;

public class PacketInit {
    public static final Identifier TOGGLE_SPECTATOR_C2S =
            new Identifier(KiiwiiMod.MOD_ID, "toggle_spectator_c2s");

    public static final Identifier EXAMPLE_S2C =
            new Identifier(KiiwiiMod.MOD_ID, "example_s2c");
}
