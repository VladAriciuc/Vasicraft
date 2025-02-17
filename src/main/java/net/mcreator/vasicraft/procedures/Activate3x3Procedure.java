package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class Activate3x3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("hammer_active") == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3X3 digging mode: active"), true);
			entity.getPersistentData().putBoolean("hammer_active", true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3X3 digging mode: inactive"), true);
			entity.getPersistentData().putBoolean("hammer_active", false);
		}
	}
}
