package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.Entity;

public class ReturncpowerProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Math.round(entity.getPersistentData().getDouble("cpower")) + "/" + Math.round(entity.getPersistentData().getDouble("cmpower"));
	}
}
