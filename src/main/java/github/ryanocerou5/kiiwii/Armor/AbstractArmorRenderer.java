package github.ryanocerou5.kiiwii.Armor;

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
            ModelPart root;
            try {
                root = MinecraftClient.getInstance()
                        .getEntityModelLoader()
                        .getModelPart(armor.getModelLayer());
            } catch (Exception e) {
                // If it's still not ready, just return this frame
                return;
            }

            // Construct your model and store it
            model = new CrownHelmetModel(root);
            models.put(armor.getModelLayer(), model);
        }

        // Copy state from the player model
        contextModel.copyStateTo(model);
        model.applySlotVisibility(slot);

        // Get vertex consumer for texture
        VertexConsumer consumer = vertexConsumers.getBuffer(
                RenderLayer.getEntityCutoutNoCull(armor.getTexture())
        );

        // Render the model
        model.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV, 1F, 1F, 1F, 1F);
    }

}

