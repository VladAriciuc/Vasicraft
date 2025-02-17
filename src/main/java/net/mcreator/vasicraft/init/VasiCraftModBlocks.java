
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.vasicraft.block.WeedBlock;
import net.mcreator.vasicraft.block.VasioreBlock;
import net.mcreator.vasicraft.block.VasidimensionPortalBlock;
import net.mcreator.vasicraft.block.VasidiamondoreBlock;
import net.mcreator.vasicraft.block.SoapblockBlock;
import net.mcreator.vasicraft.block.SoapBlock;
import net.mcreator.vasicraft.block.SlotsMachineBlock;
import net.mcreator.vasicraft.block.ShewpBlock;
import net.mcreator.vasicraft.block.RoulettetableBlock;
import net.mcreator.vasicraft.block.LiniecristalBlock;
import net.mcreator.vasicraft.block.LegoPotBlock;
import net.mcreator.vasicraft.block.Furnace2Block;
import net.mcreator.vasicraft.block.DeepslatevasioreBlock;
import net.mcreator.vasicraft.block.CccccccBlock;
import net.mcreator.vasicraft.block.BlackJackTableBlock;
import net.mcreator.vasicraft.block.ATMBlock;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VasiCraftMod.MODID);
	public static final RegistryObject<Block> VASI_ORE = REGISTRY.register("vasi_ore", () -> new VasioreBlock());
	public static final RegistryObject<Block> VASI_FURNACE = REGISTRY.register("vasi_furnace", () -> new Furnace2Block());
	public static final RegistryObject<Block> CRYSTAL_LINE = REGISTRY.register("crystal_line", () -> new LiniecristalBlock());
	public static final RegistryObject<Block> DEEPSLATE_VASI_ORE = REGISTRY.register("deepslate_vasi_ore", () -> new DeepslatevasioreBlock());
	public static final RegistryObject<Block> SOAP = REGISTRY.register("soap", () -> new SoapBlock());
	public static final RegistryObject<Block> SOAP_BLOCK = REGISTRY.register("soap_block", () -> new SoapblockBlock());
	public static final RegistryObject<Block> SLOTS_MACHINE = REGISTRY.register("slots_machine", () -> new SlotsMachineBlock());
	public static final RegistryObject<Block> VASIDIMENSION_PORTAL = REGISTRY.register("vasidimension_portal", () -> new VasidimensionPortalBlock());
	public static final RegistryObject<Block> WEED = REGISTRY.register("weed", () -> new WeedBlock());
	public static final RegistryObject<Block> VASI_DIAMOND_ORE = REGISTRY.register("vasi_diamond_ore", () -> new VasidiamondoreBlock());
	public static final RegistryObject<Block> VASI_SHOP = REGISTRY.register("vasi_shop", () -> new ShewpBlock());
	public static final RegistryObject<Block> ROULETTE_TABLE = REGISTRY.register("roulette_table", () -> new RoulettetableBlock());
	public static final RegistryObject<Block> BLACK_JACK_TABLE = REGISTRY.register("black_jack_table", () -> new BlackJackTableBlock());
	public static final RegistryObject<Block> VASI_ATM = REGISTRY.register("vasi_atm", () -> new ATMBlock());
	public static final RegistryObject<Block> CCCCCCC = REGISTRY.register("ccccccc", () -> new CccccccBlock());
	public static final RegistryObject<Block> LEGO_POT = REGISTRY.register("lego_pot", () -> new LegoPotBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
