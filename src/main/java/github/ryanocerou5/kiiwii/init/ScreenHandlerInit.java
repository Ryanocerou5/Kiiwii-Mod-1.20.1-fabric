package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.screen.LockerScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ScreenHandlerInit {
    public static final ScreenHandlerType<LockerScreenHandler> LOCKER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(KiiwiiMod.MOD_ID, "locker"),
                    new ExtendedScreenHandlerType<>(LockerScreenHandler::new));

    public static void registerScreenHandlers()
    {
        KiiwiiMod.LOGGER.info("Registering Screen Handlers for " + KiiwiiMod.MOD_ID);
    }
}
