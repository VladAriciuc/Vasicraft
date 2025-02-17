package net.mcreator.vasicraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vasicraft.world.inventory.RouletteguiMenu;
import net.mcreator.vasicraft.network.RouletteguiButtonMessage;
import net.mcreator.vasicraft.VasiCraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RouletteguiScreen extends AbstractContainerScreen<RouletteguiMenu> {
	private final static HashMap<String, Object> guistate = RouletteguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_buton_spin2;

	public RouletteguiScreen(RouletteguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 440;
		this.imageHeight = 250;
	}

	private static final ResourceLocation texture = new ResourceLocation("vasi_craft:textures/screens/roulettegui.png");

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

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 102, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 66, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 13, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 13, this.topPos + 104, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 13, this.topPos + 140, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 13, this.topPos + 176, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 49, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 85, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 157, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 193, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 229, this.topPos + 175, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 229, this.topPos + 139, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 229, this.topPos + 103, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 229, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 174, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_rosu.png"), this.leftPos + 138, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 84, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 48, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 13, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 13, this.topPos + 86, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 13, this.topPos + 122, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 13, this.topPos + 158, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 67, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 103, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 139, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 175, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 229, this.topPos + 157, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 229, this.topPos + 121, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 229, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 229, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 192, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_negru.png"), this.leftPos + 156, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_verde_2.png"), this.leftPos + 121, this.topPos + 212, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/patrat_verde_2.png"), this.leftPos + 120, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/colt_rosu_stangasus.png"), this.leftPos + 13, this.topPos + 14, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/colt_negru_stanga_jos.png"), this.leftPos + 13, this.topPos + 196, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/colt_negru_dreapta_jos.png"), this.leftPos + 213, this.topPos + 196, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("vasi_craft:textures/screens/colt_rosu_dreapta_sus.png"), this.leftPos + 213, this.topPos + 14, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_1"), 107, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_2"), 144, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_empty"), 17, 18, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_4"), 232, 212, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_5"), 18, 107, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_6"), 234, 124, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_7"), 18, 179, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_8"), 234, 52, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_9"), 90, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_10"), 158, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_11"), 17, 213, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_12"), 231, 18, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_13"), 87, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_14"), 159, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_15"), 15, 52, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_16"), 231, 178, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_17"), 15, 125, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_18"), 231, 106, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_19"), 231, 70, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_20"), 16, 161, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_21"), 232, 142, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_22"), 15, 89, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_23"), 196, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_24"), 51, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_25"), 177, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_26"), 69, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_27"), 141, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_28"), 105, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_29"), 195, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_30"), 52, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_31"), 232, 88, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_32"), 16, 143, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_33"), 231, 160, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_34"), 16, 70, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_35"), 178, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_36"), 69, 17, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_0"), 126, 215, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.vasi_craft.roulettegui.label_00"), 123, 17, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_buton_spin2 = new ImageButton(this.leftPos + 66, this.topPos + 85, 128, 64, 0, 0, 64, new ResourceLocation("vasi_craft:textures/screens/atlas/imagebutton_buton_spin2.png"), 128, 128, e -> {
			if (true) {
				VasiCraftMod.PACKET_HANDLER.sendToServer(new RouletteguiButtonMessage(0, x, y, z));
				RouletteguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_buton_spin2", imagebutton_buton_spin2);
		this.addRenderableWidget(imagebutton_buton_spin2);
	}
}
