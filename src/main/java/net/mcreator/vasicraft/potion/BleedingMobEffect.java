
package net.mcreator.vasicraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.vasicraft.procedures.Bleeding_activeProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407872);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Bleeding_activeProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
