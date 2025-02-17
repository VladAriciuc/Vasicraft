
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BugSprayItem extends Item {
	public BugSprayItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
