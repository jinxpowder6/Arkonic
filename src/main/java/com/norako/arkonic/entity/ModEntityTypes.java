package com.norako.arkonic.entity;

import com.norako.arkonic.Arkonic;
import com.norako.arkonic.entity.custom.MountaineerEntity;
import com.norako.arkonic.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Arkonic.MOD_ID);

    public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON =
            ENTITY_TYPES.register("raccoon",
            () -> EntityType.Builder.of(RaccoonEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(Arkonic.MOD_ID, "raccoon").toString()));

    public static final RegistryObject<EntityType<MountaineerEntity>> MOUNTAINEER =
            ENTITY_TYPES.register("mountaineer",
                    () -> EntityType.Builder.<MountaineerEntity>of(MountaineerEntity::new, MobCategory.MONSTER)
                            .sized(0.6F * 1.1F, 1.95F * 1.1F)
                            .clientTrackingRange(8)
                            .setCustomClientFactory((spawnEntity, level) -> new MountaineerEntity(level))
                            .build(new ResourceLocation(Arkonic.MOD_ID, "mountaineer").toString()));

    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
