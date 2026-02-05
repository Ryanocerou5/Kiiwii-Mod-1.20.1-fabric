package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.Armor.CrownHelmetItem;
import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.item.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ItemInit {
    private static <T extends Item> T registerItem(String name, T item)
    {
        return Registry.register(Registries.ITEM, new Identifier(KiiwiiMod.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        KiiwiiMod.LOGGER.info("Registering Mod Items for " + KiiwiiMod.MOD_ID);
    }
    public static final PillBottleItem PILL_BOTTLE = registerItem("pill_bottle", new PillBottleItem(new FabricItemSettings()));
    public static final AbstractPillItem DULL_PILL = registerItem("dull_pill", new AbstractPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final AbstractPillItem ZENDER_PILL = registerItem("zender_pills", new AbstractPillItem(new FabricItemSettings().food(FoodComponentInit.ZENDER_PILL)));
    public static final DeductionPillItem DEDUCTION_PILL = registerItem("deduction_pill", new DeductionPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final AntiemeticPillItem ANTIEMETIC_PILL = registerItem("antiemetic_pill", new AntiemeticPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final AbstractPillItem PANACEA_PILL = registerItem("panacea", new AbstractPillItem(new FabricItemSettings().food(FoodComponentInit.PANACEA_PILL)));
    public static final AntipoisonPillItem ANTIPOISON_PILL = registerItem("antipoison_pill", new AntipoisonPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final OpticPillItem OPTIC_PILL = registerItem("optic_pill", new OpticPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final AdrenalPillItem ADRENAL_PILL = registerItem("adrenal_pill", new AdrenalPillItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final Item CITY_OF_SPARKS = registerItem("city_of_sparks", new Item(new FabricItemSettings()));
    public static final Item ALL_BETS_ARE_OFF = registerItem("all_bets_are_off", new MusicDiscItem(2, SoundEventInit.ALL_BETS_ARE_OFF_NEW, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 129));
    public static final Item SNAIL_DUST = registerItem("snail_dust", new MusicDiscItem(3, SoundEventInit.SNAIL_DUST_NEW, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 90));
    public static final Item FOR_THE_REST_OF_US = registerItem("for_the_rest_of_us", new Item(new FabricItemSettings()));
    public static final Item STAY_NEAR = registerItem("stay_near", new MusicDiscItem(5, SoundEventInit.STAY_NEAR_EW, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 179));
    public static final Item WEATHER_ROOM = registerItem("weather_room", new MusicDiscItem(6, SoundEventInit.WEATHER_ROOM, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 172));
    public static final Item QUESTION_MARK = registerItem("question_mark", new MusicDiscItem(7, SoundEventInit.QUESTION_MARK_NEW, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 21));
    public static final Item MUSIC_CASSETTE = registerItem("fm_radio", new MusicDiscItem(8, SoundEventInit.FM_RADIO_NEW, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 120));
    public static final SoundboardItem SOUNDBOARD = registerItem("soundoard", new SoundboardItem(new FabricItemSettings()));
    public static final Item CONFETTI_CANNON = registerItem("confetti_tube", new Item(new FabricItemSettings()));
    public static final Item CREMS_MASK = registerItem("crem_mask_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BROKEN_MASK = registerItem("smile_mask_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CROWN = registerItem("crown_helmet", new CrownHelmetItem(ArmorMaterials.LEATHER));
    public static final Item UFO_HELMET = registerItem("ufo_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item KRUSTY_KRAB_HAT = registerItem("krusty_krab_hat_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLDEN_MICROPHONE = registerItem("golden_microphone", new Item(new FabricItemSettings()));
    public static final Item THE_PICKING_BONE = registerItem("the_picking_bone", new Item(new FabricItemSettings()));
    public static final Item THE_MACROLITH = registerItem("macrolith", new Item(new FabricItemSettings()));
    public static final Item ELF_EARS = registerItem("elf_ears_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GLASSES = registerItem("glasses_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WINSWEEPS_MASK = registerItem("winsweep_mask_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ACES_HAT = registerItem("ace_hat_helmet", new ArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final SwordItem COCK_60 = registerItem("cock_60", new SwordItem(ToolMaterials.WOOD, 10, 1.8F, new FabricItemSettings()));
    public static final ChiliPepperItem CHILI_PEPPER = registerItem("chilli_pepper", new ChiliPepperItem(new FabricItemSettings().food(FoodComponentInit.NOTHING), false));
    public static final ChiliPepperItem GOLDEN_CHILI_PEPPER = registerItem("gold_chili", new ChiliPepperItem(new FabricItemSettings().food(FoodComponentInit.NOTHING), true));
    public static final EmptiableFoodItem BOWL_OF_SUGAR = registerItem("flee_pap",
            new EmptiableFoodItem(new FabricItemSettings().food(FoodComponentInit.BOWL_OF_SUGAR),
                    400, new ItemStack(Items.BOWL), 30));
    public static final Item FLIP_PHONE = registerItem("flip_phone", new FlipPhoneItem(new FabricItemSettings()));
    public static final Item BOOK_OF_HAUNTING = registerItem("book", new Item(new FabricItemSettings()));
    public static final Item PIECE_OF_LARIMAR = registerItem("piece_of_larimar", new Item(new FabricItemSettings()));
    public static final Item FLUORITE = registerItem("fluorite", new Item(new FabricItemSettings()));
    public static final ShovelItem FLUORITE_SHOVEL = registerItem("fluorite_shovel", new ShovelItem(ToolMaterials.DIAMOND, 1, 1F, new FabricItemSettings()));
    public static final Item PROTOSTELOID_SPORE = registerItem("protosteloid_spore", new Item(new FabricItemSettings()));
    public static final Item BLOP = registerItem("blop", new Item(new FabricItemSettings()));
    public static final Item CLAM = registerItem("clam", new Item(new FabricItemSettings()));
    public static final Item CAMERA = registerItem("camera", new Item(new FabricItemSettings()));
    public static final SwordItem SPATULA = registerItem("spatula", new SwordItem(ToolMaterials.DIAMOND, 1, 1F, new FabricItemSettings()));
    public static final CigarettePackItem CIGARETTE_PACK = registerItem("cigarette_pack", new CigarettePackItem(new FabricItemSettings()));
    public static final Item CIGARETTE = registerItem("cigarette", new AbstractCigaretteItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final Item LUCKY_CIGARETTE = registerItem("lucky_cigarette", new AbstractCigaretteItem(new FabricItemSettings().food(FoodComponentInit.LUCKY_CIGARETTE)));
    public static final Item MINT_CIGARETTE = registerItem("mint_cigarette", new AbstractCigaretteItem(new FabricItemSettings().food(FoodComponentInit.MINT_CIGARETTE)));
    public static final Item CANDY_CIGARETTE = registerItem("candy_cigarette_recipe", new AbstractCigaretteItem(new FabricItemSettings().food(FoodComponentInit.CANDY_CIGARETTE)));
    public static final Item METAL_CIGARETTE = registerItem("metal_cigarette", new MetalCigaretteItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final Item MICROPHONE = registerItem("microphone", new Item(new FabricItemSettings()));
    public static final Item REMNANT = registerItem("remnant", new Item(new FabricItemSettings()));
    public static final EmptiableFoodItem SOULFUL_MEAL = registerItem("soulful_meal",
            new EmptiableFoodItem(new FabricItemSettings().food(FoodComponentInit.SOULFUL_MEAL),
                    400, new ItemStack(Items.BOWL), 50));
    public static final Item SOULFUL_LOLLIPOP = registerItem("soulful_lollipop", new Item(new FabricItemSettings().food(FoodComponentInit.SOULFUL_LOLLIPOP)));
    public static final Item ECTOPLASM = registerItem("ectoplasm", new Item(new FabricItemSettings()));
    public static final EmptiableFoodItem GHOSTLY_MEAL = registerItem("ghostly_meal",
            new EmptiableFoodItem(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_MEAL),
                    400, new ItemStack(Items.BOWL), 50));
    public static final Item GHOSTLY_LOLLIPOP = registerItem("ghostly_lollipop", new Item(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_LOLLIPOP)));
    public static final Item EMPTY_CONDIMENT_BOTTLE = registerItem("empty_condiment_bottle", new Item(new FabricItemSettings()));
    public static final EmptiableFoodItem ECTOPLASM_IN_A_CONDIMENT_BOTTLE = registerItem("ectoplasm_in_a_condiment_bottle",
            new EmptiableFoodItem(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_MEAL),
                    400, new ItemStack(ItemInit.EMPTY_CONDIMENT_BOTTLE), 30));
    public static final Item ECTOPLASM_SAUCE = registerItem("ectoplasm_sauce", new Item(new FabricItemSettings()));
    public static final Item EMPTY_SAUCE_PACKET = registerItem("empty_sauce_packet", new Item(new FabricItemSettings()));
    public static final Item MELON_JUICE_WITH_GOOP_INSIDE = registerItem("melon_juice_with_goop_inside", new Item(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_LOLLIPOP)));
    public static final Item GHOST_SALAD = registerItem("ghost_salad", new Item(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_LOLLIPOP)));
    public static final Item HAUNTED_CHICKEN_SOUP = registerItem("haunted_chicken_soup", new Item(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_LOLLIPOP)));
    public static final KillerDinoNuggetItem KILLER_DINO_NUGGET = registerItem("killer_dino_nugget", new KillerDinoNuggetItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final Item CRAZY_HAMBURGER = registerItem("crazy_hamburger", new Item(new FabricItemSettings().food(FoodComponentInit.CRAZY_HAMBURGER)));
    public static final Item GOOKIE = registerItem("gookie", new Item(new FabricItemSettings().food(FoodComponentInit.GHOSTLY_LOLLIPOP)));
    public static final Item CANE = registerItem("cane", new Item(new FabricItemSettings()));
    public static final Item RUPEE = registerItem("rupee", new Item(new FabricItemSettings()));
    public static final Item DOUBLE_RUPEE = registerItem("double_rupee", new Item(new FabricItemSettings()));
    public static final Item GLOWING_RUPEE = registerItem("glowing_rupee", new Item(new FabricItemSettings()));
    public static final Item CURSED_RUPEE = registerItem("cursed_rupee", new Item(new FabricItemSettings()));
    public static final Item DINO_NUGGET = registerItem("dino_nugget", new Item(new FabricItemSettings().food(FoodComponents.COOKED_CHICKEN)));
    public static final BriefcaseItem BRIEFCASE = registerItem("briefcase", new BriefcaseItem(new FabricItemSettings()));
    public static final Item SWEET_STAR = registerItem("sweet_star", new Item(new FabricItemSettings().food(FoodComponents.COOKED_CHICKEN)));
    public static final Item CANDY_MOLD = registerItem("candy_mold", new Item(new FabricItemSettings()));
    public static final Item BONE_CANDY = registerItem("bone_candy", new Item(new FabricItemSettings().food(FoodComponents.COOKIE)));
    public static final EmptiableFoodItem SWEET_BERRY_SYRUP = registerItem("sweet_berry_syrup",
            new EmptiableFoodItem(new FabricItemSettings().food(FoodComponents.DRIED_KELP),
                    0, new ItemStack(Items.GLASS_BOTTLE), 50));
    public static final ShovelItem COMICALLY_LARGE_SPOON = registerItem("comically_large_spoon", new ShovelItem(ToolMaterials.IRON, 1, 1F, new FabricItemSettings()));
    public static final SwordItem EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ToolMaterials.IRON, 1,1F, new FabricItemSettings()));
    public static final SwordItem GOVDIAN_BAT = registerItem("govdian_bat", new SwordItem(ToolMaterials.IRON, 1,1F, new FabricItemSettings()));
    public static final SwordItem BATTLE_AXE = registerItem("zevs_battle_axe", new SwordItem(ToolMaterials.IRON, 1,1F, new FabricItemSettings()));
    public static final Item MYSTERIOUS_HORN = registerItem("mobile_multiversal_transporter", new Item(new FabricItemSettings()));
    public static final Item HOOKBERRY_REMAINS = registerItem("eaten_hook_berry", new Item(new FabricItemSettings()));
    public static final Item HOOKBERRY = registerItem("hook_berry", new Item(new FabricItemSettings()));
    public static final Item COLOURFUL_PEBBLE = registerItem("colourful_pebble", new Item(new FabricItemSettings()));
    public static final Item BUTTERFLY_EFFIGY = registerItem("butterfly_effigy", new Item(new FabricItemSettings()));
    public static final Item EMPTY_USB_STICK = registerItem("empty_usb_stick", new Item(new FabricItemSettings()));
    public static final Item BLUEPRINTS = registerItem("blueprints", new BlueprintItem(new FabricItemSettings()));
    public static final Item TEXTBOOK = registerItem("shifting_anchor_book", new Item(new FabricItemSettings()));
    public static final Item ARTIFACT = registerItem("artifact", new Item(new FabricItemSettings()));
    public static final Item ABSTRACTION_IN_A_BOTTLE = registerItem("abstraction_in_a_bottle", new AbstractionInABottleItem(new FabricItemSettings().food(FoodComponentInit.NOTHING)));
    public static final Item ENCASED_ABSTRACTION = registerItem("encased_abstraction", new Item(new FabricItemSettings()));
    public static final Item EMPTY_CEREMONIAL_CASING = registerItem("empty_ceremonial_casing", new Item(new FabricItemSettings()));
    public static final Item VOUCHER_1 = registerItem("voucher", new Item(new FabricItemSettings()));
    public static final Item VOUCHER_2 = registerItem("voucher_2", new Item(new FabricItemSettings()));
    public static final Item VOUCHER_3 = registerItem("voucher_fake", new Item(new FabricItemSettings()));
    public static final Item TWEAKERS_WAND = registerItem("tweakers_wand", new TweakersWandItem(new FabricItemSettings()));
    public static final Item BUD_OF_GAS_STATION_WEED = registerItem("bud_of_gas_station_weed", new BudOfGasStationWeedItem(new FabricItemSettings()));
    public static final Item BAG_OF_GAS_STATION_WEED = registerItem("bag_of_gas_station_weed", new BagOfGasStationWeedItem(new FabricItemSettings()));
    public static final Item HALF_FILLED_BAG_OF_GAS_STATION_WEED = registerItem("half_filled_bag_of_gas_station_weed", new Item(new FabricItemSettings()));
    public static final Item ROLLING_PAPER = registerItem("rolling_paper", new RollingPaperItem(new FabricItemSettings()));
    public static final Item JOINT = registerItem("joint", new JointItem(new FabricItemSettings()));
    public static final Item LIT_JOINT = registerItem("lit_joint", new Item(new FabricItemSettings().food(FoodComponentInit.WEED)));
}