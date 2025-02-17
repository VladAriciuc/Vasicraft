
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CardItem extends Item {
	public CardItem() {
		super(new Item.Properties().stacksTo(52).rarity(Rarity.COMMON));
	}
}
