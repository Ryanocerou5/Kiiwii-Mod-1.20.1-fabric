package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.*;

public class UfoHatModel extends AbstractArmorModel {
    protected UfoHatModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        ModelPartData head = root.addChild("head", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        ModelPartData ufoHat = head.addChild("ufo_hat", ModelPartBuilder.create()
                .uv(6, 6).cuboid(-9.0F, -10.0F, -8.0F, 2.0F, 2.0F, 16.0F, new Dilation(0.0F))
                .uv(6, 6).cuboid(7.0F, -10.0F, -8.0F, 2.0F, 2.0F, 16.0F, new Dilation(0.0F))
                .uv(1, 0).cuboid(-9.0F, -10.0F, 8.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(1, 0).cuboid(-9.0F, -10.0F, -10.0F, 18.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-7.0F, -12.0F, -8.0F, 14.0F, 4.0F, 16.0F, new Dilation(0.0F)),
                ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));

        root.addChild("hat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        root.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        return TexturedModelData.of(data, 64, 64);
    }
}