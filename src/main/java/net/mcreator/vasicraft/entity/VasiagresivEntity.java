
package net.mcreator.vasicraft.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowBoatGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.vasicraft.procedures.RandomagresivlootProcedure;
import net.mcreator.vasicraft.procedures.Damage_plooProcedure;
import net.mcreator.vasicraft.init.VasiCraftModItems;
import net.mcreator.vasicraft.init.VasiCraftModEntities;
import net.mcreator.vasicraft.init.VasiCraftModBlocks;

public class VasiagresivEntity extends PathfinderMob {
	public VasiagresivEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(VasiCraftModEntities.VASI_AGRESIV.get(), world);
	}

	public VasiagresivEntity(EntityType<VasiagresivEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 20;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(VasiCraftModItems.WOOD_SPADE.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, SoapblockentityEntity.class, (float) 30, 1.4, 1.2));
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, SoapentityEntity.class, (float) 6, 1.4, 1.2));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));
		this.goalSelector.addGoal(8, new RandomSwimmingGoal(this, 3, 40));
		this.goalSelector.addGoal(9, new FollowBoatGoal(this));
		this.goalSelector.addGoal(10, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(11, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(VasiCraftModBlocks.SOAP_BLOCK.get(), this, 1, (int) 3));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(VasiCraftModBlocks.SOAP.get(), this, 1, (int) 3));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
		this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Villager.class, true, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:mario_bulangiule"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_bai"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("vasi_craft:vasi_mort2"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		RandomagresivlootProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void baseTick() {
		super.baseTick();
		Damage_plooProcedure.execute(this);
	}

	public static void init() {
		SpawnPlacements.register(VasiCraftModEntities.VASI_AGRESIV.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
		DungeonHooks.addDungeonMob(VasiCraftModEntities.VASI_AGRESIV.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 8);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);
		return builder;
	}
}
