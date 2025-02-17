
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.vasicraft.item.ZerosapteItem;
import net.mcreator.vasicraft.item.WalletItem;
import net.mcreator.vasicraft.item.VasishovelItem;
import net.mcreator.vasicraft.item.VasiraworeItem;
import net.mcreator.vasicraft.item.VasiphoneItem;
import net.mcreator.vasicraft.item.VasimultitoolItem;
import net.mcreator.vasicraft.item.VasiingotItem;
import net.mcreator.vasicraft.item.VasihoeItem;
import net.mcreator.vasicraft.item.VasidimensionItem;
import net.mcreator.vasicraft.item.VasidiamondshovelItem;
import net.mcreator.vasicraft.item.VasidiamondaxeItem;
import net.mcreator.vasicraft.item.VasidiamondarmorItem;
import net.mcreator.vasicraft.item.VasidiamondSwordItem;
import net.mcreator.vasicraft.item.VasiaxeItem;
import net.mcreator.vasicraft.item.VasiarmorItem;
import net.mcreator.vasicraft.item.VasiPicaxeItem;
import net.mcreator.vasicraft.item.VasiDiamondPickaxeItem;
import net.mcreator.vasicraft.item.VasiDiamondItem;
import net.mcreator.vasicraft.item.VasiDiamondHoeItem;
import net.mcreator.vasicraft.item.VAsiswordItem;
import net.mcreator.vasicraft.item.UrecheItem;
import net.mcreator.vasicraft.item.StoItem;
import net.mcreator.vasicraft.item.SoapswordItem;
import net.mcreator.vasicraft.item.SapapentrulemnItem;
import net.mcreator.vasicraft.item.RedheartItem;
import net.mcreator.vasicraft.item.Proxenet2Item;
import net.mcreator.vasicraft.item.PotionofDaniMocanuItem;
import net.mcreator.vasicraft.item.PastecuStoItem;
import net.mcreator.vasicraft.item.PasteItem;
import net.mcreator.vasicraft.item.NetheritestickItem;
import net.mcreator.vasicraft.item.MetaxadrinkItem;
import net.mcreator.vasicraft.item.KnifeItem;
import net.mcreator.vasicraft.item.KarambitItem;
import net.mcreator.vasicraft.item.IcoanamodItem;
import net.mcreator.vasicraft.item.HardenedingotItem;
import net.mcreator.vasicraft.item.GrenadaItem;
import net.mcreator.vasicraft.item.GasCanItem;
import net.mcreator.vasicraft.item.ExplosivemetaxaitemItem;
import net.mcreator.vasicraft.item.ExplosivegrenadeItem;
import net.mcreator.vasicraft.item.CristalsolidItem;
import net.mcreator.vasicraft.item.CristalItem;
import net.mcreator.vasicraft.item.CoximoItem;
import net.mcreator.vasicraft.item.CosimoItem;
import net.mcreator.vasicraft.item.CigarettesItem;
import net.mcreator.vasicraft.item.CigarItem;
import net.mcreator.vasicraft.item.CardItem;
import net.mcreator.vasicraft.item.BugSprayItem;
import net.mcreator.vasicraft.item.BlackheartItem;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VasiCraftMod.MODID);
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadaItem());
	public static final RegistryObject<Item> ICOANAMOD = REGISTRY.register("icoanamod", () -> new IcoanamodItem());
	public static final RegistryObject<Item> STO = REGISTRY.register("sto", () -> new StoItem());
	public static final RegistryObject<Item> PASTA = REGISTRY.register("pasta", () -> new PasteItem());
	public static final RegistryObject<Item> STO_PASTA = REGISTRY.register("sto_pasta", () -> new PastecuStoItem());
	public static final RegistryObject<Item> VASI_INGOT = REGISTRY.register("vasi_ingot", () -> new VasiingotItem());
	public static final RegistryObject<Item> HARDENED_VASI_INGOT = REGISTRY.register("hardened_vasi_ingot", () -> new HardenedingotItem());
	public static final RegistryObject<Item> VASI_ORE = block(VasiCraftModBlocks.VASI_ORE);
	public static final RegistryObject<Item> COSIMO = REGISTRY.register("cosimo", () -> new CosimoItem());
	public static final RegistryObject<Item> COXIMO = REGISTRY.register("coximo", () -> new CoximoItem());
	public static final RegistryObject<Item> LEGO = REGISTRY.register("lego", () -> new ZerosapteItem());
	public static final RegistryObject<Item> VASI_AXE = REGISTRY.register("vasi_axe", () -> new VasiaxeItem());
	public static final RegistryObject<Item> VASI_PICAXE = REGISTRY.register("vasi_picaxe", () -> new VasiPicaxeItem());
	public static final RegistryObject<Item> VASI_SWORD = REGISTRY.register("vasi_sword", () -> new VAsiswordItem());
	public static final RegistryObject<Item> VASI_SPAWN_EGG = REGISTRY.register("vasi_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> VASI_SHOVEL = REGISTRY.register("vasi_shovel", () -> new VasishovelItem());
	public static final RegistryObject<Item> VASI_HOE = REGISTRY.register("vasi_hoe", () -> new VasihoeItem());
	public static final RegistryObject<Item> VASI_HELMET = REGISTRY.register("vasi_helmet", () -> new VasiarmorItem.Helmet());
	public static final RegistryObject<Item> VASI_CHESTPLATE = REGISTRY.register("vasi_chestplate", () -> new VasiarmorItem.Chestplate());
	public static final RegistryObject<Item> VASI_LEGGINGS = REGISTRY.register("vasi_leggings", () -> new VasiarmorItem.Leggings());
	public static final RegistryObject<Item> VASI_BOOTS = REGISTRY.register("vasi_boots", () -> new VasiarmorItem.Boots());
	public static final RegistryObject<Item> KARAMBIT = REGISTRY.register("karambit", () -> new KarambitItem());
	public static final RegistryObject<Item> RAW_VASI_ORE = REGISTRY.register("raw_vasi_ore", () -> new VasiraworeItem());
	public static final RegistryObject<Item> VASI_FURNACE = block(VasiCraftModBlocks.VASI_FURNACE);
	public static final RegistryObject<Item> CRYSTAL_POWDER = REGISTRY.register("crystal_powder", () -> new CristalItem());
	public static final RegistryObject<Item> NETHERITE_STICK = REGISTRY.register("netherite_stick", () -> new NetheritestickItem());
	public static final RegistryObject<Item> VASIMULTITOOL = REGISTRY.register("vasimultitool", () -> new VasimultitoolItem());
	public static final RegistryObject<Item> CRYSTAL_LINE = block(VasiCraftModBlocks.CRYSTAL_LINE);
	public static final RegistryObject<Item> SOLIDIFIED_CRYSTAL = REGISTRY.register("solidified_crystal", () -> new CristalsolidItem());
	public static final RegistryObject<Item> VASI_EAR = REGISTRY.register("vasi_ear", () -> new UrecheItem());
	public static final RegistryObject<Item> VASI_AGRESIV_SPAWN_EGG = REGISTRY.register("vasi_agresiv_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI_AGRESIV, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WOOD_SPADE = REGISTRY.register("wood_spade", () -> new SapapentrulemnItem());
	public static final RegistryObject<Item> VASI_BOMBER_SPAWN_EGG = REGISTRY.register("vasi_bomber_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI_BOMBER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> EXPLOSIVEGRENADE = REGISTRY.register("explosivegrenade", () -> new ExplosivegrenadeItem());
	public static final RegistryObject<Item> DEEPSLATE_VASI_ORE = block(VasiCraftModBlocks.DEEPSLATE_VASI_ORE);
	public static final RegistryObject<Item> VASI_PHONE = REGISTRY.register("vasi_phone", () -> new VasiphoneItem());
	public static final RegistryObject<Item> POTION_OF_DANI_MOCANU = REGISTRY.register("potion_of_dani_mocanu", () -> new PotionofDaniMocanuItem());
	public static final RegistryObject<Item> SOAP = block(VasiCraftModBlocks.SOAP);
	public static final RegistryObject<Item> SOAP_ENTITY_SPAWN_EGG = REGISTRY.register("soap_entity_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.SOAP_ENTITY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SOAP_BLOCK = block(VasiCraftModBlocks.SOAP_BLOCK);
	public static final RegistryObject<Item> VASI_FRIENDLY_SPAWN_EGG = REGISTRY.register("vasi_friendly_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI_FRIENDLY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SOAP_SWORD = REGISTRY.register("soap_sword", () -> new SoapswordItem());
	public static final RegistryObject<Item> SLOTS_MACHINE = block(VasiCraftModBlocks.SLOTS_MACHINE);
	public static final RegistryObject<Item> VASIDIMENSION = REGISTRY.register("vasidimension", () -> new VasidimensionItem());
	public static final RegistryObject<Item> VASI_DIAMOND = REGISTRY.register("vasi_diamond", () -> new VasiDiamondItem());
	public static final RegistryObject<Item> VASI_DIAMOND_PICKAXE = REGISTRY.register("vasi_diamond_pickaxe", () -> new VasiDiamondPickaxeItem());
	public static final RegistryObject<Item> VASI_DIAMOND_SWORD = REGISTRY.register("vasi_diamond_sword", () -> new VasidiamondSwordItem());
	public static final RegistryObject<Item> VASI_DIAMOND_AXE = REGISTRY.register("vasi_diamond_axe", () -> new VasidiamondaxeItem());
	public static final RegistryObject<Item> VASI_DIAMOND_SHOVEL = REGISTRY.register("vasi_diamond_shovel", () -> new VasidiamondshovelItem());
	public static final RegistryObject<Item> VASI_DIAMOND_HOE = REGISTRY.register("vasi_diamond_hoe", () -> new VasiDiamondHoeItem());
	public static final RegistryObject<Item> WEED = block(VasiCraftModBlocks.WEED);
	public static final RegistryObject<Item> VASI_DIAMOND_ORE = block(VasiCraftModBlocks.VASI_DIAMOND_ORE);
	public static final RegistryObject<Item> METAXA = REGISTRY.register("metaxa", () -> new MetaxadrinkItem());
	public static final RegistryObject<Item> EXPLOSIVE_METAXA = REGISTRY.register("explosive_metaxa", () -> new ExplosivemetaxaitemItem());
	public static final RegistryObject<Item> VASIDIAMONDARMOR_HELMET = REGISTRY.register("vasidiamondarmor_helmet", () -> new VasidiamondarmorItem.Helmet());
	public static final RegistryObject<Item> VASIDIAMONDARMOR_CHESTPLATE = REGISTRY.register("vasidiamondarmor_chestplate", () -> new VasidiamondarmorItem.Chestplate());
	public static final RegistryObject<Item> VASIDIAMONDARMOR_LEGGINGS = REGISTRY.register("vasidiamondarmor_leggings", () -> new VasidiamondarmorItem.Leggings());
	public static final RegistryObject<Item> VASIDIAMONDARMOR_BOOTS = REGISTRY.register("vasidiamondarmor_boots", () -> new VasidiamondarmorItem.Boots());
	public static final RegistryObject<Item> VASI_MUTANT_SPAWN_EGG = REGISTRY.register("vasi_mutant_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.VASI_MUTANT, -3381760, -13421569, new Item.Properties()));
	public static final RegistryObject<Item> BLACKHEART = REGISTRY.register("blackheart", () -> new BlackheartItem());
	public static final RegistryObject<Item> REDHEART = REGISTRY.register("redheart", () -> new RedheartItem());
	public static final RegistryObject<Item> VASI_SHOP = block(VasiCraftModBlocks.VASI_SHOP);
	public static final RegistryObject<Item> WALLET = REGISTRY.register("wallet", () -> new WalletItem());
	public static final RegistryObject<Item> CHAIR_SPAWN_EGG = REGISTRY.register("chair_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.CHAIR, -16777216, -65536, new Item.Properties()));
	public static final RegistryObject<Item> ROULETTE_TABLE = block(VasiCraftModBlocks.ROULETTE_TABLE);
	public static final RegistryObject<Item> GAS_CAN = REGISTRY.register("gas_can", () -> new GasCanItem());
	public static final RegistryObject<Item> BLACK_JACK_TABLE = block(VasiCraftModBlocks.BLACK_JACK_TABLE);
	public static final RegistryObject<Item> CARD = REGISTRY.register("card", () -> new CardItem());
	public static final RegistryObject<Item> VASI_ATM = block(VasiCraftModBlocks.VASI_ATM);
	public static final RegistryObject<Item> NASUC_ENTITY_SPAWN_EGG = REGISTRY.register("nasuc_entity_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.NASUC_ENTITY, -13108, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> SKODA_SPAWN_EGG = REGISTRY.register("skoda_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.SKODA, -3342337, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> PROXENET_2 = REGISTRY.register("proxenet_2", () -> new Proxenet2Item());
	public static final RegistryObject<Item> SHIRT_VASI_SPAWN_EGG = REGISTRY.register("shirt_vasi_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.SHIRT_VASI, -3407872, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> CIGARETTES = REGISTRY.register("cigarettes", () -> new CigarettesItem());
	public static final RegistryObject<Item> CIGAR = REGISTRY.register("cigar", () -> new CigarItem());
	public static final RegistryObject<Item> CCCCCCC = block(VasiCraftModBlocks.CCCCCCC);
	public static final RegistryObject<Item> LEGO_POT = block(VasiCraftModBlocks.LEGO_POT);
	public static final RegistryObject<Item> BUG_SPRAY = REGISTRY.register("bug_spray", () -> new BugSprayItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> SUIT_VASI_SPAWN_EGG = REGISTRY.register("suit_vasi_spawn_egg", () -> new ForgeSpawnEggItem(VasiCraftModEntities.SUIT_VASI, -3299476, -16777216, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
