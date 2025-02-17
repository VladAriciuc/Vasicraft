
package net.mcreator.testmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.testmod.procedures.Auzi_vasiProcedure;

public class NasucMobEffect extends MobEffect {
	public NasucMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066432);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Auzi_vasiProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
