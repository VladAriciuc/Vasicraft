package net.mcreator.vasicraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.vasicraft.entity.NasucEntityEntity;

public class NasucEntityModel extends GeoModel<NasucEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(NasucEntityEntity entity) {
		return new ResourceLocation("vasi_craft", "animations/nasuc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NasucEntityEntity entity) {
		return new ResourceLocation("vasi_craft", "geo/nasuc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NasucEntityEntity entity) {
		return new ResourceLocation("vasi_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
