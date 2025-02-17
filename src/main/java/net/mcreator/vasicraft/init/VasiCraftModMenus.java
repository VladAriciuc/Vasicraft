
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.vasicraft.world.inventory.SlotsmachineguiMenu;
import net.mcreator.vasicraft.world.inventory.SkodainventoryMenu;
import net.mcreator.vasicraft.world.inventory.ShopguiMenu;
import net.mcreator.vasicraft.world.inventory.RouletteguiMenu;
import net.mcreator.vasicraft.world.inventory.LegopotguiMenu;
import net.mcreator.vasicraft.world.inventory.FurnaceGUIMenu;
import net.mcreator.vasicraft.world.inventory.BlackjackguiMenu;
import net.mcreator.vasicraft.world.inventory.AtmguiMenu;
import net.mcreator.vasicraft.world.inventory.ArmurafriendlyvasiMenu;
import net.mcreator.vasicraft.VasiCraftMod;

public class VasiCraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VasiCraftMod.MODID);
	public static final RegistryObject<MenuType<FurnaceGUIMenu>> FURNACE_GUI = REGISTRY.register("furnace_gui", () -> IForgeMenuType.create(FurnaceGUIMenu::new));
	public static final RegistryObject<MenuType<ArmurafriendlyvasiMenu>> ARMURAFRIENDLYVASI = REGISTRY.register("armurafriendlyvasi", () -> IForgeMenuType.create(ArmurafriendlyvasiMenu::new));
	public static final RegistryObject<MenuType<SlotsmachineguiMenu>> SLOTSMACHINEGUI = REGISTRY.register("slotsmachinegui", () -> IForgeMenuType.create(SlotsmachineguiMenu::new));
	public static final RegistryObject<MenuType<ShopguiMenu>> SHOPGUI = REGISTRY.register("shopgui", () -> IForgeMenuType.create(ShopguiMenu::new));
	public static final RegistryObject<MenuType<RouletteguiMenu>> ROULETTEGUI = REGISTRY.register("roulettegui", () -> IForgeMenuType.create(RouletteguiMenu::new));
	public static final RegistryObject<MenuType<SkodainventoryMenu>> SKODAINVENTORY = REGISTRY.register("skodainventory", () -> IForgeMenuType.create(SkodainventoryMenu::new));
	public static final RegistryObject<MenuType<BlackjackguiMenu>> BLACKJACKGUI = REGISTRY.register("blackjackgui", () -> IForgeMenuType.create(BlackjackguiMenu::new));
	public static final RegistryObject<MenuType<AtmguiMenu>> ATMGUI = REGISTRY.register("atmgui", () -> IForgeMenuType.create(AtmguiMenu::new));
	public static final RegistryObject<MenuType<LegopotguiMenu>> LEGOPOTGUI = REGISTRY.register("legopotgui", () -> IForgeMenuType.create(LegopotguiMenu::new));
}
