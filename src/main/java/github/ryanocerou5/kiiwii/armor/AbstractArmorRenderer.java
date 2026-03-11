package github.ryanocerou5.kiiwii.armor;

import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractArmorRenderer<T extends AbstractCustomArmorItem>
        implements ArmorRenderer {

    protected final Map<EntityModelLayer, AbstractArmorModel> models = new HashMap<>();

    protected AbstractArmorRenderer(EntityModelLoader loader) {
        registerModels(loader);
    }

    /** Register all model layers used by this renderer */
    protected abstract void registerModels(EntityModelLoader loader);

    protected static void applyPartRotation(MatrixStack matrices, BipedEntityModel<?> contextModel, EquipmentSlot slot) {
        switch (slot) {
            case HEAD -> contextModel.head.rotate(matrices);
            case CHEST -> {
                contextModel.body.rotate(matrices);
                contextModel.leftArm.rotate(matrices);
                contextModel.rightArm.rotate(matrices);
            }
            case LEGS -> {
                contextModel.leftLeg.rotate(matrices);
                contextModel.rightLeg.rotate(matrices);
                contextModel.body.rotate(matrices);
            }
            case FEET -> {
                contextModel.leftLeg.rotate(matrices);
                contextModel.rightLeg.rotate(matrices);
            }
        }
    }

    @Override
    public void render(
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            ItemStack stack,
            LivingEntity entity,
            EquipmentSlot slot,
            int light,
            BipedEntityModel<LivingEntity> contextModel
    ) {
        if (!(stack.getItem() instanceof AbstractCustomArmorItem armor)) return;

        // Try to get the model from the map
        AbstractArmorModel model = models.get(armor.getModelLayer());

        // Lazy-load if it doesn't exist yet
        if (model == null) {
            System.out.println("Trying to lazy-load model for " + armor.getModelLayer().toString());
            ModelPart root;
            try {
                root = MinecraftClient.getInstance()
                        .getEntityModelLoader()
                        .getModelPart(armor.getModelLayer());
                System.out.println("ModelPart loaded successfully");
                model = armor.createModel(root);
                models.put(armor.getModelLayer(), model);
            } catch (Exception e) {
                // If it's still not ready, just return this frame
                System.out.println("Failed to load ModelPart for " + armor.getModelLayer().toString());
                e.printStackTrace();
                return;
            }
        }

        // Copy state from the player model
        contextModel.copyStateTo(model);
        model.applySlotVisibility(slot);

        // Get vertex consumer for texture
        VertexConsumer consumer = vertexConsumers.getBuffer(
                RenderLayer.getEntityCutoutNoCull(armor.getTexture())
        );

        // Push matrix stack
        matrices.push();

        // Apply rotation for this slot (head, chest, legs, or feet)
        applyPartRotation(matrices, contextModel, slot);

        // Render the model
        model.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV, 1F, 1F, 1F, 1F);

        // Pop matrix stack
        matrices.pop();
    }
}

