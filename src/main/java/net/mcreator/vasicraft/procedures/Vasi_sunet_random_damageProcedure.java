package net.mcreator.vasicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.entity.VasiEntity;

public class Vasi_sunet_random_damageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sound = 0;
		sound = Math.random();
		if (!world.getEntitiesOfClass(VasiEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
			if (sound < 0.4) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:was_damage2")), SoundSource.HOSTILE, (float) 0.5, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:was_damage2")), SoundSource.HOSTILE, (float) 0.5, 1, false);
					}
				}
			} else {
				if (sound >= 0.4 && sound <= 0.6) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_zice_mori")), SoundSource.HOSTILE, (float) 0.5, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_zice_mori")), SoundSource.HOSTILE, (float) 0.5, 1, false);
						}
					}
				} else {
					if (sound > 0.6) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_bai")), SoundSource.HOSTILE, (float) 0.5, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_bai")), SoundSource.HOSTILE, (float) 0.5, 1, false);
							}
						}
					}
				}
			}
		}
	}
}
