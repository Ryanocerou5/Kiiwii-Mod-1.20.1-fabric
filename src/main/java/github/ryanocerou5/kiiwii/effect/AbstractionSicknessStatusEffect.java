package github.ryanocerou5.kiiwii.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.network.ServerPlayerEntity;

public class AbstractionSicknessStatusEffect extends StatusEffect {
    public AbstractionSicknessStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0x000000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!(entity instanceof ServerPlayerEntity player)) return;

        StatusEffectInstance instance = player.getStatusEffect(this);
        if (instance == null) return;

        // If the effect is at 1 tick remaining, run logic
        if (instance.getDuration() == 1) {
            float random = player.getRandom().nextFloat();
            if (random < 0.1F) {
                player.kill();
            }
        }
    }
}
