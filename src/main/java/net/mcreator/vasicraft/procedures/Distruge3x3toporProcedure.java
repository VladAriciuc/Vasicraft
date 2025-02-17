package net.mcreator.vasicraft.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class Distruge3x3toporProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String tag = "";
		double i = 0;
		double j = 0;
		double blockbroken = 0;
		if (entity.getPersistentData().getBoolean("axe_active") == true) {
			tag = "minecraft:logs";
			i = -1;
			for (int index0 = 0; index0 < 2; index0++) {
				j = -1;
				for (int index1 = 0; index1 < 10; index1++) {
					if (i != 0 || j != 0) {
						if (entity.getXRot() > 60 || entity.getXRot() < -60) {
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
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity)) {
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
}
