package net.mcreator.vasicraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vasicraft.world.inventory.AtmguiMenu;
import net.mcreator.vasicraft.procedures.ReturncrdtatmProcedure;
import net.mcreator.vasicraft.network.AtmguiButtonMessage;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AtmguiScreen extends AbstractContainerScreen<AtmguiMenu> {
	private final static HashMap<String, Object> guistate = AtmguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_transfer;

	public AtmguiScreen(AtmguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 136;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/atmgui.png");

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

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/wallet_slot.png"), this.leftPos + 133, this.topPos + 20, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font,

				ReturncrdtatmProcedure.execute(world, x, y, z), 53, 40, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.atmgui.label_vasi_atm"), 66, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_transfer = Button.builder(Component.translatable("gui.vasi_craft.atmgui.button_transfer"), e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new AtmguiButtonMessage(0, x, y, z));
				AtmguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 54, this.topPos + 18, 67, 20).build();
		guistate.put("button:button_transfer", button_transfer);
		this.addRenderableWidget(button_transfer);
	}
}
