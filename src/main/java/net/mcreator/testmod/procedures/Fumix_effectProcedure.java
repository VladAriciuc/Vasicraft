package net.mcreator.testmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class Fumix_effectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("fumix") == Mth.nextInt(RandomSource.create(), 10, 500)) {
			if (entity.getPersistentData().getDouble("fumix") > 50 && entity.getPersistentData().getDouble("fumix") < 150) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:mario_bulangiule")), SoundSource.PLAYERS, (float) 0.2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:mario_bulangiule")), SoundSource.PLAYERS, (float) 0.2, 1, false);
					}
				}
				entity.getPersistentData().putDouble("fumix", 0);
			} else {
				if (entity.getPersistentData().getDouble("fumix") > 150 && entity.getPersistentData().getDouble("fumix") < 200) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:tdi_cold_start")), SoundSource.PLAYERS, (float) 0.2, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:tdi_cold_start")), SoundSource.PLAYERS, (float) 0.2, 1, false);
						}
					}
				} else {
					if (entity.getPersistentData().getDouble("fumix") > 200 && entity.getPersistentData().getDouble("fumix") < 250) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:pizza")), SoundSource.PLAYERS, (float) 0.2, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:pizza")), SoundSource.PLAYERS, (float) 0.2, 1, false);
							}
						}
					} else {
						if (entity.getPersistentData().getDouble("fumix") > 250 && entity.getPersistentData().getDouble("fumix") < 400) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_rade2")), SoundSource.PLAYERS, (float) 0.2, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_rade2")), SoundSource.PLAYERS, (float) 0.2, 1, false);
								}
							}
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("fumix", (entity.getPersistentData().getDouble("fumix") + 1));
		}
	}
}
