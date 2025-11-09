package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
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
        return Registry.register(Registries.ITEM, new Identifier(KiiwiiMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(KiiwiiMod.MOD_ID, name), block);
    }

    public static final Block PLATING_TABLE = registerBlock("plating_table",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EMPTY_PLATE = registerBlock("empty_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block A_PLATE = registerBlock("a_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block B_PLATE = registerBlock("b_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block C_PLATE = registerBlock("c_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block D_PLATE = registerBlock("d_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block E_PLATE = registerBlock("e_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block F_PLATE = registerBlock("f_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block G_PLATE = registerBlock("g_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block H_PLATE = registerBlock("h_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block I_PLATE = registerBlock("i_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block J_PLATE = registerBlock("j_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block K_PLATE = registerBlock("k_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block L_PLATE = registerBlock("l_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block M_PLATE = registerBlock("m_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block N_PLATE = registerBlock("n_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block O_PLATE = registerBlock("o_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block P_PLATE = registerBlock("p_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Q_PLATE = registerBlock("q_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block R_PLATE = registerBlock("r_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block S_PLATE = registerBlock("s_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block T_PLATE = registerBlock("t_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block U_PLATE = registerBlock("u_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block V_PLATE = registerBlock("v_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block W_PLATE = registerBlock("w_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block X_PLATE = registerBlock("x_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Y_PLATE = registerBlock("y_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block Z_PLATE = registerBlock("z_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ZERO_PLATE = registerBlock("zero_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ONE_PLATE = registerBlock("one_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TWO_PLATE = registerBlock("two_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block THREE_PLATE = registerBlock("three_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FOUR_PLATE = registerBlock("four_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FIVE_PLATE = registerBlock("five_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SIX_PLATE = registerBlock("six_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SEVEN_PLATE = registerBlock("seven_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EIGHT_PLATE = registerBlock("eight_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NINE_PLATE = registerBlock("nine_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EXCLAMATION_PLATE = registerBlock("exclamation_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block INTERROGATION_PLATE = registerBlock("interrogation_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PERIOD_PLATE = registerBlock("period_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block COLON_PLATE = registerBlock("colon_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SEMICOLON_PLATE = registerBlock("semicolon_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block COMMA_PLATE = registerBlock("comma_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block HYPHEN_PLATE = registerBlock("hyphen_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block MINUS_PLATE = registerBlock("minus_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PLUS_PLATE = registerBlock("plus_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_PARENTHESES_PLATE = registerBlock("right_parentheses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_PARENTHESES_PLATE = registerBlock("left_parentheses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_CURLY_BRACKET_PLATE = registerBlock("left_curly_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_CURLY_BRACKET_PLATE = registerBlock("right_curly_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_SQUARE_BRACKET_PLATE = registerBlock("left_square_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_SQUARE_BRACKET_PLATE = registerBlock("right_square_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_ANGLE_BRACKET_PLATE = registerBlock("left_angle_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_ANGLE_BRACKET_PLATE = registerBlock("right_angle_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_QUOTATION_MARKS_PLATE = registerBlock("right_quotation_marks_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_QUOTATION_MARKS_PLATE = registerBlock("left_quotation_marks_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_APOSTROPHE_PLATE = registerBlock("left_apostrophe_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_APOSTROPHE_PLATE = registerBlock("right_apostrophe_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SLASH_PLATE = registerBlock("slash_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ELLIPSES_PLATE = registerBlock("ellipses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block AMPERSAND_PLATE = registerBlock("ampersand_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BULLET_POINT_PLATE = registerBlock("bullet_point_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block POINT_SYMBOL_PLATE = registerBlock("point_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TILDE_PLATE = registerBlock("tilde_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BACKSLASH_PLATE = registerBlock("backslash_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block AT_SYMBOL_PLATE = registerBlock("at_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CARET_SYMBOL_PLATE = registerBlock("caret_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PIPE_SYMBOL_PLATE = registerBlock("pipe_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CO_PLATE = registerBlock("co_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LLC_PLATE = registerBlock("llc_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EQUAL_SIGN_PLATE = registerBlock("equal_sign_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NOT_EQUAL_SIGN_PLATE = registerBlock("not_equal_sign_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block APPROXIMATELY_EQUAL_SIGN_PLATE = registerBlock("approximately_equal_sign_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PERCENT_PLATE = registerBlock("percent_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TIMES_SYMBOL_PLATE = registerBlock("times_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    public static void registerBlocks()
    {
        KiiwiiMod.LOGGER.info("Registering blocks for " + KiiwiiMod.MOD_ID);
    }
}
