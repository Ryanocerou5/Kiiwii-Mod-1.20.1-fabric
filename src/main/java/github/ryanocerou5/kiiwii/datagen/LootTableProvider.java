package github.ryanocerou5.kiiwii.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {

    // --- ADD LOOT TABLES TO BLOCKS ---
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        /* --- IF BLOCK DROPS ITSELF ---
        addDrop(BlockInit.BLOCK_1);
        addDrop(BlockInit.BLOCK_2); */

        /* --- IF BLOCK DROPS |1| DIFFERENT ITEM ---
        addDrop(BlockInit.BLOCK_1, oreDrops(BlockInit.BLOCK_1, ItemInit.ITEM_1);    --->    First argument in oreDrops states what is dropped with Silk Touch
        addDrop(BlockInit.BLOCK_2, oreDrops(BlockInit.BLOCK_2, ItemInit.ITEM_2); */

        /* --- IF BLOCK DROPS |MULTIPLE| DIFFERENT ITEMS ---
        addDrop(BlockInit.BLOCK_1, multiDrops(BlockInit.BLOCK_1, ItemInit.ITEM_1, 2f, 5f);
        addDrop(BlockInit.BLOCK_2, multiDrops(BlockInit.BLOCK_2, ItemInit.ITEM_2, 3f, 3f); */
    }

    // --- HELPER METHOD TO DROP MULTIPLE DROPS ---
    public LootTable.Builder multiDrops(Block drop, Item item, float lower, float upper)
    {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder) ItemEntry.builder(item)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(lower, upper))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
