
package net.mcreator.vasicraft.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.world.inventory.SlotsmachineguiMenu;
import net.mcreator.vasicraft.procedures.TransfercreditsProcedure;
import net.mcreator.vasicraft.procedures.SlotsstartbuttonProcedure;
import net.mcreator.vasicraft.procedures.GambleredProcedure;
import net.mcreator.vasicraft.procedures.GambleblackProcedure;
import net.mcreator.vasicraft.procedures.BetupProcedure;
import net.mcreator.vasicraft.procedures.BetdownProcedure;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlotsmachineguiButtonMessage {
	private final int buttonID, x, y, z;

	public SlotsmachineguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SlotsmachineguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SlotsmachineguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SlotsmachineguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SlotsmachineguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SlotsstartbuttonProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			TransfercreditsProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			BetdownProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			BetupProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			GambleblackProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			GambleredProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		VasiCraftMod.addNetworkMessage(SlotsmachineguiButtonMessage.class, SlotsmachineguiButtonMessage::buffer, SlotsmachineguiButtonMessage::new, SlotsmachineguiButtonMessage::handler);
	}
}
