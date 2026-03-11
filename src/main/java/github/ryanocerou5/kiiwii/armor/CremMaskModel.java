package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.*;

public class CremMaskModel extends AbstractArmorModel{
    protected CremMaskModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        ModelPartData head = root.addChild("head", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        head.addChild("crem_mask", ModelPartBuilder.create()
                .uv(1, 1).cuboid(-3.0F, -8.0F, -5.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 1).cuboid(-4.0F, -7.0F, -5.0F, 8.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 1).cuboid(-3.0F, -1.0F, -5.0F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F)),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        return TexturedModelData.of(data, 64, 64);
    }
}