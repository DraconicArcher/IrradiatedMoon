package com.draconicarcher.irradiatedmoon.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class IMModFoods {
    public static final FoodProperties LAPIS_APPLE = new FoodProperties.Builder().nutrition(6).fast().alwaysEat()
            .saturationMod(2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600), 1.0f).build();

}