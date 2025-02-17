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

import net.mcreator.vasicraft.world.inventory.BlackjackguiMenu;
import net.mcreator.vasicraft.network.BlackjackguiButtonMessage;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BlackjackguiScreen extends AbstractContainerScreen<BlackjackguiMenu> {
	private final static HashMap<String, Object> guistate = BlackjackguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_hit;
	Button button_stop;
	ImageButton imagebutton_daun;
	ImageButton imagebutton_ap;

	public BlackjackguiScreen(BlackjackguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/blackjackgui.png");

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

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_care_ascunde2.png"), this.leftPos + 36, this.topPos + 62, 0, 0, 80, 20, 80, 20);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.blackjackgui.label_bet"), 126, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.blackjackgui.label_bet1"), 80, 96, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.blackjackgui.label_labelbet"), 71, 105, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_hit = Button.builder(Component.translatable("gui.vasi_craft.blackjackgui.button_hit"), e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new BlackjackguiButtonMessage(0, x, y, z));
				BlackjackguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 131, this.topPos + 96, 40, 20).build();
		guistate.put("button:button_hit", button_hit);
		this.addRenderableWidget(button_hit);
		button_stop = Button.builder(Component.translatable("gui.vasi_craft.blackjackgui.button_stop"), e -> {
		}).bounds(this.leftPos + 8, this.topPos + 96, 46, 20).build();
		guistate.put("button:button_stop", button_stop);
		this.addRenderableWidget(button_stop);
		imagebutton_daun = new ImageButton(this.leftPos + 143, this.topPos + 15, 8, 8, 0, 0, 8, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_daun.png"), 8, 16, e -> {
		});
		guistate.put("button:imagebutton_daun", imagebutton_daun);
		this.addRenderableWidget(imagebutton_daun);
		imagebutton_ap = new ImageButton(this.leftPos + 143, this.topPos + 6, 8, 8, 0, 0, 8, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_ap.png"), 8, 16, e -> {
		});
		guistate.put("button:imagebutton_ap", imagebutton_ap);
		this.addRenderableWidget(imagebutton_ap);
	}
}
