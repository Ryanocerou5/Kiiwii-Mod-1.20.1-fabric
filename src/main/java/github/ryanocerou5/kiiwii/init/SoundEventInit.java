package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundEventInit {
    public static final SoundEvent WINDOWS_SHUTDOWN = registerSoundEvent("windowsshutdown");
    public static final SoundEvent WHOOSH = registerSoundEvent("whoosh"); // ???
    public static final SoundEvent BEEPWARN = registerSoundEvent("beepwarn"); // ???
    public static final SoundEvent STARCLE = registerSoundEvent("starcle"); // ???
    public static final SoundEvent SHIFT = registerSoundEvent("shift"); // ???
    public static final SoundEvent RESPAWN_ANCHOR_DEACTIVATE = registerSoundEvent("respawn_anchor_deactivate");
    public static final SoundEvent MUTED_COUGH = registerSoundEvent("muted-cough");
    public static final SoundEvent DRY_COUGH = registerSoundEvent("dry-cough");
    public static final SoundEvent CRAZY_COUGH = registerSoundEvent("crazy-cough");
    public static final SoundEvent PHONE_END = registerSoundEvent("phoneend"); // ???
    public static final SoundEvent WEATHER_ROOM = registerSoundEvent("weatherroom");
    public static final SoundEvent NEW_PHONE_SOUND_1 = registerSoundEvent("newphonesound1");
    public static final SoundEvent ALERT_NEW = registerSoundEvent("alertnewe");
    public static final SoundEvent BONE_CRACK_NEW = registerSoundEvent("bonecracknew");
    public static final SoundEvent BOOWOMP_NEW = registerSoundEvent("boowompnew");
    public static final SoundEvent CHEER_NEW = registerSoundEvent("cheernew");
    public static final SoundEvent ELECTRO_WARN_NEW = registerSoundEvent("electrowarnnew");
    public static final SoundEvent FIRE_SPIT_NEW = registerSoundEvent("firespitnew");
    public static final SoundEvent GREETINGS_NEW = registerSoundEvent("greetingsnew");
    public static final SoundEvent VIOLIN_SCREECH_NEW = registerSoundEvent("violinscreechnew");
    public static final SoundEvent POP_NEW = registerSoundEvent("popnew");
    public static final SoundEvent SPARKLE_NEW = registerSoundEvent("sparklenew");
    public static final SoundEvent SUGAR_RUSH_NEW = registerSoundEvent("sugarrushnew");
    public static final SoundEvent TA_DA_NEW = registerSoundEvent("ta-danew");
    public static final SoundEvent YIPPEE_NEW = registerSoundEvent("yippeenew");
    public static final SoundEvent WRONG_NEW = registerSoundEvent("wrongnew");
    public static final SoundEvent CORRECT_NEW = registerSoundEvent("correctnew");
    public static final SoundEvent FM_RADIO_NEW = registerSoundEvent("fmradionew");
    public static final SoundEvent QUESTION_MARK_NEW = registerSoundEvent("questionmarknew");
    public static final SoundEvent STAY_NEAR_EW = registerSoundEvent("staynearnew");
    public static final SoundEvent ALL_BETS_ARE_OFF_NEW = registerSoundEvent("allbetsareoffnew");
    public static final SoundEvent SNAIL_DUST_NEW = registerSoundEvent("snaildustnew");
    public static final SoundEvent CRICKETS = registerSoundEvent("crickets");
    public static final SoundEvent COUNTDOWN = registerSoundEvent("countdown");
    public static final SoundEvent VINE_BOOM = registerSoundEvent("vineboom");
    public static final SoundEvent GHETTO_SMOSH = registerSoundEvent("ghettosmosh");
    public static final SoundEvent RIZZ = registerSoundEvent("rizz");
    public static final SoundEvent UNDERTAKER = registerSoundEvent("undertaker");
    public static final SoundEvent RECORD_SCRATCH = registerSoundEvent("recordscratch");
    public static final SoundEvent MAZ_NEW = registerSoundEvent("maznew");
    public static final SoundEvent ABSTRACTION_FILLS_SOURCE = registerSoundEvent("abstractionfillssource");
    public static final SoundEvent ABSTRACTION_DEATH = registerSoundEvent("abstractiondeath");
    public static final SoundEvent ABSTRACTION_IS_CONTAINED = registerSoundEvent("abstractioniscontained");
    public static final SoundEvent ABSTRACTION = registerSoundEvent("abstraction");
    public static final SoundEvent OMINOUS_CRASH = registerSoundEvent("ominous_crash");
    public static final SoundEvent ARTIFACT_ABSORBS_BEING = registerSoundEvent("artifactabsorbsbeing");
    public static final SoundEvent FALSE_ANCHOR_POWERS_DOWN = registerSoundEvent("falseanchorpowersdown");
    public static final SoundEvent MACHINE_SCANS = registerSoundEvent("machinescans");
    public static final SoundEvent CLICK = registerSoundEvent("click");
    public static final SoundEvent FALSE_ANCHOR_COMPUTES = registerSoundEvent("falseanchorcomputes");
    public static final SoundEvent FALSE_ANCHOR_INPUT = registerSoundEvent("falseanchorinput");
    public static final SoundEvent SHIFT_AWAY = registerSoundEvent("shiftaway");
    public static final SoundEvent LIGHTS_A_JOINT = registerSoundEvent("lightsajoint");
    public static final SoundEvent RETCHING = registerSoundEvent("retching");
    public static final SoundEvent SPACESHIP_CRASH_LANDS = registerSoundEvent("spaceshipcrashlands");
    public static final SoundEvent SPACESHIP_FALLS = registerSoundEvent("spaceshipfalls");
    public static final SoundEvent FALSE_ANCHOR_INPUT_2 = registerSoundEvent("falseanchorinput2");
    public static final SoundEvent FALSE_ANCHOR_OUTPUT_2 = registerSoundEvent("falseanchoroutput2");
    public static final SoundEvent FALSE_ANCHOR_POWERS_DOWN_2 = registerSoundEvent("falseanchorpowersown2");
    public static final SoundEvent SHIFT_AWAY_2 = registerSoundEvent("shiftaway2");

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(KiiwiiMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSoundEvents()
    {
        KiiwiiMod.LOGGER.info("Registering Sound Events for " + KiiwiiMod.MOD_ID);
    }
}
