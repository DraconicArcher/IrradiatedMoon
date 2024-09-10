package com.draconicarcher.irradiatedmoon.item;


import com.draconicarcher.irradiatedmoon.IrradiatedMoon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IMModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IrradiatedMoon.MODID);

    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new Item(new Item.Properties().food(IMModFoods.LAPIS_APPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}