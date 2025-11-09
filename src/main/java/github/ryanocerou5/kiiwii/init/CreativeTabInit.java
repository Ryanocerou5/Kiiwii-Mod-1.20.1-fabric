package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTabInit {
    public static final ItemGroup KIIWII_MOD_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KiiwiiMod.MOD_ID, "coin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.coin"))
                    .icon(() -> new ItemStack(ItemInit.COIN)).entries((displayContext, entries) -> {
                        entries.add(ItemInit.COIN);
                        entries.add(BlockInit.COIN_BLOCK);
                    }).build());

    public static void registerItemGroups()
    {
        KiiwiiMod.LOGGER.info("Registering Item Groups for " + KiiwiiMod.MOD_ID);
    }
}
