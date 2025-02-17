package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class MetaxavasisuitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 0, Level.ExplosionInteraction.TNT);
		}
	}
}
