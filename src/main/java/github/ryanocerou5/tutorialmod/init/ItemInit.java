package github.ryanocerou5.spaghetersadditions.init;

import github.ryanocerou5.spaghetersadditions.SpaghetersAdditionsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(SpaghetersAdditionsMod.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        SpaghetersAdditionsMod.LOGGER.info("Registering Mod Items for " + SpaghetersAdditionsMod.MOD_ID);
    }

    public static final Item COIN = registerItem("coin", new Item(new FabricItemSettings()));
}
