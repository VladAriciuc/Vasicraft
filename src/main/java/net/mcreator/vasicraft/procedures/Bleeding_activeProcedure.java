package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class Bleeding_activeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double repeat = 0;
		if (entity.getPersistentData().getDouble("bleeding_timer") == 0) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1);
			entity.getPersistentData().putDouble("bleeding_timer", 20);
		} else {
			entity.getPersistentData().putDouble("bleeding_timer", (entity.getPersistentData().getDouble("bleeding_timer") - 1));
		}
	}
}
