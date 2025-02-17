package net.mcreator.vasicraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vasicraft.world.inventory.SkodainventoryMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SkodainventoryScreen extends AbstractContainerScreen<SkodainventoryMenu> {
	private final static HashMap<String, Object> guistate = SkodainventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkodainventoryScreen(SkodainventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/skodainventory.png");

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

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/skoda_gui2.png"), this.leftPos + 6, this.topPos + 3, 0, 0, 32, 64, 32, 64);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.skodainventory.label_health"), 3, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.skodainventory.label_fuel"), 3, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.skodainventory.label_skoahealth"), 38, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.skodainventory.label_skoda_fuel"), 28, 72, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
