
package net.mcreator.testmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.testmod.entity.VasiEntity;

public class VasiRenderer extends HumanoidMobRenderer<VasiEntity, HumanoidModel<VasiEntity>> {
	public VasiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<VasiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(VasiEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/vasi_textura_finalaaaa.png");
	}
}
