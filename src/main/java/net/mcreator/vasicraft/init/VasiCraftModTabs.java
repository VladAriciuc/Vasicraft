
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.vasicraft.VasiCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VasiCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VasiCraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> VASI_CRAFT = REGISTRY.register("vasi_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vasi_craft.vasi_craft")).icon(() -> new ItemStack(VasiCraftModItems.ICOANAMOD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VasiCraftModBlocks.VASI_FURNACE.get().asItem());
				tabData.accept(VasiCraftModItems.GRENADE.get());
				tabData.accept(VasiCraftModItems.EXPLOSIVEGRENADE.get());
				tabData.accept(VasiCraftModItems.LEGO.get());
				tabData.accept(VasiCraftModItems.SOLIDIFIED_CRYSTAL.get());
				tabData.accept(VasiCraftModItems.CRYSTAL_POWDER.get());
				tabData.accept(VasiCraftModItems.STO.get());
				tabData.accept(VasiCraftModItems.PASTA.get());
				tabData.accept(VasiCraftModItems.STO_PASTA.get());
				tabData.accept(VasiCraftModItems.COSIMO.get());
				tabData.accept(VasiCraftModItems.COXIMO.get());
				tabData.accept(VasiCraftModItems.VASI_EAR.get());
				tabData.accept(VasiCraftModItems.POTION_OF_DANI_MOCANU.get());
				tabData.accept(VasiCraftModItems.NETHERITE_STICK.get());
				tabData.accept(VasiCraftModItems.VASI_PICAXE.get());
				tabData.accept(VasiCraftModItems.VASI_SWORD.get());
				tabData.accept(VasiCraftModItems.VASI_AXE.get());
				tabData.accept(VasiCraftModItems.VASI_HOE.get());
				tabData.accept(VasiCraftModItems.VASI_SHOVEL.get());
				tabData.accept(VasiCraftModItems.KARAMBIT.get());
				tabData.accept(VasiCraftModItems.SOAP_SWORD.get());
				tabData.accept(VasiCraftModItems.WOOD_SPADE.get());
				tabData.accept(VasiCraftModItems.VASI_PHONE.get());
				tabData.accept(VasiCraftModBlocks.VASI_ORE.get().asItem());
				tabData.accept(VasiCraftModBlocks.DEEPSLATE_VASI_ORE.get().asItem());
				tabData.accept(VasiCraftModItems.RAW_VASI_ORE.get());
				tabData.accept(VasiCraftModItems.VASI_INGOT.get());
				tabData.accept(VasiCraftModItems.HARDENED_VASI_INGOT.get());
				tabData.accept(VasiCraftModItems.VASI_HELMET.get());
				tabData.accept(VasiCraftModItems.VASI_CHESTPLATE.get());
				tabData.accept(VasiCraftModItems.VASI_LEGGINGS.get());
				tabData.accept(VasiCraftModItems.VASI_BOOTS.get());
				tabData.accept(VasiCraftModBlocks.SOAP.get().asItem());
				tabData.accept(VasiCraftModBlocks.SOAP_BLOCK.get().asItem());
				tabData.accept(VasiCraftModBlocks.SLOTS_MACHINE.get().asItem());
				tabData.accept(VasiCraftModItems.VASIDIMENSION.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND_PICKAXE.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND_SWORD.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND_SHOVEL.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND_AXE.get());
				tabData.accept(VasiCraftModItems.VASI_DIAMOND_HOE.get());
				tabData.accept(VasiCraftModBlocks.VASI_DIAMOND_ORE.get().asItem());
				tabData.accept(VasiCraftModItems.EXPLOSIVE_METAXA.get());
				tabData.accept(VasiCraftModItems.VASIDIAMONDARMOR_HELMET.get());
				tabData.accept(VasiCraftModItems.VASIDIAMONDARMOR_CHESTPLATE.get());
				tabData.accept(VasiCraftModItems.VASIDIAMONDARMOR_LEGGINGS.get());
				tabData.accept(VasiCraftModItems.VASIDIAMONDARMOR_BOOTS.get());
				tabData.accept(VasiCraftModItems.METAXA.get());
				tabData.accept(VasiCraftModItems.WALLET.get());
				tabData.accept(VasiCraftModItems.CHAIR_SPAWN_EGG.get());
				tabData.accept(VasiCraftModItems.VASI_MUTANT_SPAWN_EGG.get());
				tabData.accept(VasiCraftModItems.GAS_CAN.get());
				tabData.accept(VasiCraftModBlocks.VASI_ATM.get().asItem());
				tabData.accept(VasiCraftModBlocks.VASI_SHOP.get().asItem());
				tabData.accept(VasiCraftModItems.NASUC_ENTITY_SPAWN_EGG.get());
				tabData.accept(VasiCraftModItems.SKODA_SPAWN_EGG.get());
				tabData.accept(VasiCraftModItems.SHIRT_VASI_SPAWN_EGG.get());
				tabData.accept(VasiCraftModItems.CIGARETTES.get());
				tabData.accept(VasiCraftModItems.CIGAR.get());
				tabData.accept(VasiCraftModBlocks.CCCCCCC.get().asItem());
				tabData.accept(VasiCraftModBlocks.WEED.get().asItem());
				tabData.accept(VasiCraftModBlocks.LEGO_POT.get().asItem());
				tabData.accept(VasiCraftModItems.BUG_SPRAY.get());
				tabData.accept(VasiCraftModItems.KNIFE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(VasiCraftModItems.VASI_SPAWN_EGG.get());
			tabData.accept(VasiCraftModItems.VASI_AGRESIV_SPAWN_EGG.get());
			tabData.accept(VasiCraftModItems.VASI_BOMBER_SPAWN_EGG.get());
			tabData.accept(VasiCraftModItems.VASI_FRIENDLY_SPAWN_EGG.get());
			tabData.accept(VasiCraftModItems.SUIT_VASI_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(VasiCraftModItems.VASI_HELMET.get());
			tabData.accept(VasiCraftModItems.VASI_CHESTPLATE.get());
			tabData.accept(VasiCraftModItems.VASI_LEGGINGS.get());
			tabData.accept(VasiCraftModItems.VASI_BOOTS.get());
		}
	}
}
