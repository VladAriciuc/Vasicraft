
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.vasicraft.block.entity.SlotsMachineBlockEntity;
import net.mcreator.vasicraft.block.entity.ShewpBlockEntity;
import net.mcreator.vasicraft.block.entity.RoulettetableBlockEntity;
import net.mcreator.vasicraft.block.entity.LegoPotBlockEntity;
import net.mcreator.vasicraft.block.entity.Furnace2BlockEntity;
import net.mcreator.vasicraft.block.entity.BlackJackTableBlockEntity;
import net.mcreator.vasicraft.block.entity.ATMBlockEntity;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VasiCraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> VASI_FURNACE = register("vasi_furnace", VasiCraftModBlocks.VASI_FURNACE, Furnace2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SLOTS_MACHINE = register("slots_machine", VasiCraftModBlocks.SLOTS_MACHINE, SlotsMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VASI_SHOP = register("vasi_shop", VasiCraftModBlocks.VASI_SHOP, ShewpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROULETTE_TABLE = register("roulette_table", VasiCraftModBlocks.ROULETTE_TABLE, RoulettetableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLACK_JACK_TABLE = register("black_jack_table", VasiCraftModBlocks.BLACK_JACK_TABLE, BlackJackTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VASI_ATM = register("vasi_atm", VasiCraftModBlocks.VASI_ATM, ATMBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LEGO_POT = register("lego_pot", VasiCraftModBlocks.LEGO_POT, LegoPotBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
