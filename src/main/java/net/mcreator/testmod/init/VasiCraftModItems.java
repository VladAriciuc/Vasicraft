
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testmod.item.ZerosapteItem;
import net.mcreator.testmod.item.VasishovelItem;
import net.mcreator.testmod.item.VasiraworeItem;
import net.mcreator.testmod.item.VasimultitoolItem;
import net.mcreator.testmod.item.VasiingotItem;
import net.mcreator.testmod.item.VasihoeItem;
import net.mcreator.testmod.item.VasiaxeItem;
import net.mcreator.testmod.item.VasiarmorItem;
import net.mcreator.testmod.item.VasiPicaxeItem;
import net.mcreator.testmod.item.VAsiswordItem;
import net.mcreator.testmod.item.UrecheItem;
import net.mcreator.testmod.item.StoItem;
import net.mcreator.testmod.item.PastecuStoItem;
import net.mcreator.testmod.item.PasteItem;
import net.mcreator.testmod.item.NetheritestickItem;
import net.mcreator.testmod.item.KarambitItem;
import net.mcreator.testmod.item.IcoanamodItem;
import net.mcreator.testmod.item.HardenedingotItem;
import net.mcreator.testmod.item.GrenadaItem;
import net.mcreator.testmod.item.CristalsolidItem;
import net.mcreator.testmod.item.CristalItem;
import net.mcreator.testmod.item.CoximoItem;
import net.mcreator.testmod.item.CosimoItem;
import net.mcreator.testmod.VasiCraftMod;

public class VasiCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VasiCraftMod.MODID);
	public static final RegistryObject<Item> GRENADA = REGISTRY.register("grenada", () -> new GrenadaItem());
	public static final RegistryObject<Item> ICOANAMOD = REGISTRY.register("icoanamod", () -> new IcoanamodItem());
	public static final RegistryObject<Item> STO = REGISTRY.register("sto", () -> new StoItem());
	public static final RegistryObject<Item> PASTE = REGISTRY.register("paste", () -> new PasteItem());
	public static final RegistryObject<Item> PASTECU_STO = REGISTRY.register("pastecu_sto", () -> new PastecuStoItem());
	public static final RegistryObject<Item> VASIINGOT = REGISTRY.register("vasiingot", () -> new VasiingotItem());
	public static final RegistryObject<Item> HARDENEDINGOT = REGISTRY.register("hardenedingot", () -> new HardenedingotItem());
	public static final RegistryObject<Item> VASIORE = block(VasiCraftModBlocks.VASIORE);
	public static final RegistryObject<Item> COSIMO = REGISTRY.register("cosimo", () -> new CosimoItem());
	public static final RegistryObject<Item> COXIMO = REGISTRY.register("coximo", () -> new CoximoItem());
	public static final RegistryObject<Item> ZEROSAPTE = REGISTRY.register("zerosapte", () -> new ZerosapteItem());
	public static final RegistryObject<Item> VASIAXE = REGISTRY.register("vasiaxe", () -> new VasiaxeItem());
	public static final RegistryObject<Item> VASI_PICAXE = REGISTRY.register("vasi_picaxe", () -> new VasiPicaxeItem());
	public static final RegistryObject<Item> VASI_SWORD = REGISTRY.register("vasi_sword", () -> new VAsiswordItem());
	public static final RegistryObject<Item> VASI_SPAWN_EGG = REGISTRY.register("vasi_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> VASISHOVEL = REGISTRY.register("vasishovel", () -> new VasishovelItem());
	public static final RegistryObject<Item> VASIHOE = REGISTRY.register("vasihoe", () -> new VasihoeItem());
	public static final RegistryObject<Item> VASI_HELMET = REGISTRY.register("vasi_helmet", () -> new VasiarmorItem.Helmet());
	public static final RegistryObject<Item> VASI_CHESTPLATE = REGISTRY.register("vasi_chestplate", () -> new VasiarmorItem.Chestplate());
	public static final RegistryObject<Item> VASI_LEGGINGS = REGISTRY.register("vasi_leggings", () -> new VasiarmorItem.Leggings());
	public static final RegistryObject<Item> VASI_BOOTS = REGISTRY.register("vasi_boots", () -> new VasiarmorItem.Boots());
	public static final RegistryObject<Item> KARAMBIT = REGISTRY.register("karambit", () -> new KarambitItem());
	public static final RegistryObject<Item> VASIRAWORE = REGISTRY.register("vasirawore", () -> new VasiraworeItem());
	public static final RegistryObject<Item> VASI_FURNACE = block(VasiCraftModBlocks.VASI_FURNACE);
	public static final RegistryObject<Item> CRISTAL = REGISTRY.register("cristal", () -> new CristalItem());
	public static final RegistryObject<Item> NETHERITESTICK = REGISTRY.register("netheritestick", () -> new NetheritestickItem());
	public static final RegistryObject<Item> VASIMULTITOOL = REGISTRY.register("vasimultitool", () -> new VasimultitoolItem());
	public static final RegistryObject<Item> LINIECRISTAL = block(VasiCraftModBlocks.LINIECRISTAL);
	public static final RegistryObject<Item> CRISTALSOLID = REGISTRY.register("cristalsolid", () -> new CristalsolidItem());
	public static final RegistryObject<Item> URECHE = REGISTRY.register("ureche", () -> new UrecheItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
