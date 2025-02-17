
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

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

import net.mcreator.testmod.VasiCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VasiCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VasiCraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> VASI_CRAFT = REGISTRY.register("vasi_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vasi_craft.vasi_craft")).icon(() -> new ItemStack(VasiCraftModItems.ICOANAMOD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VasiCraftModBlocks.VASI_FURNACE.get().asItem());
				tabData.accept(VasiCraftModItems.GRENADA.get());
				tabData.accept(VasiCraftModItems.CRISTALSOLID.get());
				tabData.accept(VasiCraftModItems.CRISTAL.get());
				tabData.accept(VasiCraftModItems.ZEROSAPTE.get());
				tabData.accept(VasiCraftModItems.STO.get());
				tabData.accept(VasiCraftModItems.PASTE.get());
				tabData.accept(VasiCraftModItems.PASTECU_STO.get());
				tabData.accept(VasiCraftModItems.COSIMO.get());
				tabData.accept(VasiCraftModItems.COXIMO.get());
				tabData.accept(VasiCraftModBlocks.VASIORE.get().asItem());
				tabData.accept(VasiCraftModItems.VASIRAWORE.get());
				tabData.accept(VasiCraftModItems.VASIINGOT.get());
				tabData.accept(VasiCraftModItems.HARDENEDINGOT.get());
				tabData.accept(VasiCraftModItems.NETHERITESTICK.get());
				tabData.accept(VasiCraftModItems.VASIAXE.get());
				tabData.accept(VasiCraftModItems.VASI_PICAXE.get());
				tabData.accept(VasiCraftModItems.VASI_SWORD.get());
				tabData.accept(VasiCraftModItems.VASISHOVEL.get());
				tabData.accept(VasiCraftModItems.VASIHOE.get());
				tabData.accept(VasiCraftModItems.KARAMBIT.get());
				tabData.accept(VasiCraftModItems.URECHE.get());
				tabData.accept(VasiCraftModItems.VASI_HELMET.get());
				tabData.accept(VasiCraftModItems.VASI_CHESTPLATE.get());
				tabData.accept(VasiCraftModItems.VASI_LEGGINGS.get());
				tabData.accept(VasiCraftModItems.VASI_BOOTS.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(VasiCraftModItems.VASI_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(VasiCraftModItems.VASI_HELMET.get());
			tabData.accept(VasiCraftModItems.VASI_CHESTPLATE.get());
			tabData.accept(VasiCraftModItems.VASI_LEGGINGS.get());
			tabData.accept(VasiCraftModItems.VASI_BOOTS.get());
		}
	}
}
