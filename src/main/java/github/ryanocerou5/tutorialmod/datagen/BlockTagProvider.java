package github.ryanocerou5.spaghetersadditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    // --- ADD BLOCKS TO TAGS (IE. NEEDS_IRON_TOOL, AXE_MINEABLE, CUSTOM TAGS)

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        /* --- ADDING CUSTOM TAGS ---
        getOrCreateTagBuilder(TagsInit.Blocks.CUSTOM_BLOCK_TAG_NAME)
            .add(BlockInit.BLOCK_1)
            .add(BlockInit.BLOCK_2)
            .forceAddTag(BlockTags.VANILLA_BLOCKS); */

        /* --- ADDING VANILLA TAGS ---
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(BlockInit.BLOCK_1)
            .add(BlockInit.BLOCK_2)
            .forceAddTag(BlockTags.VANILLA_BLOCKS); */

        /* --- ADDING FABRIC TAGS ---
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
            .add(BlockInit.BLOCK_1); */
    }
}
