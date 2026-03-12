package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public abstract class AbstractArmorModel extends BipedEntityModel<LivingEntity> {
    protected float renderScale = 1f;

    protected AbstractArmorModel(ModelPart root) {
        super(root);
    }

    public void setRenderScale(float scale) {
        this.renderScale = scale;
    }

    /** Disable all vanilla body parts */
    protected void hideAll() {
        head.visible = false;
        hat.visible = false;
        body.visible = false;
        rightArm.visible = false;
        leftArm.visible = false;
        rightLeg.visible = false;
        leftLeg.visible = false;
    }

    /** Enable only the part for the given slot */
    public void applySlotVisibility(EquipmentSlot slot) {
        hideAll();

        switch (slot) {
            case HEAD -> {
                head.visible = true;
                hat.visible = true;
            }
            case CHEST -> {
                body.visible = true;
                rightArm.visible = true;
                leftArm.visible = true;
            }
            case LEGS -> {
                body.visible = true;
                rightLeg.visible = true;
                leftLeg.visible = true;
            }
            case FEET -> {
                rightLeg.visible = true;
                leftLeg.visible = true;
            }
        }
    }
}

