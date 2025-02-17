// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelslots_chair_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "slots_chair_converted"), "main");
	private final ModelPart bone;

	public Modelslots_chair_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-15.0F, -1.0F, 1.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(56, 49)
						.addBox(-9.0F, -4.0F, 7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -6.0F, 0.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-16.0F, -19.0F, 14.0F, 16.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 34)
						.addBox(-16.0F, -19.0F, 14.0F, 16.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-2.0F, -13.0F, 2.0F, 2.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(-16.0F, -13.0F, 2.0F, 2.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 25)
						.addBox(-9.0F, -21.0F, 14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(56, 18).addBox(-12.0F, -5.0F, 0.0F, 12.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -20.0F, 14.0F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}