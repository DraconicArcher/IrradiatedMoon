package com.draconicarcher.irradiatedmoon.init;

import com.draconicarcher.irradiatedmoon.IrradiatedMoon;
import com.draconicarcher.irradiatedmoon.effects.IrradiatedEffect;
import com.draconicarcher.irradiatedmoon.effects.IrradiatedEffectII;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IMEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, IrradiatedMoon.MODID);

    public static final RegistryObject<MobEffect> IRRADIATED = MOB_EFFECTS.register("irradiated",
            () -> new IrradiatedEffect(MobEffectCategory.HARMFUL, 3124687));
    public static final RegistryObject<MobEffect> IRRADIATEDII = MOB_EFFECTS.register("irradiatedii",
            () -> new IrradiatedEffectII(MobEffectCategory.HARMFUL, 3124687).addAttributeModifier(Attributes.MOVEMENT_SPEED, "3bdd10c3-e71f-4992-8513-d0c49f1be7a8", -0.15000000596046448D, AttributeModifier.Operation.MULTIPLY_TOTAL).addAttributeModifier(Attributes.MAX_HEALTH, "c765d9b9-7a02-4326-b08e-e1e8f0c7271f", -2, AttributeModifier.Operation.ADDITION).addAttributeModifier(Attributes.ATTACK_SPEED, "1678b61f-b577-4c27-8e4e-1d6933dd4d47", -0.10000000149011612D, AttributeModifier.Operation.MULTIPLY_TOTAL));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}