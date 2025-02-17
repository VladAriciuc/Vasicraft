package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.Entity;

public class Drop_armor_stuffProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("SabieValue") == 1) {
			entity.getPersistentData().putDouble("SabieValue", 0);
		}
		if (entity.getPersistentData().getDouble("CascaValue") == 1) {
			entity.getPersistentData().putDouble("CascaValue", 0);
		}
		if (entity.getPersistentData().getDouble("ChestValue") == 1) {
			entity.getPersistentData().putDouble("ChestValue", 0);
		}
		if (entity.getPersistentData().getDouble("PantaValue") == 1) {
			entity.getPersistentData().putDouble("PantaValue", 0);
		}
		if (entity.getPersistentData().getDouble("BootsValue") == 1) {
			entity.getPersistentData().putDouble("BootsValue", 0);
		}
	}
}
