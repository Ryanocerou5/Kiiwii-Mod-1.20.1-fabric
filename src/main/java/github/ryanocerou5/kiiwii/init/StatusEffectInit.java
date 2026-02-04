package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.effect.AbstractionSicknessStatusEffect;
import github.ryanocerou5.kiiwii.effect.AeonianShellStatusEffect;
import github.ryanocerou5.kiiwii.effect.HighStatusEffect;
import github.ryanocerou5.kiiwii.effect.ZenderStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class StatusEffectInit {
    public static final StatusEffect HIGH_EFFECT = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(KiiwiiMod.MOD_ID, "high"),
            new HighStatusEffect()
    );
    public static final StatusEffect ZENDER_EFFECT = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(KiiwiiMod.MOD_ID, "zender"),
            new ZenderStatusEffect()
    );
    public static final StatusEffect AEONIAN_SHELL_EFFECT = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(KiiwiiMod.MOD_ID, "aeonian_shell"),
            new AeonianShellStatusEffect()
    );
    public static final StatusEffect ABSTRACTION_SICKNESS_EFFECT = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(KiiwiiMod.MOD_ID, "abstract_sickness"),
            new AbstractionSicknessStatusEffect()
    );

    public static void register() {
        KiiwiiMod.LOGGER.info("Registering Status Effects for " + KiiwiiMod.MOD_ID);
    }
}
