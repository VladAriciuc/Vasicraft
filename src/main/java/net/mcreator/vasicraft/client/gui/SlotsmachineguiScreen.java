package net.mcreator.vasicraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vasicraft.world.inventory.SlotsmachineguiMenu;
import net.mcreator.vasicraft.procedures.ReturnwinProcedure;
import net.mcreator.vasicraft.procedures.ReturncreditsguiProcedure;
import net.mcreator.vasicraft.procedures.ReturnbetguiProcedure;
import net.mcreator.vasicraft.network.SlotsmachineguiButtonMessage;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SlotsmachineguiScreen extends AbstractContainerScreen<SlotsmachineguiMenu> {
	private final static HashMap<String, Object> guistate = SlotsmachineguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_start;
	Button button_empty;
	ImageButton imagebutton_dowwnn;
	ImageButton imagebutton_upp;
	ImageButton imagebutton_black;
	ImageButton imagebutton_red;

	public SlotsmachineguiScreen(SlotsmachineguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 204;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/slotsmachinegui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/redoverlay.png"), this.leftPos + 56, this.topPos + 49, 0, 0, 90, 19, 90, 19);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/wallet_slot.png"), this.leftPos + 178, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_credits"), 144, 94, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturncreditsguiProcedure.execute(world, entity), 139, 104, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_bet"), 94, 94, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_win"), 11, 94, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnbetguiProcedure.execute(world, entity), 82, 104, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnwinProcedure.execute(world, entity), 5, 104, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_gamble"), 13, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_credits1"), 118, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.slotsmachinegui.label_transfer"), 113, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_start = Button.builder(Component.translatable("gui.vasi_craft.slotsmachinegui.button_start"), e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(0, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 155, this.topPos + 49, 37, 20).build();
		guistate.put("button:button_start", button_start);
		this.addRenderableWidget(button_start);
		button_empty = Button.builder(Component.translatable("gui.vasi_craft.slotsmachinegui.button_empty"), e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(1, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 161, this.topPos + 5, 13, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		imagebutton_dowwnn = new ImageButton(this.leftPos + 74, this.topPos + 92, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_dowwnn.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(2, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_dowwnn", imagebutton_dowwnn);
		this.addRenderableWidget(imagebutton_dowwnn);
		imagebutton_upp = new ImageButton(this.leftPos + 111, this.topPos + 90, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_upp.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(3, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_upp", imagebutton_upp);
		this.addRenderableWidget(imagebutton_upp);
		imagebutton_black = new ImageButton(this.leftPos + 29, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_black.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(4, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_black", imagebutton_black);
		this.addRenderableWidget(imagebutton_black);
		imagebutton_red = new ImageButton(this.leftPos + 11, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_red.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new SlotsmachineguiButtonMessage(5, x, y, z));
				SlotsmachineguiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_red", imagebutton_red);
		this.addRenderableWidget(imagebutton_red);
	}
}
