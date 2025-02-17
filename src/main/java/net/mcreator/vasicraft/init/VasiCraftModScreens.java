
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.vasicraft.client.gui.SlotsmachineguiScreen;
import net.mcreator.vasicraft.client.gui.SkodainventoryScreen;
import net.mcreator.vasicraft.client.gui.ShopguiScreen;
import net.mcreator.vasicraft.client.gui.RouletteguiScreen;
import net.mcreator.vasicraft.client.gui.LegopotguiScreen;
import net.mcreator.vasicraft.client.gui.FurnaceGUIScreen;
import net.mcreator.vasicraft.client.gui.BlackjackguiScreen;
import net.mcreator.vasicraft.client.gui.AtmguiScreen;
import net.mcreator.vasicraft.client.gui.ArmurafriendlyvasiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VasiCraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(VasiCraftModMenus.FURNACE_GUI.get(), FurnaceGUIScreen::new);
			MenuScreens.register(VasiCraftModMenus.ARMURAFRIENDLYVASI.get(), ArmurafriendlyvasiScreen::new);
			MenuScreens.register(VasiCraftModMenus.SLOTSMACHINEGUI.get(), SlotsmachineguiScreen::new);
			MenuScreens.register(VasiCraftModMenus.SHOPGUI.get(), ShopguiScreen::new);
			MenuScreens.register(VasiCraftModMenus.ROULETTEGUI.get(), RouletteguiScreen::new);
			MenuScreens.register(VasiCraftModMenus.SKODAINVENTORY.get(), SkodainventoryScreen::new);
			MenuScreens.register(VasiCraftModMenus.BLACKJACKGUI.get(), BlackjackguiScreen::new);
			MenuScreens.register(VasiCraftModMenus.ATMGUI.get(), AtmguiScreen::new);
			MenuScreens.register(VasiCraftModMenus.LEGOPOTGUI.get(), LegopotguiScreen::new);
		});
	}
}
