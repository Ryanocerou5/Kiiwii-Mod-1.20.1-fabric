package github.ryanocerou5.kiiwii.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponentInit {

    public static final FoodComponent NOTHING = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .alwaysEdible()
            .build();
    public static final FoodComponent ZENDER_PILL = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffectInit.ZENDER_EFFECT, 200, 9, false, true, true), 1f)
            .build();
    public static final FoodComponent PANACEA_PILL = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent BOWL_OF_SUGAR = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 3, false, false, true), 1f)
            .build();
    public static final FoodComponent SOULFUL_MEAL = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent SOULFUL_LOLLIPOP = new FoodComponent.Builder()
            .hunger(10)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent GHOSTLY_MEAL = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 100, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent GHOSTLY_LOLLIPOP = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent CRAZY_HAMBURGER = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 1, false, false, true), 1f)
            .build();

    public static final FoodComponent LUCKY_CIGARETTE = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent MINT_CIGARETTE = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent CANDY_CIGARETTE = new FoodComponent.Builder()
            .hunger(2)
            .saturationModifier(0.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1, false, false, true), 1f)
            .build();

    public static final FoodComponent WEED = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffectInit.HIGH_EFFECT, 400, 0, false, true, true), 1f)
            .build();
}
