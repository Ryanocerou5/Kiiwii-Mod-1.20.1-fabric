package github.ryanocerou5.kiiwii.item;

import github.ryanocerou5.kiiwii.init.SoundEventInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class MetalCigaretteItem extends AbstractCigaretteItem {
    public MetalCigaretteItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player) {
            RegistryEntry<DamageType> generic = world.getRegistryManager()
                    .get(RegistryKeys.DAMAGE_TYPE)
                    .entryOf(DamageTypes.GENERIC);
            player.damage(new DamageSource(generic), 2.0F);
        }

        return result;
    }
}
