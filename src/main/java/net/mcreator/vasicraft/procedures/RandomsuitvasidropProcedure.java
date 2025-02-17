package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.vasicraft.init.VasiCraftModItems;

public class RandomsuitvasidropProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double local_drop = 0;
		local_drop = Math.random();
		if (local_drop <= 0.7) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(VasiCraftModItems.GRENADE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (local_drop > 0.7 && local_drop <= 1) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(VasiCraftModItems.METAXA.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
