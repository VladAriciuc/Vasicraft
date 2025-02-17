
package net.mcreator.testmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.testmod.init.VasiCraftModItems;

public class VasihoeItem extends HoeItem {
	public VasihoeItem() {
		super(new Tier() {
			public int getUses() {
				return 280;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(VasiCraftModItems.HARDENEDINGOT.get()));
			}
		}, 0, -0.5f, new Item.Properties().fireResistant());
	}
}
