package github.ryanocerou5.spaghetersadditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {

    // --- ADD RECIPES FOR SMELTING, BLASTING, SMOKING AND CRAFTING ---

    /* --- FOR SMELTABLES THAT RETURN THE SAME ITEM, CREATE A LIST ---
    private static final List<ItemConvertible> SMELTABLES = List.of(ItemInit.ITEM_1, ItemInit.ITEM_2, etc.); */
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        /* --- LET ITEMS BE SMELTED AND RETURN SPECIFIED ITEM ---
        offerSmelting(consumer, SMELTABLES, RecipeCategory.MISC, ItemInit.ITEM_1, (float | experience) 0.7, (int | cooking time in ticks) 200, "group"); */

        /* --- LET ITEMS BE BLASTED AND RETURN SPECIFIED ITEM ---
        offerBlasting(consumer, SMELTABLES, RecipeCategory.MISC, ItemInit.ITEM_1, (float | experience) 0.7, (int | cooking time in ticks) 200, "group"); */

        /* --- ITEMS CREATED FROM FULL 3X3 CRAFTING GRID ---
        offerReversibleCompactingRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ItemInit.ITEM_1, RecipeCategory.DECORATIONS, BlockInit.BLOCK_1); */
    }
}
