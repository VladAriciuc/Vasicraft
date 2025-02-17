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

import net.mcreator.testmod.client.model.ModelSkoda;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSkoda<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("vasi_craft", "model_skoda"), "main");
	public final ModelPart r1;
	public final ModelPart r2;
	public final ModelPart r3;
	public final ModelPart r4;
	public final ModelPart bb_main;

	public ModelSkoda(ModelPart root) {
		this.r1 = root.getChild("r1");
		this.r2 = root.getChild("r2");
		this.r3 = root.getChild("r3");
		this.r4 = root.getChild("r4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition r1 = partdefinition.addOrReplaceChild("r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 20.5F, -11.75F));
		PartDefinition r2 = partdefinition.addOrReplaceChild("r2", CubeListBuilder.create(), PartPose.offset(12.0F, 20.5F, -11.75F));
		PartDefinition cube_r1 = r2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.5F, 2.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition r3 = partdefinition.addOrReplaceChild("r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 20.5F, 31.25F));
		PartDefinition r4 = partdefinition.addOrReplaceChild("r4", CubeListBuilder.create(), PartPose.offset(12.0F, 20.5F, 31.0F));
		PartDefinition cube_r2 = r4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.5F, 2.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -4.0F, -19.0F, 26.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-13.0F, -15.0F, -19.0F, 1.0F, 11.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(110, 55)
						.addBox(12.0F, -15.0F, -19.0F, 1.0F, 11.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(160, 33).addBox(-12.0F, -14.0F, -20.0F, 24.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(110, 120)
						.addBox(-13.0F, -24.0F, -10.0F, 1.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(20, 189).addBox(-13.0F, -23.0F, -8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(184, 181)
						.addBox(-13.0F, -23.0F, 7.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 152).addBox(12.0F, -24.0F, -10.0F, 1.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(24, 189)
						.addBox(12.0F, -23.0F, -8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(188, 163).addBox(12.0F, -23.0F, 7.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 120)
						.addBox(-12.0F, -24.0F, -10.0F, 24.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(64, 152).addBox(-12.0F, -14.0F, 28.0F, 24.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(160, 24)
						.addBox(-12.0F, -16.0F, 28.0F, 24.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(160, 0).addBox(-13.0F, -17.0F, -18.0F, 26.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(174, 137)
						.addBox(-12.0F, -15.0F, -19.0F, 24.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 46).addBox(-12.0F, -12.0F, 38.0F, 24.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 179)
						.addBox(-11.0F, -8.0F, 10.0F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(102, 181).addBox(2.0F, -8.0F, 10.0F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(160, 10)
						.addBox(-11.0F, -8.0F, -8.0F, 22.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(174, 139).addBox(-12.0F, -15.0F, 35.0F, 24.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 152)
						.addBox(-1.0F, -7.0F, 2.0F, 2.0F, 3.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(64, 172).addBox(-12.0F, -15.0F, 26.0F, 24.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 184)
						.addBox(-9.0F, -20.0F, 8.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 184).addBox(4.0F, -20.0F, 8.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 184)
						.addBox(4.0F, -20.0F, -10.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 184).addBox(-9.0F, -20.0F, -10.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(188, 173)
						.addBox(-2.0F, -20.0F, -10.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 189).addBox(-0.5F, -11.0F, 24.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(174, 133)
						.addBox(-12.0F, -4.0F, 35.0F, 24.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 189).addBox(-14.0F, -16.0F, 28.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 189)
						.addBox(-16.0F, -17.0F, 28.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 189).addBox(14.0F, -17.0F, 28.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 189)
						.addBox(13.0F, -16.0F, 28.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(174, 141).addBox(2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -8.0F, 11.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(174, 120).addBox(-21.0F, -12.0F, -1.0F, 22.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -5.0F, -7.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(160, 181).addBox(-8.0F, -12.0F, -1.0F, 9.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 181).addBox(-21.0F, -12.0F, -1.0F, 9.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -5.0F, 11.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 189).addBox(1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -6.0F, 27.5F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(34, 189).addBox(1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 189).addBox(4.0F, -2.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -6.0F, 27.5F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(116, 172).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -13.0F, 24.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(4, 184).addBox(2.0F, 1.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -15.0F, 25.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 184).addBox(0.0F, -14.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(180, 181).addBox(-25.0F, -14.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -15.0F, 31.0F, 0.8552F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(16, 189).addBox(0.0F, -11.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(188, 151).addBox(25.0F, -11.0F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -13.75F, -15.0F, -0.5672F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		r1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
