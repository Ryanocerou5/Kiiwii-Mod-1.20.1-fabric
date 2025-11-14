package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.block.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {

    private static <T extends Block> Item registerBlockItem(String name, T block)
    {
        return Registry.register(Registries.ITEM, new Identifier(KiiwiiMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static <T extends Block> T registerBlock(String name, T block)
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
    public static final Block ONE_PLATE = registerBlock("oneplate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TWO_PLATE = registerBlock("twoplate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block THREE_PLATE = registerBlock("three_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FOUR_PLATE = registerBlock("fourplate",
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
    public static final Block PERIOD_PLATE = registerBlock("dot_plate",
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
    public static final Block RIGHT_PARENTHESES_PLATE = registerBlock("r_parentheses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_PARENTHESES_PLATE = registerBlock("l_parentheses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_CURLY_BRACKET_PLATE = registerBlock("lc_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_CURLY_BRACKET_PLATE = registerBlock("rc_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_SQUARE_BRACKET_PLATE = registerBlock("ls_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_SQUARE_BRACKET_PLATE = registerBlock("rs_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_ANGLE_BRACKET_PLATE = registerBlock("left_angle_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_ANGLE_BRACKET_PLATE = registerBlock("ra_bracket_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_QUOTATION_MARKS_PLATE = registerBlock("rq_mark_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_QUOTATION_MARKS_PLATE = registerBlock("lq_mark_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LEFT_APOSTROPHE_PLATE = registerBlock("l_apostrophe_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RIGHT_APOSTROPHE_PLATE = registerBlock("r_apostrophe_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SLASH_PLATE = registerBlock("slash_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ELLIPSES_PLATE = registerBlock("ellipses_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block AMPERSAND_PLATE = registerBlock("ampersand_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BULLET_POINT_PLATE = registerBlock("bullet_point_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block POINT_SYMBOL_PLATE = registerBlock("pound_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TILDE_PLATE = registerBlock("tilde_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BACKSLASH_PLATE = registerBlock("backslash_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block AT_SYMBOL_PLATE = registerBlock("at_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CARET_SYMBOL_PLATE = registerBlock("caret_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PIPE_SYMBOL_PLATE = registerBlock("pipe_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CO_PLATE = registerBlock("co_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LLC_PLATE = registerBlock("llc_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EQUAL_SIGN_PLATE = registerBlock("equal_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NOT_EQUAL_SIGN_PLATE = registerBlock("unequal_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block APPROXIMATELY_EQUAL_SIGN_PLATE = registerBlock("approximately_equal_sign_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PERCENT_PLATE = registerBlock("percent_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TIMES_SYMBOL_PLATE = registerBlock("times_symbol_plate",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block WHITE_VOID = registerBlock("white_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_VOID = registerBlock("pink_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RED_VOID = registerBlock("red_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ORANGE_VOID = registerBlock("orange_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block YELLOW_VOID = registerBlock("yellow_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GREEN_VOID = registerBlock("green_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BLUE_VOID = registerBlock("blue_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block INDIGO_VOID = registerBlock("indigo_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BLACK_VOID = registerBlock("black_void",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LOCKER = registerBlock("locker",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BETA_CHEST = registerBlock("beta_chest",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TRANS_WOOL = registerBlock("trans_block",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ZENDER_BLOCK = registerBlock("wall_zender",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZENDER_STAIRS = registerBlock("stair_zender",
            new StairsBlock(BlockInit.ZENDER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZENDER_SLAB = registerBlock("slab_zender",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZENDER_DOOR = registerBlock("door_zender",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.CRIMSON));
    public static final Block ZENDER_TRAPDOOR = registerBlock("trapdoor_zender",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.CRIMSON));
    public static final Block ZENDER_CURTAINS = registerBlock("curtain_zender",
            new ZenderCurtainBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DROOPY_CROSS = registerBlock("cross_two",
            new AbstractCrossBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block HIGH_CROSS = registerBlock("cross_three",
            new AbstractCrossBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block LOW_CROSS = registerBlock("cross_four",
            new AbstractCrossBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block WHITE_ROAD_LINE = registerBlock("white_road_line",
            new AbstractRoadLineBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block YELLOW_ROAD_LINE = registerBlock("yellow_road_line",
            new AbstractRoadLineBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block METAL_SCRAP = registerBlock("metal_scrap",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PADDED_WALL = registerBlock("padded_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PADDED_STAIRS = registerBlock("padded_stairs",
            new StairsBlock(BlockInit.PADDED_WALL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PADDED_SLAB = registerBlock("padded_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GHOST_HUNTER_POSTER = registerBlock("ghost_hunter_poster",
            new AbstractPosterBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SAGE_POSTER = registerBlock("sage_poster",
            new AbstractPosterBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GHOST_CALL_POSTER = registerBlock("ghost_call_poster",
            new AbstractPosterBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block MINE = registerBlock("mine",
            new MineBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block EXCLAMATION_MARK = registerBlock("exclamation_mark",
            new ExclamationMarkBlock(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15)));
    public static final Block LARIMAR = registerBlock("larimar",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block ARD = registerBlock("ard",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLUORITE_ORE = registerBlock("fluorite_ore",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block PROTOSTELOID_GROWTH = registerBlock("protosteloid_growth",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block BLOCK_OF_MOLD = registerBlock("mold",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block BODDLE = registerBlock("boddle",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block GOOPLEDUNG = registerBlock("goopledung",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block CLAMAFLAJ = registerBlock("clamaflaj",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block MNOLUB_RESIDENT = registerBlock("mnolub_resident",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block MNOLUB = registerBlock("mnolub",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block AZRA_BUSH = registerBlock("azra_bush",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES)));
    public static final Block SCANNER = registerBlock("scanner",
            new ScannerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CALENDAR = registerBlock("calendar",
            new CalendarBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block ENCASED_GLOWSTONE = registerBlock("glowstone_lamp",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block INACTIVE_ENCASED_GLOWSTONE = registerBlock("inactive_encased_glowstone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block CHARRED_SPRUCE_LOG = registerBlock("charred_spruce_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BLOCK_OF_AMOEBA = registerBlock("block_of_ameoba",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block SONAR_SCREEN = registerBlock("sonar_screen",
            new SonarScreenBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GARFIELD_PLUSH = registerBlock("garfield_plush",
            new GarfieldPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BWON_BWON_PLUSH = registerBlock("bwen_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SPACE_BWON_BWON_PLUSH = registerBlock("bwon_space_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PASTA_PLUSH = registerBlock("pasta_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block STANLEY_PLUSH = registerBlock("stanley_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block JONATHAN_PLUSH = registerBlock("jonathan_enderman_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DATING_MIZZ_PLUSH = registerBlock("dating_mizz_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block MIZZ_PLUSH = registerBlock("mizz_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block EVIL_MIZZ_PLUSH = registerBlock("evil_mizz_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block D0NKU_PLUSH = registerBlock("dunk_0_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block FROWNER_PLUSH = registerBlock("smile_mask_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ANTI_MASKER_FROWNER_PLUSH = registerBlock("smile_no_mask_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WEALTHY_BAG_MAN_PLUSH = registerBlock("wealthy_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block THE_LIME_PLUSH = registerBlock("spryte_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BRIEFCASE = registerBlock("briefcase",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DEAD_FLOWER = registerBlock("dead_flower_plant",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    public static final Block CARVED_OAK_LOG = registerBlock("carved_oak_log",
            new AbstractFacingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_FOUNDATION = registerBlock("retching_foundation",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_PILLAR = registerBlock("retching_pillar",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_CONNECTOR = registerBlock("retching_connector",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_FOUNDATION_SCRAPS = registerBlock("retching_foundation_scraps",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_PILLAR_SCRAPS = registerBlock("retching_pillar_scraps",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RETCHING_CONNECTOR_SCRAPS = registerBlock("retching_connector_scraps",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FORCEFIELD_TARGET = registerBlock("forcefield_target",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FORCEFIELD_TARGET_SCRAPS = registerBlock("forcefield_target_scraps",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FORCEFIELD_BATTERY = registerBlock("forcefield_battery",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block FORCEFIELD_BATTERY_SCRAPS = registerBlock("forcefield_battery_scraps",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block METAL_GRATE = registerBlock("metal_grate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block RED_METAL_GRATE = registerBlock("red_metal_grate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block WHITE_METAL_GRATE = registerBlock("white_metal_grate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block FALSE_ANCHOR = registerBlock("false_anchor",
            new AbstractDirectionalBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block EXILED_ZENDER_ROCK = registerBlock("exiled_zender_block",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block EXILED_ZENDER_ROCK_BRICKS = registerBlock("exiled_zender_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEAD_ZENDER_SPORES = registerBlock("cobbled_spores",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block ZENDER_SPORES = registerBlock("zender_spores",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block NUMBER_PLATE_3BR = registerBlock("number_plate_3br",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_1B = registerBlock("number_plate_1b",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_1A = registerBlock("number_plate_1a",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_2B = registerBlock("number_plate_2b",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_1W = registerBlock("number_plate_1w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_3ABC = registerBlock("number_plate_3abc",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_3C = registerBlock("number_plate_3c",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_2W = registerBlock("number_plate_2w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_4C = registerBlock("number_plate_4c",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_4B = registerBlock("number_plate_4b",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_4A = registerBlock("number_plate_4a",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_3W = registerBlock("number_plate_3w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_5B = registerBlock("number_plate_5b",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_4W = registerBlock("number_plate_4w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_6W = registerBlock("number_plate_6w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_5W = registerBlock("number_plate_5w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_7W = registerBlock("number_plate_7w",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NUMBER_PLATE_1B_2 = registerBlock("number_plate_1b_2",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block CARNATION = registerBlock("carnation",
            new Block(FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block JEBEDIAH_JAMES_PLUSH = registerBlock("jebediah_james_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block HUNGRY_JEBEDIAH_JAMES_PLUSH = registerBlock("hungry_jebediah_james_plush",
            new AbstractPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static void registerBlocks()
    {
        KiiwiiMod.LOGGER.info("Registering blocks for " + KiiwiiMod.MOD_ID);
    }
}
