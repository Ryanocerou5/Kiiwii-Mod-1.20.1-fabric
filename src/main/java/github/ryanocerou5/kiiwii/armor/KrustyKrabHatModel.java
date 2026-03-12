package github.ryanocerou5.kiiwii.armor;

import net.minecraft.client.model.*;

public class KrustyKrabHatModel extends AbstractArmorModel {
    protected KrustyKrabHatModel(ModelPart root) {
        super(root);
        this.setRenderScale(0.25f);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        ModelPartData head = root.addChild("head", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        ModelPartData krustyKrabHat = head.addChild("krusty_krab_hat", ModelPartBuilder.create()
                .uv(0, 0).cuboid(-4.0F, -48.0F, -4.0F, 8.0F, 16.0F, 8.0F, new Dilation(0.0F))
                .uv(16, 0).cuboid(-4.0F, -48.0F, -4.0F, 8.0F, 0.0F, 8.0F, new Dilation(0.0F))
                .uv(4, 28).cuboid(-4.0F, -36.0F, -8.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F)),
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