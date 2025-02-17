package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class Activate3x3toporProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("axe_active") == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Advanced chopping: active"), true);
			entity.getPersistentData().putBoolean("axe_active", true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Advanced chopping: inactive"), true);
			entity.getPersistentData().putBoolean("axe_active", false);
		}
	}
}
