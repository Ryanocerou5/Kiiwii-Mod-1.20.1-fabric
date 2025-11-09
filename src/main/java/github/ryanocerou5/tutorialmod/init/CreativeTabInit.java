package github.ryanocerou5.spaghetersadditions.init;

import github.ryanocerou5.spaghetersadditions.SpaghetersAdditionsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTabInit {
    public static final ItemGroup SPAGHETERS_ADDITIONS_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SpaghetersAdditionsMod.MOD_ID, "coin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.coin"))
                    .icon(() -> new ItemStack(ItemInit.COIN)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.COIN);
                        entries.add(BlockInit.COIN_BLOCK);
                    }).build());

    public static void registerItemGroups()
    {
        SpaghetersAdditionsMod.LOGGER.info("Registering Item Groups for " + SpaghetersAdditionsMod.MOD_ID);
    }
}
