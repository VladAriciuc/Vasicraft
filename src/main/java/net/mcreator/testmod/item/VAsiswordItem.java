
package net.mcreator.testmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.testmod.init.VasiCraftModItems;

public class VAsiswordItem extends SwordItem {
	public VAsiswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 810f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(VasiCraftModItems.HARDENEDINGOT.get()));
			}
		}, 3, -2.2f, new Item.Properties().fireResistant());
	}
}
