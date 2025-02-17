
package net.mcreator.vasicraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Proxenet2Item extends RecordItem {
	public Proxenet2Item() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:proxenet2")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4400);
	}
}
