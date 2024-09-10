

package com.draconicarcher.irradiatedmoon.effects;

import com.draconicarcher.irradiatedmoon.init.IMEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class IrradiatedEffect extends MobEffect {


    public IrradiatedEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.getCommandSenderWorld().isClientSide) {
            boolean canSeeSky = entity.getCommandSenderWorld().canSeeSky(entity.blockPosition());

            if (canSeeSky) {




                // Deal 1 damage per level every 10 seconds
                if (entity.tickCount % 200 == 0) {
                    entity.hurt(entity.damageSources().magic(), 1.0F * (amplifier + 1));
                }
            } else {
                // If entity can no longer see sky, end effect after 10 seconds
                if (entity.tickCount % 200 >= 10) {
                    entity.removeEffect(this);
                }
            }

            if (entity.tickCount >= 2400) {
                entity.addEffect(new MobEffectInstance(IMEffects.IRRADIATEDII.get(), 999999999, amplifier));
            }

        }
    }


    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true; // Always apply the effect tick
    }
}

