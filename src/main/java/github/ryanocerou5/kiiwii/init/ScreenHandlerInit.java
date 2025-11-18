package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.blockentity.BetaChestBlockEntity;
import github.ryanocerou5.kiiwii.screen.BetaChestScreenHandler;
import github.ryanocerou5.kiiwii.screen.CarvedOakLogScreenHandler;
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
    public static final ScreenHandlerType<BetaChestScreenHandler> BETA_CHEST_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(KiiwiiMod.MOD_ID, "beta_chest"),
                    new ExtendedScreenHandlerType<>(BetaChestScreenHandler::new));
    public static final ScreenHandlerType<CarvedOakLogScreenHandler> CARVED_OAK_LOG_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(KiiwiiMod.MOD_ID, "carved_oak_log"),
                    new ExtendedScreenHandlerType<>(CarvedOakLogScreenHandler::new));

    public static void registerScreenHandlers()
    {
        KiiwiiMod.LOGGER.info("Registering Screen Handlers for " + KiiwiiMod.MOD_ID);
    }
}
