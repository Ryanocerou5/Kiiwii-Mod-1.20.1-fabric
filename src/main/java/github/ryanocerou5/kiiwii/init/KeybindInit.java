package github.ryanocerou5.kiiwii.init;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class KeybindInit {
    public static KeyBinding TOGGLE_SPECTATOR;

    public static void register() {
        TOGGLE_SPECTATOR = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.kiiwii.toggle_spectator",
                        GLFW.GLFW_KEY_COMMA,
                        "category.kiiwii"
                )
        );
    }
}
