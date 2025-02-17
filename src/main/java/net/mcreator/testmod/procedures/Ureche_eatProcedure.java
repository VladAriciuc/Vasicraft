package net.mcreator.testmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Ureche_eatProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WATER_BREATHING) && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.REGENERATION) && entity instanceof LivingEntity _livEnt2
				&& _livEnt2.hasEffect(MobEffects.DAMAGE_RESISTANCE) && entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.DAMAGE_BOOST)) {
			entity.getPersistentData().putDouble("potion", (entity.getPersistentData().getDouble("potion") + 2400));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) entity.getPersistentData().getDouble("potion"), 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) entity.getPersistentData().getDouble("potion"), 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, (int) entity.getPersistentData().getDouble("potion"), 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) entity.getPersistentData().getDouble("potion"), 2, false, false));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2400, 2, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 3, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 2, false, false));
			entity.getPersistentData().putDouble("potion", 0);
		}
	}
}
