
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedheartItem extends Item {
	public RedheartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
