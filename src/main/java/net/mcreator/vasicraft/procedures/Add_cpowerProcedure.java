package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.Entity;

public class Add_cpowerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cpower") + 2 <= entity.getPersistentData().getDouble("cmpower")) {
			entity.getPersistentData().putDouble("cpower", (entity.getPersistentData().getDouble("cpower") + 2));
		}
	}
}
