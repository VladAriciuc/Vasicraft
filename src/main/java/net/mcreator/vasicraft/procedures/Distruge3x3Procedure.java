package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Distruge3x3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String tag = "";
		double i = 0;
		double j = 0;
		double blockbroken = 0;
		if (entity.getPersistentData().getBoolean("hammer_active") == true) {
			tag = "mineable/pickaxe";
			i = -1;
			for (int index0 = 0; index0 < 3; index0++) {
				j = -1;
				for (int index1 = 0; index1 < 3; index1++) {
					if (i != 0 || j != 0) {
						if (entity.getXRot() > 40 || entity.getXRot() < -40) {
							if ((world.getBlockState(BlockPos.containing(x + i, y, z + j))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
								{
									BlockPos _pos = BlockPos.containing(x + i, y, z + j);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
								blockbroken = blockbroken + 1;
							}
						} else if ((entity.getDirection()).getAxis() == Direction.Axis.Z) {
							if ((world.getBlockState(BlockPos.containing(x + i, y + j, z))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
								{
									BlockPos _pos = BlockPos.containing(x + i, y + j, z);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
								blockbroken = blockbroken + 1;
							}
						} else if ((entity.getDirection()).getAxis() == Direction.Axis.X) {
							if ((world.getBlockState(BlockPos.containing(x, y + j, z + i))).is(BlockTags.create(new ResourceLocation((tag).toLowerCase(java.util.Locale.ENGLISH))))) {
								{
									BlockPos _pos = BlockPos.containing(x, y + j, z + i);
									Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
								blockbroken = blockbroken + 1;
							}
						}
					}
					j = j + 1;
				}
				i = i + 1;
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt((int) blockbroken, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
