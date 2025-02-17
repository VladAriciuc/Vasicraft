package net.mcreator.vasicraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.vasicraft.init.VasiCraftModEnchantments;
import net.mcreator.vasicraft.entity.VasibomberEntity;
import net.mcreator.vasicraft.entity.VasiagresivEntity;
import net.mcreator.vasicraft.entity.VasiMutantEntity;
import net.mcreator.vasicraft.entity.VasiEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SoapenchantProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(VasiCraftModEnchantments.SOAPED.get()) > 0
				&& (entity instanceof VasiagresivEntity || entity instanceof VasibomberEntity || entity instanceof VasiEntity || entity instanceof VasiMutantEntity)) {
			sourceentity.getPersistentData().putDouble("LevelSoap", ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(VasiCraftModEnchantments.SOAPED.get())));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, (int) sourceentity.getPersistentData().getDouble("LevelSoap"), false, false));
		}
	}
}
