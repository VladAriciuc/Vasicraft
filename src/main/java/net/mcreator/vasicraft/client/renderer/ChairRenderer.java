
package net.mcreator.vasicraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.vasicraft.entity.ChairEntity;
import net.mcreator.vasicraft.client.model.Modelslots_chair_Converted;

public class ChairRenderer extends MobRenderer<ChairEntity, Modelslots_chair_Converted<ChairEntity>> {
	public ChairRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelslots_chair_Converted<ChairEntity>(context.bakeLayer(Modelslots_chair_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChairEntity entity) {
		return new ResourceLocation("vasi_craft:textures/entities/chair_texture3.png");
	}
}
