package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class SkodagastickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double efficiency = 0;
		if (entity.getPersistentData().getDouble("gas") <= 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3, 50));
		} else {
			if (efficiency == 0) {
				entity.getPersistentData().putDouble("gas", (entity.getPersistentData().getDouble("gas") - 1));
				efficiency = 400;
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + entity.getPersistentData().getDouble("gas"))), false);
			} else {
				efficiency = efficiency - 1;
			}
		}
	}
}
