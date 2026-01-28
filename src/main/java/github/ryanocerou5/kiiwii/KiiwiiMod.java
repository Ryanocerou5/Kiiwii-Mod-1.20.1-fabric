package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.init.*;
import net.fabricmc.api.ModInitializer;

import net.minecraft.sound.SoundEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KiiwiiMod implements ModInitializer {
	public static final String MOD_ID = "kiiwii";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeTabInit.registerItemGroups();
		ItemInit.registerModItems();
		BlockInit.registerBlocks();
		BlockEntityInit.registerBlockEntities();
		ScreenHandlerInit.registerScreenHandlers();
		SoundEventInit.registerSoundEvents();
		PacketInit.registerServerReceivers();
		ParticleInit.registerParticleTypes();
		FluidInit.register();
	}
}