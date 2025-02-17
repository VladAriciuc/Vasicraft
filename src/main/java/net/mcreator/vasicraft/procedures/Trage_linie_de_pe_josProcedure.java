package net.mcreator.vasicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.init.VasiCraftModMobEffects;

import java.util.Map;

public class Trage_linie_de_pe_josProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sto_timer = 0;
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = Blocks.AIR.defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
				if (_property != null && _bs.getValue(_property) != null)
					try {
						_bs = _bs.setValue(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_nasuc")), SoundSource.PLAYERS, (float) 0.4, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_nasuc")), SoundSource.PLAYERS, (float) 0.4, 1, false);
			}
		}
		entity.getPersistentData().putDouble("cpower", (entity.getPersistentData().getDouble("cpower") + 4));
		if (entity.getPersistentData().getDouble("cpower") <= entity.getPersistentData().getDouble("cmpower")) {
			if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(VasiCraftModMobEffects.NASUC.get()) && entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.DAMAGE_BOOST) && entity instanceof LivingEntity _livEnt8
					&& _livEnt8.hasEffect(MobEffects.SATURATION)) {
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
