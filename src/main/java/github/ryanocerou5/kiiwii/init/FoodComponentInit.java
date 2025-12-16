package github.ryanocerou5.kiiwii.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponentInit {

    public static final FoodComponent DULL_PILL = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .build();
    public static final FoodComponent ZENDER_PILL = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false, true), 1f)
            .build();
    public static final FoodComponent PANACEA_PILL = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 200, 1, false, false, true), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200, 1, false, false, true), 1f)
            .build();
}
