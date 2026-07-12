package net.matt.firstmod.registries;

import net.fabricmc.fabric.api.registry.CompostableRegistry;
import net.matt.firstmod.item.ModItems;
import net.minecraft.world.level.storage.loot.entries.ComposableEntryContainer;

public class ModCompostable {
    public static void registerCompostable(){
        CompostableRegistry.INSTANCE.add(ModItems.STRAWBERRY, 0.5f);
        CompostableRegistry.INSTANCE.add(ModItems.STRAWBERRY_SEEDS, 0.3f);
    }
}
