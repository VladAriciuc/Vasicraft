
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CodModel;

import net.mcreator.vasicraft.entity.SoapentityEntity;

public class SoapentityRenderer extends MobRenderer<SoapentityEntity, CodModel<SoapentityEntity>> {
	public SoapentityRenderer(EntityRendererProvider.Context context) {
		super(context, new CodModel<SoapentityEntity>(context.bakeLayer(ModelLayers.COD)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoapentityEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/soap_entity.png");
	}
}
