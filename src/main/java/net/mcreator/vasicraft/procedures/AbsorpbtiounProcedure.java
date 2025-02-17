package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class AbsorpbtiounProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sto_timer = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.ABSORPTION)) {
			entity.getPersistentData().putDouble("potion", (entity.getPersistentData().getDouble("potion") + 1200));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0, false, false));
			entity.getPersistentData().putDouble("potion", 0);
		}
	}
}
