package github.ryanocerou5.kiiwii.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class HighStatusEffect extends StatusEffect {
    public HighStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x008800);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

    }
}
