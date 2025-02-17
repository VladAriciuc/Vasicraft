
package net.mcreator.vasicraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.vasicraft.procedures.Fumix_effectProcedure;

public class FumixMobEffect extends MobEffect {
	public FumixMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10079488);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Fumix_effectProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
