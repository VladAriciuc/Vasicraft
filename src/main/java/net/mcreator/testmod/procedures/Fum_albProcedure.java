package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.testmod.VasiCraftMod;

public class Fum_albProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
		VasiCraftMod.queueServerWork(200, () -> {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
			VasiCraftMod.queueServerWork(200, () -> {
				world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
				world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
				world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0), (y + 2), z, 0, 0.1, 0);
			});
		});
	}
}
