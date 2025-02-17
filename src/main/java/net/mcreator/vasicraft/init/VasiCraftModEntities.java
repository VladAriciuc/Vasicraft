
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vasicraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.vasicraft.entity.VasibomberEntity;
import net.mcreator.vasicraft.entity.VasiagresivEntity;
import net.mcreator.vasicraft.entity.VasiMutantEntity;
import net.mcreator.vasicraft.entity.VasiEntity;
import net.mcreator.vasicraft.entity.SuitvasimetaxaEntity;
import net.mcreator.vasicraft.entity.SuitVasiEntity;
import net.mcreator.vasicraft.entity.SoapentityEntity;
import net.mcreator.vasicraft.entity.SoapblockentityEntity;
import net.mcreator.vasicraft.entity.SkodaEntity;
import net.mcreator.vasicraft.entity.ShirtVasiEntity;
import net.mcreator.vasicraft.entity.NasucEntityEntity;
import net.mcreator.vasicraft.entity.FriendlyvasiEntity;
import net.mcreator.vasicraft.entity.ExplosivemetaxaEntity;
import net.mcreator.vasicraft.entity.ExplosivegrenadeprojectileEntity;
import net.mcreator.vasicraft.entity.ChairEntity;
import net.mcreator.vasicraft.VasiCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VasiCraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VasiCraftMod.MODID);
	public static final RegistryObject<EntityType<VasiEntity>> VASI = register("vasi",
			EntityType.Builder.<VasiEntity>of(VasiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(VasiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VasiagresivEntity>> VASI_AGRESIV = register("vasi_agresiv",
			EntityType.Builder.<VasiagresivEntity>of(VasiagresivEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VasiagresivEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VasibomberEntity>> VASI_BOMBER = register("vasi_bomber",
			EntityType.Builder.<VasibomberEntity>of(VasibomberEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(VasibomberEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoapentityEntity>> SOAP_ENTITY = register("soap_entity", EntityType.Builder.<SoapentityEntity>of(SoapentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0)
			.setUpdateInterval(3).setCustomClientFactory(SoapentityEntity::new).fireImmune().sized(0.5f, 0.3f));
	public static final RegistryObject<EntityType<SoapblockentityEntity>> SOAP_BLOCK_ENTITY = register("soap_block_entity", EntityType.Builder.<SoapblockentityEntity>of(SoapblockentityEntity::new, MobCategory.AMBIENT)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(SoapblockentityEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FriendlyvasiEntity>> VASI_FRIENDLY = register("vasi_friendly",
			EntityType.Builder.<FriendlyvasiEntity>of(FriendlyvasiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(FriendlyvasiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplosivemetaxaEntity>> EXPLOSIVE_METAXA_PROJECTILE = register("explosive_metaxa_projectile", EntityType.Builder.<ExplosivemetaxaEntity>of(ExplosivemetaxaEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ExplosivemetaxaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosivegrenadeprojectileEntity>> EXPLOSIVE_GRENADE_PROJECTILE = register("explosive_grenade_projectile",
			EntityType.Builder.<ExplosivegrenadeprojectileEntity>of(ExplosivegrenadeprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosivegrenadeprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VasiMutantEntity>> VASI_MUTANT = register("vasi_mutant",
			EntityType.Builder.<VasiMutantEntity>of(VasiMutantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VasiMutantEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<ChairEntity>> CHAIR = register("chair",
			EntityType.Builder.<ChairEntity>of(ChairEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(ChairEntity::new).fireImmune().sized(0.6f, 0.2f));
	public static final RegistryObject<EntityType<NasucEntityEntity>> NASUC_ENTITY = register("nasuc_entity",
			EntityType.Builder.<NasucEntityEntity>of(NasucEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NasucEntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SkodaEntity>> SKODA = register("skoda",
			EntityType.Builder.<SkodaEntity>of(SkodaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(20).setUpdateInterval(3).setCustomClientFactory(SkodaEntity::new)

					.sized(0.6f, 0.12f));
	public static final RegistryObject<EntityType<SuitvasimetaxaEntity>> SUITVASIMETAXA = register("suitvasimetaxa",
			EntityType.Builder.<SuitvasimetaxaEntity>of(SuitvasimetaxaEntity::new, MobCategory.MISC).setCustomClientFactory(SuitvasimetaxaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShirtVasiEntity>> SHIRT_VASI = register("shirt_vasi", EntityType.Builder.<ShirtVasiEntity>of(ShirtVasiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ShirtVasiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuitVasiEntity>> SUIT_VASI = register("suit_vasi",
			EntityType.Builder.<SuitVasiEntity>of(SuitVasiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuitVasiEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VasiEntity.init();
			VasiagresivEntity.init();
			VasibomberEntity.init();
			SoapentityEntity.init();
			SoapblockentityEntity.init();
			FriendlyvasiEntity.init();
			VasiMutantEntity.init();
			ChairEntity.init();
			NasucEntityEntity.init();
			SkodaEntity.init();
			ShirtVasiEntity.init();
			SuitVasiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(VASI.get(), VasiEntity.createAttributes().build());
		event.put(VASI_AGRESIV.get(), VasiagresivEntity.createAttributes().build());
		event.put(VASI_BOMBER.get(), VasibomberEntity.createAttributes().build());
		event.put(SOAP_ENTITY.get(), SoapentityEntity.createAttributes().build());
		event.put(SOAP_BLOCK_ENTITY.get(), SoapblockentityEntity.createAttributes().build());
		event.put(VASI_FRIENDLY.get(), FriendlyvasiEntity.createAttributes().build());
		event.put(VASI_MUTANT.get(), VasiMutantEntity.createAttributes().build());
		event.put(CHAIR.get(), ChairEntity.createAttributes().build());
		event.put(NASUC_ENTITY.get(), NasucEntityEntity.createAttributes().build());
		event.put(SKODA.get(), SkodaEntity.createAttributes().build());
		event.put(SHIRT_VASI.get(), ShirtVasiEntity.createAttributes().build());
		event.put(SUIT_VASI.get(), SuitVasiEntity.createAttributes().build());
	}
}
