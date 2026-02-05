package github.ryanocerou5.kiiwii.Armor;

import net.minecraft.client.model.*;

public class CrownHelmetModel extends AbstractArmorModel {

    // Blockbench exported root
    public CrownHelmetModel(ModelPart root) {
        super(root);
    }

    // This is what the model layer registry uses to build the ModelPart tree
    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData root = data.getRoot();

        // Example cube for crown; replace with your Blockbench export
        root.addChild("head",
                ModelPartBuilder.create()
                        .uv(0, 0)
                        .cuboid(-4.0F, -8.0F, -4.0F, 8, 8, 8),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F)
        );

        return TexturedModelData.of(data, 32, 32);
    }
}
