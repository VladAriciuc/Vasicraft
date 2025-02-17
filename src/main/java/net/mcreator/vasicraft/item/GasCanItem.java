
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GasCanItem extends Item {
	public GasCanItem() {
		super(new Item.Properties().durability(300).rarity(Rarity.COMMON));
	}
}
