package net.mcreator.testmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.testmod.init.VasiCraftModMobEffects;

public class Gata_paste_stoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(VasiCraftModMobEffects.FUMIX.get(), 1200, 0, false, false));
	}
}
