package net.mcreator.vasicraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.vasicraft.entity.VasiMutantEntity;

public class VasiMutantModel extends GeoModel<VasiMutantEntity> {
	@Override
	public ResourceLocation getAnimationResource(VasiMutantEntity entity) {
		return new ResourceLocation("vasi_craft", "animations/vasi_death.geo_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VasiMutantEntity entity) {
		return new ResourceLocation("vasi_craft", "geo/vasi_death.geo_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VasiMutantEntity entity) {
		return new ResourceLocation("vasi_craft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
