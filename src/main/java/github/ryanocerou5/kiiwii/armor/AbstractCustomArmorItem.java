package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;

public abstract class AbstractCustomArmorItem extends ArmorItem {

    protected AbstractCustomArmorItem(
            ArmorMaterial material,
            Type type,
            Settings settings
    ) {
        super(material, type, settings);
    }

    /** Model layer ID used by the renderer */
    public abstract EntityModelLayer getModelLayer();

    /** Texture for this armor piece */
    public abstract Identifier getTexture();

    /** Factory to create the armor model */
    public abstract AbstractArmorModel createModel(ModelPart root);

    /** Which slot this armor is for */
    public EquipmentSlot getSlot() {
        return this.getType().getEquipmentSlot();
    }
}

