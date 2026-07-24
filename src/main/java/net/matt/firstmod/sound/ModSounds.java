package net.matt.firstmod.sound;

import net.matt.firstmod.FirstMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;


public class ModSounds {
    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");

    public static final Holder.Reference<SoundEvent> BAR_BRAWL = registerJukeBoxSong("bar_brawl");

    private static Holder.Reference<SoundEvent> registerJukeBoxSong(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds(){
        FirstMod.LOGGER.info("Registering sounds for " + FirstMod.MOD_ID);

    }
}
