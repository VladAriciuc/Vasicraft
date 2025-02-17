package net.mcreator.testmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Absobtioum_si_saturationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sto_timer = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.ABSORPTION) && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.SATURATION)) {
			entity.getPersistentData().putDouble("potion", (entity.getPersistentData().getDouble("potion") + 1200));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1200, 1, false, false));
			entity.getPersistentData().putDouble("potion", 0);
		}
	}
}
