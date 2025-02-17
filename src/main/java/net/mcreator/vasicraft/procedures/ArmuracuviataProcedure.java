package net.mcreator.vasicraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.vasicraft.init.VasiCraftModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ArmuracuviataProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == VasiCraftModItems.VASIDIAMONDARMOR_HELMET.get() && entity.getPersistentData().getBoolean("okhelmet") == false) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") + 2.5));
			entity.getPersistentData().putBoolean("okhelmet", true);
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem() && entity.getPersistentData().getBoolean("okhelmet") == true) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") - 2.5));
			entity.getPersistentData().putBoolean("okhelmet", false);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == VasiCraftModItems.VASIDIAMONDARMOR_CHESTPLATE.get()
				&& entity.getPersistentData().getBoolean("okchestplate") == false) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") + 4));
			entity.getPersistentData().putBoolean("okchestplate", true);
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem() && entity.getPersistentData().getBoolean("okchestplate") == true) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") - 4));
			entity.getPersistentData().putBoolean("okchestplate", false);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == VasiCraftModItems.VASIDIAMONDARMOR_LEGGINGS.get()
				&& entity.getPersistentData().getBoolean("okleggins") == false) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") + 3.5));
			entity.getPersistentData().putBoolean("okleggins", true);
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem() && entity.getPersistentData().getBoolean("okleggins") == true) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") - 3.5));
			entity.getPersistentData().putBoolean("okleggins", false);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == VasiCraftModItems.VASIDIAMONDARMOR_BOOTS.get() && entity.getPersistentData().getBoolean("okboots") == false) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") + 2));
			entity.getPersistentData().putBoolean("okboots", true);
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem() && entity.getPersistentData().getBoolean("okboots") == true) {
			entity.getPersistentData().putDouble("hs", (entity.getPersistentData().getDouble("hs") - 2));
			entity.getPersistentData().putBoolean("okboots", false);
		}
		if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity49.getAttribute(Attributes.MAX_HEALTH).setBaseValue((20 + entity.getPersistentData().getDouble("hs")));
	}
}
