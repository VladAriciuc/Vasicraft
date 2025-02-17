package net.mcreator.vasicraft.client.model;

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

import net.mcreator.testmod.client.model.Modelvasimutntntntntntnt;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvasimutntntntntntnt<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("vasi_craft", "modelvasimutntntntntntnt"), "main");
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

	public Modelvasimutntntntntntnt(ModelPart root) {
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
		PartDefinition manadreapta = partdefinition.addOrReplaceChild("manadreapta", CubeListBuilder.create(), PartPose.offset(19.0F, 5.0F, -4.0F));
		PartDefinition manadreapta_r1 = manadreapta.addOrReplaceChild("manadreapta_r1", CubeListBuilder.create().texOffs(0, 95).addBox(-1.0F, -27.0F, -1.0F, 14.0F, 27.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 19.0F, -17.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition manastanga = partdefinition.addOrReplaceChild("manastanga", CubeListBuilder.create(), PartPose.offset(10.0F, 24.0F, 9.0F));
		PartDefinition manastanga_r1 = manastanga.addOrReplaceChild("manastanga_r1", CubeListBuilder.create().texOffs(74, 81).addBox(-7.0F, -13.5F, -7.0F, 14.0F, 27.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9534F, -14.0164F, 7.7108F, -0.1309F, 0.0F, 0.0F));
		PartDefinition umardrept = partdefinition.addOrReplaceChild("umardrept", CubeListBuilder.create(), PartPose.offset(8.0F, -8.0F, -21.0F));
		PartDefinition umardrept_r1 = umardrept.addOrReplaceChild("umardrept_r1", CubeListBuilder.create().texOffs(100, 43).addBox(-2.0F, -14.0F, -5.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition umarstang = partdefinition.addOrReplaceChild("umarstang", CubeListBuilder.create(), PartPose.offset(8.0F, -8.0F, 15.0F));
		PartDefinition umarstang_r1 = umarstang.addOrReplaceChild("umarstang_r1", CubeListBuilder.create().texOffs(59, 53).addBox(-2.0F, -14.0F, -1.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition corp = partdefinition.addOrReplaceChild("corp", CubeListBuilder.create(), PartPose.offset(-5.5614F, -17.731F, -0.0656F));
		PartDefinition corp_r1 = corp.addOrReplaceChild("corp_r1", CubeListBuilder.create().texOffs(0, 0).addBox(12.0F, -32.0F, -1.0F, 27.0F, 27.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.2895F, 8.6628F, -14.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cap = partdefinition.addOrReplaceChild("cap", CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -7.0F, -1.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -24.0F, -2.0F));
		PartDefinition abdomen = partdefinition.addOrReplaceChild("abdomen", CubeListBuilder.create(), PartPose.offset(-6.0F, 4.0F, -6.0F));
		PartDefinition abdomen_r1 = abdomen.addOrReplaceChild("abdomen_r1", CubeListBuilder.create().texOffs(84, 0).addBox(-14.0F, -15.0F, -1.0F, 15.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition sacru = partdefinition.addOrReplaceChild("sacru", CubeListBuilder.create().texOffs(0, 57).addBox(-14.0F, -9.0F, -1.0F, 15.0F, 9.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 11.0F, -13.0F));
		PartDefinition piciordrept = partdefinition.addOrReplaceChild("piciordrept", CubeListBuilder.create(), PartPose.offset(-8.0F, 17.0F, -13.0F));
		PartDefinition piciordrept_r1 = piciordrept.addOrReplaceChild("piciordrept_r1", CubeListBuilder.create().texOffs(42, 95).addBox(-5.0F, -10.0F, -1.0F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition piciorstang = partdefinition.addOrReplaceChild("piciorstang", CubeListBuilder.create(), PartPose.offset(-8.0F, 17.0F, 13.0F));
		PartDefinition piciorstang_r1 = piciorstang.addOrReplaceChild("piciorstang_r1", CubeListBuilder.create().texOffs(0, 73).addBox(-5.0F, -10.0F, -1.0F, 6.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition papucstang = partdefinition.addOrReplaceChild("papucstang", CubeListBuilder.create(), PartPose.offset(-14.0F, 25.0F, 15.0F));
		PartDefinition papucstang_r1 = papucstang.addOrReplaceChild("papucstang_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-5.0F, -10.0F, -4.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition papucdrept = partdefinition.addOrReplaceChild("papucdrept", CubeListBuilder.create(), PartPose.offset(-14.0F, 25.0F, -12.0F));
		PartDefinition papucdrept_r1 = papucdrept.addOrReplaceChild("papucdrept_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-5.0F, -10.0F, -4.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
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
