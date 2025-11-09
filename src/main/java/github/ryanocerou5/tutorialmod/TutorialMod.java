package github.ryanocerou5.tutorialmod;

import github.ryanocerou5.tutorialmod.init.BlockInit;
import github.ryanocerou5.tutorialmod.init.CreativeTabInit;
import github.ryanocerou5.tutorialmod.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CreativeTabInit.registerItemGroups();
		ItemInit.registerModItems();
		BlockInit.registerBlocks();
	}
}