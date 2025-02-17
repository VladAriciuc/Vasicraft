
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.vasicraft.enchantment.SoapedEnchantment;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, VasiCraftMod.MODID);
	public static final RegistryObject<Enchantment> SOAPED = REGISTRY.register("soaped", () -> new SoapedEnchantment());
}
