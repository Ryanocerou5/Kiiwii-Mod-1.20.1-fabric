package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.*;

public class AcesHatModel extends AbstractArmorModel{
    protected AcesHatModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        ModelPartData head = root.addChild("head", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        ModelPartData acesHat = head.addChild("aces_hat", ModelPartBuilder.create().uv(4, 14).cuboid(-3.0F, -9.8F, -3.0F, 6.0F, 1.0F, 6.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.0F, -11.5F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

        acesHat.addChild("cube_r1", ModelPartBuilder.create().uv(4, 42).cuboid(0.99F, -9.6F, -7.0F, 0.01F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -2.4F, 0.0F, 0.0F, 0.0F, -0.7854F));
        acesHat.addChild("cube_r2", ModelPartBuilder.create().uv(34, 35).cuboid(-1.01F, -9.6F, -7.0F, 0.01F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -2.4F, 0.0F, 0.0F, 0.0F, 0.7854F));
        acesHat.addChild("cube_r3", ModelPartBuilder.create().uv(2, 34).cuboid(-7.0F, -9.6F, -1.0F, 14.0F, 7.0F, 0.01F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.4F, -9.0F, -0.7854F, 0.0F, 0.0F));
        acesHat.addChild("cube_r4", ModelPartBuilder.create().uv(34, 35).cuboid(-7.0F, -9.7F, 1.0F, 14.0F, 7.0F, 0.01F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.3F, 9.0F, 0.7854F, 0.0F, 0.0F));

        root.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        return TexturedModelData.of(data, 64, 64);
    }
}