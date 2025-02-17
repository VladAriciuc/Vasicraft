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

import net.mcreator.testmod.network.VasiCraftModVariables;
import net.mcreator.testmod.VasiCraftMod;

public class Vasi_sunete_randomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double timer = 0;
		if (VasiCraftModVariables.MapVariables.get(world).sunet_random >= 100 && entity.isAlive()) {
			VasiCraftModVariables.MapVariables.get(world).sunet_random = 0;
			VasiCraftModVariables.MapVariables.get(world).syncData(world);
			if (Mth.nextDouble(RandomSource.create(), 1, 10) < 3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:was_traieste")), SoundSource.HOSTILE, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:was_traieste")), SoundSource.HOSTILE, (float) 0.5, 1, false);
					}
				}
			} else {
				if (Mth.nextDouble(RandomSource.create(), 1, 10) >= 3 && Mth.nextDouble(RandomSource.create(), 1, 10) < 7) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vas_rade")), SoundSource.HOSTILE, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vas_rade")), SoundSource.HOSTILE, (float) 0.5, 1, false);
						}
					}
				} else {
					if (Mth.nextDouble(RandomSource.create(), 1, 10) >= 7 && Mth.nextDouble(RandomSource.create(), 1, 10) <= 10) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_zice_mori")), SoundSource.HOSTILE, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_zice_mori")), SoundSource.HOSTILE, (float) 0.5, 1, false);
							}
						}
					}
				}
			}
		} else {
			VasiCraftMod.queueServerWork(40, () -> {
				VasiCraftModVariables.MapVariables.get(world).sunet_random = VasiCraftModVariables.MapVariables.get(world).sunet_random + 1;
				VasiCraftModVariables.MapVariables.get(world).syncData(world);
			});
		}
	}
}
