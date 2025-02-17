package net.mcreator.testmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import net.mcreator.vasicraft.client.model.Modelvasimutantttt;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvasimutantttt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("vasi_craft", "modelvasimutantttt"), "main");
	public final ModelPart manadreapta;
	public final ModelPart manastanga;
	public final ModelPart umardrept;
	public final ModelPart umarstang;
	public final ModelPart corp;
	public final ModelPart cap;
	public final ModelPart abdomen;
	public final ModelPart sacru;
	public final ModelPart piciordrept;
	public final ModelPart piciorstang;
	public final ModelPart papucstang;
	public final ModelPart papucdrept;

	public Modelvasimutantttt(ModelPart root) {
		this.manadreapta = root.getChild("manadreapta");
		this.manastanga = root.getChild("manastanga");
		this.umardrept = root.getChild("umardrept");
		this.umarstang = root.getChild("umarstang");
		this.corp = root.getChild("corp");
		this.cap = root.getChild("cap");
		this.abdomen = root.getChild("abdomen");
		this.sacru = root.getChild("sacru");
		this.piciordrept = root.getChild("piciordrept");
		this.piciorstang = root.getChild("piciorstang");
		this.papucstang = root.getChild("papucstang");
		this.papucdrept = root.getChild("papucdrept");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition manadreapta = partdefinition.addOrReplaceChild("manadreapta", CubeListBuilder.create(), PartPose.offset(-16.1994F, 10.0284F, -16.0F));
		PartDefinition manadreapta_r1 = manadreapta.addOrReplaceChild("manadreapta_r1", CubeListBuilder.create().texOffs(14, 95).addBox(-1.0F, -27.0F, -13.0F, 14.0F, 27.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8006F, 13.9716F, 6.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition manastanga = partdefinition.addOrReplaceChild("manastanga", CubeListBuilder.create(), PartPose.offset(16.7108F, 9.9836F, -16.9534F));
		PartDefinition manastanga_r1 = manastanga.addOrReplaceChild("manastanga_r1", CubeListBuilder.create().texOffs(88, 81).addBox(-7.0F, -13.5F, -7.0F, 14.0F, 27.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition umardrept = partdefinition.addOrReplaceChild("umardrept", CubeListBuilder.create(), PartPose.offset(-19.1034F, -15.3509F, -13.6126F));
		PartDefinition umardrept_r1 = umardrept.addOrReplaceChild("umardrept_r1", CubeListBuilder.create().texOffs(114, 43).addBox(-5.0F, -14.0F, -12.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8966F, 6.6791F, 5.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition umarstang = partdefinition.addOrReplaceChild("umarstang", CubeListBuilder.create(), PartPose.offset(19.4032F, -15.7466F, -13.0F));
		PartDefinition umarstang_r1 = umarstang.addOrReplaceChild("umarstang_r1", CubeListBuilder.create().texOffs(73, 53).addBox(-1.0F, -14.0F, -12.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.035F, 7.7233F, 5.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition corp = partdefinition.addOrReplaceChild("corp", CubeListBuilder.create(), PartPose.offset(-0.0656F, -17.731F, 5.5614F));
		PartDefinition corp_r1 = corp.addOrReplaceChild("corp_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -32.0F, -39.0F, 30.0F, 27.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 8.6628F, 30.2895F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cap = partdefinition.addOrReplaceChild("cap", CubeListBuilder.create(), PartPose.offset(0.5F, -27.5F, -14.5F));
		PartDefinition cap_r1 = cap.addOrReplaceChild("cap_r1", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, -7.0F, -10.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 3.5F, 6.5F, 0.0F, 0.0F, 0.0F));
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create(), PartPose.offset(-6.0F, 4.0F, -6.0F));
		PartDefinition abdomen_r1 = abdomen.addOrReplaceChild("abdomen_r1", CubeListBuilder.create().texOffs(99, 0).addBox(-1.0F, -15.0F, -1.0F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 12.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition sacru = partdefinition.addOrReplaceChild("sacru", CubeListBuilder.create(), PartPose.offset(-5.0F, 11.0F, -13.0F));
		PartDefinition sacru_r1 = sacru.addOrReplaceChild("sacru_r1", CubeListBuilder.create().texOffs(29, 57).addBox(-1.0F, -9.0F, -1.0F, 29.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 18.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition piciordrept = partdefinition.addOrReplaceChild("piciordrept", CubeListBuilder.create(), PartPose.offset(-12.5F, 12.5514F, 11.0348F));
		PartDefinition piciordrept_r1 = piciordrept.addOrReplaceChild("piciordrept_r1", CubeListBuilder.create().texOffs(45, 95).addBox(-1.0F, -10.0F, -1.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.4486F, -3.0348F, -0.2182F, 0.0F, 0.0F));
		PartDefinition piciorstang = partdefinition.addOrReplaceChild("piciorstang", CubeListBuilder.create(), PartPose.offset(13.5F, 12.5514F, 11.0348F));
		PartDefinition piciorstang_r1 = piciorstang.addOrReplaceChild("piciorstang_r1", CubeListBuilder.create().texOffs(3, 73).addBox(-1.0F, -10.0F, -1.0F, 3.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 4.4486F, -3.0348F, -0.2182F, 0.0F, 0.0F));
		PartDefinition papucstang = partdefinition.addOrReplaceChild("papucstang", CubeListBuilder.create(), PartPose.offset(14.0F, 19.7571F, 12.7704F));
		PartDefinition papucstang_r1 = papucstang.addOrReplaceChild("papucstang_r1", CubeListBuilder.create().texOffs(6, 14).addBox(-4.0F, -10.0F, -1.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.2429F, 1.2296F, 0.6109F, 0.0F, 0.0F));
		PartDefinition papucdrept = partdefinition.addOrReplaceChild("papucdrept", CubeListBuilder.create(), PartPose.offset(-13.0F, 19.7571F, 12.7704F));
		PartDefinition papucdrept_r1 = papucdrept.addOrReplaceChild("papucdrept_r1", CubeListBuilder.create().texOffs(6, 57).addBox(-4.0F, -10.0F, -1.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 5.2429F, 1.2296F, 0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		manadreapta.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manastanga.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		umardrept.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		umarstang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corp.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cap.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		abdomen.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sacru.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piciordrept.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piciorstang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		papucstang.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		papucdrept.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
