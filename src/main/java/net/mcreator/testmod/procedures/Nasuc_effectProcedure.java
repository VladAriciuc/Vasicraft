package net.mcreator.testmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.testmod.init.VasiCraftModMobEffects;

public class Nasuc_effectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sto_timer = 0;
		entity.getPersistentData().putDouble("cpower", (entity.getPersistentData().getDouble("cpower") + 4));
		if (entity.getPersistentData().getDouble("cpower") <= entity.getPersistentData().getDouble("cmpower")) {
			if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(VasiCraftModMobEffects.NASUC.get()) && entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.DAMAGE_BOOST) && entity instanceof LivingEntity _livEnt6
					&& _livEnt6.hasEffect(MobEffects.SATURATION)) {
				entity.getPersistentData().putDouble("potion", (entity.getPersistentData().getDouble("potion") + 600));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.NASUC.get(), (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.NASUC.get(), 1200, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1200, 0, false, false));
				entity.getPersistentData().putDouble("potion", 0);
			}
		} else {
			if (entity.getPersistentData().getDouble("cpower") >= 2 * entity.getPersistentData().getDouble("cmpower")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) entity.getPersistentData().getDouble("potion"), 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) entity.getPersistentData().getDouble("potion"), 50, false, false));
			}
		}
	}
}
