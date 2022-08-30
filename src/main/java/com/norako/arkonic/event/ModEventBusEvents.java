package com.norako.arkonic.event;

import com.norako.arkonic.Arkonic;
import com.norako.arkonic.entity.ModEntityTypes;
import com.norako.arkonic.entity.custom.RaccoonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Arkonic.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents
{
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
    }
}
