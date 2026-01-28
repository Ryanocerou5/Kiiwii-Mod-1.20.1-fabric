package github.ryanocerou5.kiiwii.datagen;

import github.ryanocerou5.kiiwii.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        ///
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ItemInit.ALL_BETS_ARE_OFF)
                .add(ItemInit.SNAIL_DUST)
                .add(ItemInit.STAY_NEAR)
                .add(ItemInit.WEATHER_ROOM)
                .add(ItemInit.QUESTION_MARK)
                .add(ItemInit.MUSIC_CASSETTE);


        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ItemInit.ALL_BETS_ARE_OFF)
                .add(ItemInit.SNAIL_DUST)
                .add(ItemInit.STAY_NEAR)
                .add(ItemInit.WEATHER_ROOM)
                .add(ItemInit.QUESTION_MARK)
                .add(ItemInit.MUSIC_CASSETTE);
    }
}
