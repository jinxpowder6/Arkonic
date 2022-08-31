package com.norako.arkonic.entity.client;

import com.norako.arkonic.Arkonic;
import com.norako.arkonic.entity.custom.MountaineerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MountaineerModel extends AnimatedGeoModel<MountaineerEntity>
{

    @Override
    public ResourceLocation getModelLocation(MountaineerEntity object) {
        return new ResourceLocation(Arkonic.MOD_ID, "geo/mountaineer.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MountaineerEntity object) {
        return new ResourceLocation(Arkonic.MOD_ID, "textures/entity/illagers/mountaineer.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MountaineerEntity animatable) {
        return new ResourceLocation(Arkonic.MOD_ID, "animations/mountaineer.animation.json");
    }
}
