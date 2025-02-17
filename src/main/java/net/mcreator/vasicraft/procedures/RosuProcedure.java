package net.mcreator.vasicraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RosuProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		double timer = 0;
		entity.getPersistentData().putDouble("crystalbartimerred", (entity.getPersistentData().getDouble("crystalbartimerred") + 1));
		if (entity.getPersistentData().getDouble("crystalbartimerred") == 200) {
			if (entity.getPersistentData().getDouble("crystalbartimerred") >= 400) {
				entity.getPersistentData().putDouble("crystalbartimerred", 0);
			} else {
				return true;
			}
		}
		return false;
	}
}
