package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.Entity;

public class C1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("procent") >= 20) {
			return true;
		}
		return false;
	}
}
