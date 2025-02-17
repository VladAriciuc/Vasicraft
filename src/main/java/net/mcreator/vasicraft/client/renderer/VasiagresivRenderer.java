
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.vasicraft.entity.VasiagresivEntity;

public class VasiagresivRenderer extends HumanoidMobRenderer<VasiagresivEntity, HumanoidModel<VasiagresivEntity>> {
	public VasiagresivRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<VasiagresivEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(VasiagresivEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/vasi_agresiv_textura.png");
	}
}
