
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.vasicraft.entity.FriendlyvasiEntity;

public class FriendlyvasiRenderer extends HumanoidMobRenderer<FriendlyvasiEntity, HumanoidModel<FriendlyvasiEntity>> {
	public FriendlyvasiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<FriendlyvasiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(FriendlyvasiEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/vasi_prieten.png");
	}
}
