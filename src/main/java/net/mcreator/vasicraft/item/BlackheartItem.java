
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlackheartItem extends Item {
	public BlackheartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
