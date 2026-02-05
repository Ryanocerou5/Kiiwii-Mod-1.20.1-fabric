package github.ryanocerou5.kiiwii.renderer;

import github.ryanocerou5.kiiwii.Armor.AbstractArmorRenderer;
import github.ryanocerou5.kiiwii.Armor.AbstractCustomArmorItem;
import github.ryanocerou5.kiiwii.Armor.CrownHelmetItem;
import github.ryanocerou5.kiiwii.Armor.CrownHelmetModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;

public class ModArmorRenderer extends AbstractArmorRenderer<AbstractCustomArmorItem> {

    public ModArmorRenderer(EntityModelLoader loader) {
        super(loader);
    }

    @Override
    protected void registerModels(EntityModelLoader loader) {
        models.put(
                CrownHelmetItem.MODEL_LAYER,
                new CrownHelmetModel(loader.getModelPart(CrownHelmetItem.MODEL_LAYER))
        );
    }
}

