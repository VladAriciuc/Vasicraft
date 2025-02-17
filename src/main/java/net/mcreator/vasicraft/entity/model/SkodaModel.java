package net.mcreator.vasicraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.vasicraft.entity.SkodaEntity;

public class SkodaModel extends GeoModel<SkodaEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkodaEntity entity) {
		return new ResourceLocation("vasi_craft", "animations/skoda.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkodaEntity entity) {
		return new ResourceLocation("vasi_craft", "geo/skoda.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkodaEntity entity) {
		return new ResourceLocation("vasi_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
