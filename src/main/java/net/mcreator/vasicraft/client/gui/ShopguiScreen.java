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

import net.mcreator.vasicraft.world.inventory.ShopguiMenu;
import net.mcreator.vasicraft.procedures.ReturnpricelabelProcedure;
import net.mcreator.vasicraft.network.ShopguiButtonMessage;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShopguiScreen extends AbstractContainerScreen<ShopguiMenu> {
	private final static HashMap<String, Object> guistate = ShopguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_buy;
	ImageButton imagebutton_invisible2;
	ImageButton imagebutton_invisible21;
	ImageButton imagebutton_invisible23;
	ImageButton imagebutton_invisible24;
	ImageButton imagebutton_invisible25;
	ImageButton imagebutton_invisible26;
	ImageButton imagebutton_invisible27;
	ImageButton imagebutton_invisible28;
	ImageButton imagebutton_invisible29;
	ImageButton imagebutton_invisible210;
	ImageButton imagebutton_invisible211;
	ImageButton imagebutton_invisible212;
	ImageButton imagebutton_invisible213;
	ImageButton imagebutton_invisible214;
	ImageButton imagebutton_invisible215;
	ImageButton imagebutton_invisible216;
	ImageButton imagebutton_invisible217;
	ImageButton imagebutton_invisible218;
	ImageButton imagebutton_invisible219;
	ImageButton imagebutton_invisible220;
	ImageButton imagebutton_invisible221;
	ImageButton imagebutton_invisible222;
	ImageButton imagebutton_invisible223;
	ImageButton imagebutton_invisible22;

	public ShopguiScreen(ShopguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/shopgui.png");

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

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/wallet_slot.png"), this.leftPos + 153, this.topPos + 7, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.shopgui.label_vasi_shop"), 68, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.shopgui.label_price"), 127, 57, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnpricelabelProcedure.execute(world, x, y, z), 125, 65, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_buy = Button.builder(Component.translatable("gui.vasi_craft.shopgui.button_buy"), e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(0, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 75, 40, 20).build();
		guistate.put("button:button_buy", button_buy);
		this.addRenderableWidget(button_buy);
		imagebutton_invisible2 = new ImageButton(this.leftPos + 7, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible2.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(1, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible2", imagebutton_invisible2);
		this.addRenderableWidget(imagebutton_invisible2);
		imagebutton_invisible21 = new ImageButton(this.leftPos + 7, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible21.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(2, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible21", imagebutton_invisible21);
		this.addRenderableWidget(imagebutton_invisible21);
		imagebutton_invisible23 = new ImageButton(this.leftPos + 7, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible23.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(3, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible23", imagebutton_invisible23);
		this.addRenderableWidget(imagebutton_invisible23);
		imagebutton_invisible24 = new ImageButton(this.leftPos + 25, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible24.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(4, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible24", imagebutton_invisible24);
		this.addRenderableWidget(imagebutton_invisible24);
		imagebutton_invisible25 = new ImageButton(this.leftPos + 25, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible25.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(5, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible25", imagebutton_invisible25);
		this.addRenderableWidget(imagebutton_invisible25);
		imagebutton_invisible26 = new ImageButton(this.leftPos + 25, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible26.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(6, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible26", imagebutton_invisible26);
		this.addRenderableWidget(imagebutton_invisible26);
		imagebutton_invisible27 = new ImageButton(this.leftPos + 25, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible27.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(7, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible27", imagebutton_invisible27);
		this.addRenderableWidget(imagebutton_invisible27);
		imagebutton_invisible28 = new ImageButton(this.leftPos + 43, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible28.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(8, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible28", imagebutton_invisible28);
		this.addRenderableWidget(imagebutton_invisible28);
		imagebutton_invisible29 = new ImageButton(this.leftPos + 43, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible29.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(9, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible29", imagebutton_invisible29);
		this.addRenderableWidget(imagebutton_invisible29);
		imagebutton_invisible210 = new ImageButton(this.leftPos + 43, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible210.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(10, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible210", imagebutton_invisible210);
		this.addRenderableWidget(imagebutton_invisible210);
		imagebutton_invisible211 = new ImageButton(this.leftPos + 43, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible211.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(11, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible211", imagebutton_invisible211);
		this.addRenderableWidget(imagebutton_invisible211);
		imagebutton_invisible212 = new ImageButton(this.leftPos + 61, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible212.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(12, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible212", imagebutton_invisible212);
		this.addRenderableWidget(imagebutton_invisible212);
		imagebutton_invisible213 = new ImageButton(this.leftPos + 61, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible213.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(13, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible213", imagebutton_invisible213);
		this.addRenderableWidget(imagebutton_invisible213);
		imagebutton_invisible214 = new ImageButton(this.leftPos + 61, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible214.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(14, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible214", imagebutton_invisible214);
		this.addRenderableWidget(imagebutton_invisible214);
		imagebutton_invisible215 = new ImageButton(this.leftPos + 61, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible215.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(15, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible215", imagebutton_invisible215);
		this.addRenderableWidget(imagebutton_invisible215);
		imagebutton_invisible216 = new ImageButton(this.leftPos + 79, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible216.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(16, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible216", imagebutton_invisible216);
		this.addRenderableWidget(imagebutton_invisible216);
		imagebutton_invisible217 = new ImageButton(this.leftPos + 79, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible217.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(17, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible217", imagebutton_invisible217);
		this.addRenderableWidget(imagebutton_invisible217);
		imagebutton_invisible218 = new ImageButton(this.leftPos + 79, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible218.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(18, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible218", imagebutton_invisible218);
		this.addRenderableWidget(imagebutton_invisible218);
		imagebutton_invisible219 = new ImageButton(this.leftPos + 79, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible219.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(19, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible219", imagebutton_invisible219);
		this.addRenderableWidget(imagebutton_invisible219);
		imagebutton_invisible220 = new ImageButton(this.leftPos + 97, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible220.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(20, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible220", imagebutton_invisible220);
		this.addRenderableWidget(imagebutton_invisible220);
		imagebutton_invisible221 = new ImageButton(this.leftPos + 97, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible221.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(21, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible221", imagebutton_invisible221);
		this.addRenderableWidget(imagebutton_invisible221);
		imagebutton_invisible222 = new ImageButton(this.leftPos + 97, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible222.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(22, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible222", imagebutton_invisible222);
		this.addRenderableWidget(imagebutton_invisible222);
		imagebutton_invisible223 = new ImageButton(this.leftPos + 97, this.topPos + 76, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible223.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(23, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible223", imagebutton_invisible223);
		this.addRenderableWidget(imagebutton_invisible223);
		imagebutton_invisible22 = new ImageButton(this.leftPos + 7, this.topPos + 58, 16, 16, 0, 0, 16, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_invisible22.png"), 16, 32, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new ShopguiButtonMessage(24, x, y, z));
				ShopguiButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invisible22", imagebutton_invisible22);
		this.addRenderableWidget(imagebutton_invisible22);
	}
}
