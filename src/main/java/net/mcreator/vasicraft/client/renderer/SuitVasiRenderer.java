
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.vasicraft.entity.SuitVasiEntity;

public class SuitVasiRenderer extends HumanoidMobRenderer<SuitVasiEntity, HumanoidModel<SuitVasiEntity>> {
	public SuitVasiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SuitVasiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SuitVasiEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/vasi_sacou_1.png");
	}
}
