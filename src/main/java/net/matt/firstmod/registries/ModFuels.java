package net.matt.firstmod.registries;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.matt.firstmod.item.ModItems;

public class ModFuels {
    public static void registerFuels(){
        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.COMBUSTIBLE_SPORES, 1200);
        });
    }
}
