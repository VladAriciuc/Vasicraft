
package net.mcreator.testmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IcoanamodItem extends Item {
	public IcoanamodItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
