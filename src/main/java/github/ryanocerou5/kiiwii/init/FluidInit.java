package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.fluid.MoltenZenderFluid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FluidInit {
    public static FlowableFluid STILL_MOLTEN_ZENDER;
    public static FlowableFluid FLOWING_MOLTEN_ZENDER;
    public static Block MOLTEN_ZENDER_BLOCK;
    public static Item MOLTEN_ZENDER_BUCKET;

    public static void register() {
        STILL_MOLTEN_ZENDER = Registry.register(Registries.FLUID,
                new Identifier(KiiwiiMod.MOD_ID, "molten_zender"), new MoltenZenderFluid.Still());
        FLOWING_MOLTEN_ZENDER = Registry.register(Registries.FLUID,
                new Identifier(KiiwiiMod.MOD_ID, "flowing_molten_zender"), new MoltenZenderFluid.Flowing());

        MOLTEN_ZENDER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(KiiwiiMod.MOD_ID, "molten_zender_block"),
                new FluidBlock(FluidInit.STILL_MOLTEN_ZENDER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        MOLTEN_ZENDER_BUCKET = Registry.register(Registries.ITEM, new Identifier(KiiwiiMod.MOD_ID, "molten_zender_bucket"),
                new BucketItem(FluidInit.STILL_MOLTEN_ZENDER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}