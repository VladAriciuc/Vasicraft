package net.mcreator.testmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.testmod.init.VasiCraftModMobEffects;

public class Gata_stoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double sto_timer = 0;
		entity.getPersistentData().putDouble("cpower", (entity.getPersistentData().getDouble("cpower") + 2));
		if (entity.getPersistentData().getDouble("cpower") < entity.getPersistentData().getDouble("cmpower")) {
			if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.MOVEMENT_SPEED) && entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.DIG_SPEED) && entity instanceof LivingEntity _livEnt6
					&& _livEnt6.hasEffect(VasiCraftModMobEffects.FUMIX.get())) {
				entity.getPersistentData().putDouble("potion", (entity.getPersistentData().getDouble("potion") + 600));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.FUMIX.get(), (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.FUMIX.get(), 1200, 1, false, false));
				entity.getPersistentData().putDouble("potion", 0);
			}
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) entity.getPersistentData().getDouble("potion"), 1, false, false));
		}
	}
}
