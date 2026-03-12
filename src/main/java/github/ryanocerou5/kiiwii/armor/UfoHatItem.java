package github.ryanocerou5.kiiwii.armor;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;

public class UfoHatItem extends AbstractCustomArmorItem {

    public static final EntityModelLayer MODEL_LAYER =
            new EntityModelLayer(new Identifier(KiiwiiMod.MOD_ID, "ufo_hat_layer"), "main");

    public UfoHatItem(ArmorMaterial material) {
        super(material, Type.HELMET, new Settings());
    }

    @Override
    public EntityModelLayer getModelLayer() {
        return MODEL_LAYER;
    }

    @Override
    public Identifier getTexture() {
        return new Identifier(KiiwiiMod.MOD_ID, "textures/entities/ufo_hat.png");
    }

    @Override
    public AbstractArmorModel createModel(ModelPart root) {
        return new UfoHatModel(root);
    }
}
