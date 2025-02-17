
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.vasicraft.entity.SoapblockentityEntity;

public class SoapblockentityRenderer extends MobRenderer<SoapblockentityEntity, OcelotModel<SoapblockentityEntity>> {
	public SoapblockentityRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel<SoapblockentityEntity>(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoapblockentityEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/soap_entity.png");
	}
}
