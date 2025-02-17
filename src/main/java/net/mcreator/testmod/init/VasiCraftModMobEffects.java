
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.testmod.potion.NasucMobEffect;
import net.mcreator.testmod.potion.FumixMobEffect;
import net.mcreator.testmod.VasiCraftMod;

public class VasiCraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, VasiCraftMod.MODID);
	public static final RegistryObject<MobEffect> FUMIX = REGISTRY.register("fumix", () -> new FumixMobEffect());
	public static final RegistryObject<MobEffect> NASUC = REGISTRY.register("nasuc", () -> new NasucMobEffect());
}
