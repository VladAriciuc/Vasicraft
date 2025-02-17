
package net.mcreator.vasicraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.vasicraft.procedures.RosuProcedure;
import net.mcreator.vasicraft.procedures.C5Procedure;
import net.mcreator.vasicraft.procedures.C4Procedure;
import net.mcreator.vasicraft.procedures.C3Procedure;
import net.mcreator.vasicraft.procedures.C2Procedure;
import net.mcreator.vasicraft.procedures.C1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CrystalpowerbarOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (C2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/celula2.png"), w / 2 + -5, h - 44, 0, 0, 6, 6, 6, 6);
			}
			if (C3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/celula2.png"), w / 2 + -3, h - 46, 0, 0, 6, 6, 6, 6);
			}
			if (C4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/celula2.png"), w / 2 + -1, h - 48, 0, 0, 6, 6, 6, 6);
			}
			if (C5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/celulaf2.png"), w / 2 + 1, h - 50, 0, 0, 6, 6, 6, 6);
			}
			if (C1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/celula.png"), w / 2 + -6, h - 42, 0, 0, 4, 5, 4, 5);
			}
			event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/cristi.png"), w / 2 + -8, h - 52, 0, 0, 16, 16, 16, 16);

			if (RosuProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("vasi_craft:textures/screens/cristir.png"), w / 2 + -8, h - 52, 0, 0, 16, 16, 16, 16);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
