
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.testmod.client.model.Modelvasimutntntntntntnt;
import net.mcreator.testmod.client.model.Modelvasimutantttt;
import net.mcreator.testmod.client.model.Modelslots_chair_Converted;
import net.mcreator.testmod.client.model.ModelSkoda;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class VasiCraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvasimutntntntntntnt.LAYER_LOCATION, Modelvasimutntntntntntnt::createBodyLayer);
		event.registerLayerDefinition(Modelslots_chair_Converted.LAYER_LOCATION, Modelslots_chair_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelSkoda.LAYER_LOCATION, ModelSkoda::createBodyLayer);
		event.registerLayerDefinition(Modelvasimutantttt.LAYER_LOCATION, Modelvasimutantttt::createBodyLayer);
	}
}
