package github.ryanocerou5.kiiwii.Armor;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;

public class CrownHelmetItem extends AbstractCustomArmorItem {

    public static final EntityModelLayer MODEL_LAYER =
            new EntityModelLayer(new Identifier(KiiwiiMod.MOD_ID, "crown_helmet"), "main");

    public CrownHelmetItem(ArmorMaterial material) {
        super(material, Type.HELMET, new Settings());
    }

    @Override
    public EntityModelLayer getModelLayer() {
        return MODEL_LAYER;
    }

    @Override
    public Identifier getTexture() {
        return new Identifier(KiiwiiMod.MOD_ID, "textures/entities/crownn2.png");
    }
}

