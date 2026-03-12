package github.ryanocerou5.kiiwii.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractCustomDisc extends MusicDiscItem {
    private final String subtitleKey;
    public AbstractCustomDisc(int comparatorOutput, SoundEvent sound, Settings settings, int lengthInSeconds, String subtitleKey) {
        super(comparatorOutput, sound, settings, lengthInSeconds);
        this.subtitleKey = subtitleKey;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (subtitleKey != null && !subtitleKey.isEmpty()) {
            tooltip.add(Text.translatable(subtitleKey).formatted(Formatting.GRAY));
        }
    }
}
