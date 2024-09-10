
package com.draconicarcher.irradiatedmoon.effects;

import com.draconicarcher.irradiatedmoon.init.IMEffects;
import com.draconicarcher.irradiatedmoon.item.IMModItems;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.Collections;

public class IrradiatedEffectII extends MobEffect {
    public IrradiatedEffectII(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);

        MobEffectInstance effect = new MobEffectInstance(IMEffects.IRRADIATEDII.get(), 999999999, 0);
        effect.setCurativeItems(Collections.singletonList(IMModItems.LAPIS_APPLE.get().getDefaultInstance()));

        // Apply effect to entities
    }
}