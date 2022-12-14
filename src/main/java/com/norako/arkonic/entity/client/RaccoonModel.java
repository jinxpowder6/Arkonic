package com.norako.arkonic.entity.client;

import com.norako.arkonic.Arkonic;
import com.norako.arkonic.entity.custom.RaccoonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity>
{

    @Override
    public ResourceLocation getModelLocation(RaccoonEntity object) {
        return new ResourceLocation(Arkonic.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RaccoonEntity object) {
        return new ResourceLocation(Arkonic.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RaccoonEntity animatable) {
        return new ResourceLocation(Arkonic.MOD_ID, "animations/raccoon.animation.json");
    }
}
