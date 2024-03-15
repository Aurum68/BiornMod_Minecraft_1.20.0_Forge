package net.biorn.biornmod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.biorn.biornmod.BiornMod;
import net.biorn.biornmod.entity.FirstEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class FirstEntityModel<T extends FirstEntity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(BiornMod.MOD_ID, "first_entity"), "main");
	private final ModelPart body;

	public FirstEntityModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontRight = legs.addOrReplaceChild("frontRight", CubeListBuilder.create().texOffs(32, 0).addBox(-6.0F, -3.3F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(7, 7).addBox(-9.1F, -2.0F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = frontRight.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 25).addBox(-0.9F, -0.4F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -2.0F, -6.0F, 0.0F, -0.3491F, -0.5236F));

		PartDefinition frontLeft = legs.addOrReplaceChild("frontLeft", CubeListBuilder.create().texOffs(7, 2).addBox(7.1F, -2.0F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(31, 25).addBox(4.0F, -3.3F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = frontLeft.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 25).addBox(-2.1F, -0.4F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -2.0F, -6.0F, 0.0F, 0.3491F, 0.5236F));

		PartDefinition backRight = legs.addOrReplaceChild("backRight", CubeListBuilder.create().texOffs(0, 29).addBox(-6.0F, -3.3F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.1F, -2.0F, 6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = backRight.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-0.9F, -0.4F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -2.0F, 6.0F, 0.0F, 0.3491F, -0.5236F));

		PartDefinition backLeft = legs.addOrReplaceChild("backLeft", CubeListBuilder.create().texOffs(0, 5).addBox(6.1F, -2.0F, 6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 29).addBox(3.0F, -3.3F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = backLeft.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 14).addBox(-2.1F, -0.4F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -2.0F, 6.0F, 0.0F, -0.3491F, 0.5236F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 25).addBox(-3.0F, -6.0F, -16.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-3.0F, -3.0F, -22.0F, 5.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition full_body = body.addOrReplaceChild("full_body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -11.0F, 7.0F, 7.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(22, 29).addBox(-3.0F, -5.0F, 3.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-2.0F, -3.0F, 7.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-1.0F, -1.0F, 9.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-1.0F, -8.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 14).addBox(-1.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 33).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 5).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 13).addBox(-1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-1.0F, -6.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 7).addBox(-1.0F, -6.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 4).addBox(-1.0F, -4.0F, 14.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}