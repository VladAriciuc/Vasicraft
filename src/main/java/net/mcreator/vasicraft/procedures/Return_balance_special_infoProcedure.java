package net.mcreator.vasicraft.procedures;

import net.minecraft.world.item.ItemStack;

public class Return_balance_special_infoProcedure {
	public static String execute(ItemStack itemstack) {
		return "Balance: " + Math.round(itemstack.getOrCreateTag().getDouble("balance"));
	}
}
