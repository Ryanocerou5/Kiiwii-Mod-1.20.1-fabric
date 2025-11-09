package github.ryanocerou5.kiiwii;

import github.ryanocerou5.kiiwii.init.BlockInit;
import github.ryanocerou5.kiiwii.init.CreativeTabInit;
import github.ryanocerou5.kiiwii.init.ItemInit;
import net.fabricmc.api.ModInitializer;

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
	}
}