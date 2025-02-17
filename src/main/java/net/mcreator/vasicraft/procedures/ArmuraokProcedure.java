package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.Entity;

public class ArmuraokProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("okhelmet", false);
		entity.getPersistentData().putBoolean("okchestplate", false);
		entity.getPersistentData().putBoolean("okleggins", false);
		entity.getPersistentData().putBoolean("okboots", false);
	}
}
