package net.mcreator.vasicraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.vasicraft.init.VasiCraftModMobEffects;

public class Bleeding_effect_vasi_swordProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.BLEEDING.get(), 200, 0, false, true));
	}
}
