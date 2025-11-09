package github.ryanocerou5.spaghetersadditions.init;

import github.ryanocerou5.spaghetersadditions.SpaghetersAdditionsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(SpaghetersAdditionsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SpaghetersAdditionsMod.MOD_ID, name), block);
    }

    public static final Block COIN_BLOCK = registerBlock("coin_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static void registerBlocks()
    {
        SpaghetersAdditionsMod.LOGGER.info("Registering blocks for " + SpaghetersAdditionsMod.MOD_ID);
    }
}
