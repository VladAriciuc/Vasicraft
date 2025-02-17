package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import java.util.function.Supplier;
import java.util.Map;

public class RoulettespinbuttonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		if (!world.isClientSide()) {
			slot = Mth.nextInt(RandomSource.create(), 0, 37);
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.SUNFLOWER).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) slot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
