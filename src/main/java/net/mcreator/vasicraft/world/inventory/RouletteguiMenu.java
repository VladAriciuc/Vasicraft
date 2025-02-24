
package net.mcreator.vasicraft.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.init.VasiCraftModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class RouletteguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public RouletteguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(VasiCraftModMenus.ROULETTEGUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(74);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 121, 32) {
			private final int slot = 0;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 103, 32) {
			private final int slot = 1;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 85, 32) {
			private final int slot = 2;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 67, 32) {
			private final int slot = 3;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 49, 32) {
			private final int slot = 4;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 31, 32) {
			private final int slot = 5;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 31, 50) {
			private final int slot = 6;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 31, 68) {
			private final int slot = 7;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 31, 86) {
			private final int slot = 8;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 31, 104) {
			private final int slot = 9;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 31, 122) {
			private final int slot = 10;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 31, 140) {
			private final int slot = 11;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 31, 158) {
			private final int slot = 12;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 31, 176) {
			private final int slot = 13;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 31, 194) {
			private final int slot = 14;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 49, 194) {
			private final int slot = 15;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 67, 194) {
			private final int slot = 16;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 85, 194) {
			private final int slot = 17;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 103, 194) {
			private final int slot = 18;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 121, 194) {
			private final int slot = 19;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 139, 194) {
			private final int slot = 20;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 157, 194) {
			private final int slot = 21;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 175, 194) {
			private final int slot = 22;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 193, 194) {
			private final int slot = 23;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 211, 194) {
			private final int slot = 24;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 211, 176) {
			private final int slot = 25;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 211, 158) {
			private final int slot = 26;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 211, 140) {
			private final int slot = 27;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 211, 122) {
			private final int slot = 28;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 211, 104) {
			private final int slot = 29;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 211, 86) {
			private final int slot = 30;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 211, 68) {
			private final int slot = 31;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 211, 50) {
			private final int slot = 32;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 211, 32) {
			private final int slot = 33;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 193, 32) {
			private final int slot = 34;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 175, 32) {
			private final int slot = 35;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 157, 32) {
			private final int slot = 36;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 139, 32) {
			private final int slot = 37;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;

			@Override
			public boolean mayPickup(Player entity) {
				return false;
			}

			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 265, 14) {
			private final int slot = 38;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 283, 14) {
			private final int slot = 39;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 301, 14) {
			private final int slot = 40;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 319, 14) {
			private final int slot = 41;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 337, 14) {
			private final int slot = 42;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 355, 14) {
			private final int slot = 43;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 373, 14) {
			private final int slot = 44;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 391, 14) {
			private final int slot = 45;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 409, 14) {
			private final int slot = 46;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 265, 32) {
			private final int slot = 47;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 283, 32) {
			private final int slot = 48;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 301, 32) {
			private final int slot = 49;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 319, 32) {
			private final int slot = 50;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 337, 32) {
			private final int slot = 51;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 355, 32) {
			private final int slot = 52;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 373, 32) {
			private final int slot = 53;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 391, 32) {
			private final int slot = 54;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 409, 32) {
			private final int slot = 55;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 265, 50) {
			private final int slot = 56;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 283, 50) {
			private final int slot = 57;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 301, 50) {
			private final int slot = 58;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 319, 50) {
			private final int slot = 59;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 337, 50) {
			private final int slot = 60;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 355, 50) {
			private final int slot = 61;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 373, 50) {
			private final int slot = 62;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 391, 50) {
			private final int slot = 63;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 409, 50) {
			private final int slot = 64;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 265, 68) {
			private final int slot = 65;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 283, 68) {
			private final int slot = 66;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 301, 68) {
			private final int slot = 67;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 319, 68) {
			private final int slot = 68;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 337, 68) {
			private final int slot = 69;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 355, 68) {
			private final int slot = 70;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 373, 68) {
			private final int slot = 71;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 391, 68) {
			private final int slot = 72;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 409, 68) {
			private final int slot = 73;
			private int x = RouletteguiMenu.this.x;
			private int y = RouletteguiMenu.this.y;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 262 + 8 + sj * 18, 82 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 262 + 8 + si * 18, 82 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 74) {
				if (!this.moveItemStackTo(itemstack1, 74, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 74, false)) {
				if (index < 74 + 27) {
					if (!this.moveItemStackTo(itemstack1, 74 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 74, 74 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.setByPlayer(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.setByPlayer(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 11)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 11)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
