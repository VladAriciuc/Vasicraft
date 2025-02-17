
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.testmod.world.inventory.FurnaceGUIMenu;
import net.mcreator.testmod.VasiCraftMod;

public class VasiCraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VasiCraftMod.MODID);
	public static final RegistryObject<MenuType<FurnaceGUIMenu>> FURNACE_GUI = REGISTRY.register("furnace_gui", () -> IForgeMenuType.create(FurnaceGUIMenu::new));
}
