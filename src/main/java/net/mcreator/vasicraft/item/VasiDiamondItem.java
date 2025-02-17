
package net.mcreator.vasicraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VasiDiamondItem extends Item {
	public VasiDiamondItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
