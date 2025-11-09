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
    public static final ItemGroup KIIWII_MOD_PLATES_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KiiwiiMod.MOD_ID, "plate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.plate"))
                    .icon(() -> new ItemStack(ItemInit.WHITE_VOID)).entries((displayContext, entries) -> {
                        entries.add(BlockInit.PLATING_TABLE);
                        entries.add(BlockInit.EMPTY_PLATE);
                        entries.add(BlockInit.A_PLATE);
                        entries.add(BlockInit.B_PLATE);
                        entries.add(BlockInit.C_PLATE);
                        entries.add(BlockInit.D_PLATE);
                        entries.add(BlockInit.E_PLATE);
                        entries.add(BlockInit.F_PLATE);
                        entries.add(BlockInit.G_PLATE);
                        entries.add(BlockInit.H_PLATE);
                        entries.add(BlockInit.I_PLATE);
                        entries.add(BlockInit.J_PLATE);
                        entries.add(BlockInit.K_PLATE);
                        entries.add(BlockInit.L_PLATE);
                        entries.add(BlockInit.M_PLATE);
                        entries.add(BlockInit.N_PLATE);
                        entries.add(BlockInit.O_PLATE);
                        entries.add(BlockInit.P_PLATE);
                        entries.add(BlockInit.Q_PLATE);
                        entries.add(BlockInit.R_PLATE);
                        entries.add(BlockInit.S_PLATE);
                        entries.add(BlockInit.T_PLATE);
                        entries.add(BlockInit.U_PLATE);
                        entries.add(BlockInit.V_PLATE);
                        entries.add(BlockInit.W_PLATE);
                        entries.add(BlockInit.X_PLATE);
                        entries.add(BlockInit.Y_PLATE);
                        entries.add(BlockInit.Z_PLATE);
                        entries.add(BlockInit.ONE_PLATE);
                        entries.add(BlockInit.TWO_PLATE);
                        entries.add(BlockInit.THREE_PLATE);
                        entries.add(BlockInit.FOUR_PLATE);
                        entries.add(BlockInit.FIVE_PLATE);
                        entries.add(BlockInit.SIX_PLATE);
                        entries.add(BlockInit.SEVEN_PLATE);
                        entries.add(BlockInit.EIGHT_PLATE);
                        entries.add(BlockInit.NINE_PLATE);
                        entries.add(BlockInit.EXCLAMATION_PLATE);
                        entries.add(BlockInit.INTERROGATION_PLATE);
                        entries.add(BlockInit.PERIOD_PLATE);
                        entries.add(BlockInit.COLON_PLATE);
                        entries.add(BlockInit.SEMICOLON_PLATE);
                        entries.add(BlockInit.COMMA_PLATE);
                        entries.add(BlockInit.HYPHEN_PLATE);
                        entries.add(BlockInit.MINUS_PLATE);
                        entries.add(BlockInit.PLUS_PLATE);
                        entries.add(BlockInit.RIGHT_PARENTHESES_PLATE);
                        entries.add(BlockInit.LEFT_PARENTHESES_PLATE);
                        entries.add(BlockInit.LEFT_CURLY_BRACKET_PLATE);
                        entries.add(BlockInit.RIGHT_CURLY_BRACKET_PLATE);
                        entries.add(BlockInit.LEFT_SQUARE_BRACKET_PLATE);
                        entries.add(BlockInit.RIGHT_SQUARE_BRACKET_PLATE);
                        entries.add(BlockInit.LEFT_ANGLE_BRACKET_PLATE);
                        entries.add(BlockInit.RIGHT_ANGLE_BRACKET_PLATE);
                        entries.add(BlockInit.RIGHT_QUOTATION_MARKS_PLATE);
                        entries.add(BlockInit.LEFT_QUOTATION_MARKS_PLATE);
                        entries.add(BlockInit.LEFT_APOSTROPHE_PLATE);
                        entries.add(BlockInit.RIGHT_APOSTROPHE_PLATE);
                        entries.add(BlockInit.SLASH_PLATE);
                        entries.add(BlockInit.ELLIPSES_PLATE);
                        entries.add(BlockInit.AMPERSAND_PLATE);
                        entries.add(BlockInit.BULLET_POINT_PLATE);
                        entries.add(BlockInit.POINT_SYMBOL_PLATE);
                        entries.add(BlockInit.TILDE_PLATE);
                        entries.add(BlockInit.BACKSLASH_PLATE);
                        entries.add(BlockInit.AT_SYMBOL_PLATE);
                        entries.add(BlockInit.CARET_SYMBOL_PLATE);
                        entries.add(BlockInit.PIPE_SYMBOL_PLATE);
                        entries.add(BlockInit.CO_PLATE);
                        entries.add(BlockInit.LLC_PLATE);
                        entries.add(BlockInit.EQUAL_SIGN_PLATE);
                        entries.add(BlockInit.NOT_EQUAL_SIGN_PLATE);
                        entries.add(BlockInit.APPROXIMATELY_EQUAL_SIGN_PLATE);
                        entries.add(BlockInit.PERCENT_PLATE);
                        entries.add(BlockInit.TIMES_SYMBOL_PLATE);
                    }).build());

    public static void registerItemGroups()
    {
        KiiwiiMod.LOGGER.info("Registering Item Groups for " + KiiwiiMod.MOD_ID);
    }
}
