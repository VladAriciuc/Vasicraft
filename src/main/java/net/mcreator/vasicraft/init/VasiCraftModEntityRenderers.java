
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.vasicraft.client.renderer.VasibomberRenderer;
import net.mcreator.vasicraft.client.renderer.VasiagresivRenderer;
import net.mcreator.vasicraft.client.renderer.VasiRenderer;
import net.mcreator.vasicraft.client.renderer.VasiMutantRenderer;
import net.mcreator.vasicraft.client.renderer.SuitVasiRenderer;
import net.mcreator.vasicraft.client.renderer.SoapentityRenderer;
import net.mcreator.vasicraft.client.renderer.SoapblockentityRenderer;
import net.mcreator.vasicraft.client.renderer.SkodaRenderer;
import net.mcreator.vasicraft.client.renderer.ShirtVasiRenderer;
import net.mcreator.vasicraft.client.renderer.NasucEntityRenderer;
import net.mcreator.vasicraft.client.renderer.FriendlyvasiRenderer;
import net.mcreator.vasicraft.client.renderer.ChairRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VasiCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(VasiCraftModEntities.VASI.get(), VasiRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.VASI_AGRESIV.get(), VasiagresivRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.VASI_BOMBER.get(), VasibomberRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SOAP_ENTITY.get(), SoapentityRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SOAP_BLOCK_ENTITY.get(), SoapblockentityRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.VASI_FRIENDLY.get(), FriendlyvasiRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.EXPLOSIVE_METAXA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.EXPLOSIVE_GRENADE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.VASI_MUTANT.get(), VasiMutantRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.CHAIR.get(), ChairRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.NASUC_ENTITY.get(), NasucEntityRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SKODA.get(), SkodaRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SUITVASIMETAXA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SHIRT_VASI.get(), ShirtVasiRenderer::new);
		event.registerEntityRenderer(VasiCraftModEntities.SUIT_VASI.get(), SuitVasiRenderer::new);
	}
}
