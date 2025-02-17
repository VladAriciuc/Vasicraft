
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.vasicraft.potion.SmardoiMobEffect;
import net.mcreator.vasicraft.potion.NasucMobEffect;
import net.mcreator.vasicraft.potion.FumixMobEffect;
import net.mcreator.vasicraft.potion.BleedingMobEffect;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, VasiCraftMod.MODID);
	public static final RegistryObject<MobEffect> FUMIX = REGISTRY.register("fumix", () -> new FumixMobEffect());
	public static final RegistryObject<MobEffect> NASUC = REGISTRY.register("nasuc", () -> new NasucMobEffect());
	public static final RegistryObject<MobEffect> SMARDOI = REGISTRY.register("smardoi", () -> new SmardoiMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
