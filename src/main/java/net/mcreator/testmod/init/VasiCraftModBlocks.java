
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testmod.block.VasioreBlock;
import net.mcreator.testmod.block.LiniecristalBlock;
import net.mcreator.testmod.block.Furnace2Block;
import net.mcreator.testmod.VasiCraftMod;

public class VasiCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VasiCraftMod.MODID);
	public static final RegistryObject<Block> VASIORE = REGISTRY.register("vasiore", () -> new VasioreBlock());
	public static final RegistryObject<Block> VASI_FURNACE = REGISTRY.register("vasi_furnace", () -> new Furnace2Block());
	public static final RegistryObject<Block> LINIECRISTAL = REGISTRY.register("liniecristal", () -> new LiniecristalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
