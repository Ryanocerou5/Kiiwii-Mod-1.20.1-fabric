package github.ryanocerou5.kiiwii.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ZenderStatusEffect extends StatusEffect {
    public ZenderStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x660088);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

    }
}
