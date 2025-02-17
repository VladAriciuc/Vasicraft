
package net.mcreator.testmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VasiraworeItem extends Item {
	public VasiraworeItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
