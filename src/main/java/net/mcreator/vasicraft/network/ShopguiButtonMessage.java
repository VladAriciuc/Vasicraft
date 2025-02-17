
package net.mcreator.vasicraft.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.world.inventory.ShopguiMenu;
import net.mcreator.vasicraft.procedures.ShopbuyProcedure;
import net.mcreator.vasicraft.procedures.B9Procedure;
import net.mcreator.vasicraft.procedures.B8Procedure;
import net.mcreator.vasicraft.procedures.B7Procedure;
import net.mcreator.vasicraft.procedures.B6Procedure;
import net.mcreator.vasicraft.procedures.B5Procedure;
import net.mcreator.vasicraft.procedures.B4Procedure;
import net.mcreator.vasicraft.procedures.B3Procedure;
import net.mcreator.vasicraft.procedures.B2Procedure;
import net.mcreator.vasicraft.procedures.B23Procedure;
import net.mcreator.vasicraft.procedures.B22Procedure;
import net.mcreator.vasicraft.procedures.B21Procedure;
import net.mcreator.vasicraft.procedures.B20Procedure;
import net.mcreator.vasicraft.procedures.B1Procedure;
import net.mcreator.vasicraft.procedures.B19Procedure;
import net.mcreator.vasicraft.procedures.B18Procedure;
import net.mcreator.vasicraft.procedures.B17Procedure;
import net.mcreator.vasicraft.procedures.B16Procedure;
import net.mcreator.vasicraft.procedures.B15Procedure;
import net.mcreator.vasicraft.procedures.B14Procedure;
import net.mcreator.vasicraft.procedures.B13Procedure;
import net.mcreator.vasicraft.procedures.B12Procedure;
import net.mcreator.vasicraft.procedures.B11Procedure;
import net.mcreator.vasicraft.procedures.B10Procedure;
import net.mcreator.vasicraft.procedures.B0Procedure;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShopguiButtonMessage {
	private final int buttonID, x, y, z;

	public ShopguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ShopguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ShopguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ShopguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = ShopguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ShopbuyProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			B0Procedure.execute(world, entity);
		}
		if (buttonID == 2) {

			B1Procedure.execute(world, entity);
		}
		if (buttonID == 3) {

			B3Procedure.execute(world, entity);
		}
		if (buttonID == 4) {

			B4Procedure.execute(world, entity);
		}
		if (buttonID == 5) {

			B5Procedure.execute(world, entity);
		}
		if (buttonID == 6) {

			B6Procedure.execute(world, entity);
		}
		if (buttonID == 7) {

			B7Procedure.execute(world, entity);
		}
		if (buttonID == 8) {

			B8Procedure.execute(world, entity);
		}
		if (buttonID == 9) {

			B9Procedure.execute(world, entity);
		}
		if (buttonID == 10) {

			B10Procedure.execute(world, entity);
		}
		if (buttonID == 11) {

			B11Procedure.execute(world, entity);
		}
		if (buttonID == 12) {

			B12Procedure.execute(world, entity);
		}
		if (buttonID == 13) {

			B13Procedure.execute(world, entity);
		}
		if (buttonID == 14) {

			B14Procedure.execute(world, entity);
		}
		if (buttonID == 15) {

			B15Procedure.execute(world, entity);
		}
		if (buttonID == 16) {

			B16Procedure.execute(world, entity);
		}
		if (buttonID == 17) {

			B17Procedure.execute(world, entity);
		}
		if (buttonID == 18) {

			B18Procedure.execute(world, entity);
		}
		if (buttonID == 19) {

			B19Procedure.execute(world, entity);
		}
		if (buttonID == 20) {

			B20Procedure.execute(world, entity);
		}
		if (buttonID == 21) {

			B21Procedure.execute(world, entity);
		}
		if (buttonID == 22) {

			B22Procedure.execute(world, entity);
		}
		if (buttonID == 23) {

			B23Procedure.execute(world, entity);
		}
		if (buttonID == 24) {

			B2Procedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		VasiCraftMod.addNetworkMessage(ShopguiButtonMessage.class, ShopguiButtonMessage::buffer, ShopguiButtonMessage::new, ShopguiButtonMessage::handler);
	}
}
