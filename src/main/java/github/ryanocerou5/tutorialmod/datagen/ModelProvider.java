package github.ryanocerou5.spaghetersadditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {

    // --- ADD BLOCKSTATE, BLOCK AND ITEM MODEL JSONS ---
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        /* --- ADDING SIMPLE CUBE MODEL ---
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.BLOCK_1); */

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        /* --- ADDING DEFAULT GENERATED ITEM ---
        itemModelGenerator.register(ItemInit.ITEM_1, Models.GENERATED); */

    }
}
