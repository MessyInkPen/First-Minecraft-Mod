package net.matt.firstmod.datagen;

import com.mojang.blaze3d.audio.SoundBuffer;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.matt.firstmod.FirstMod;
import net.matt.firstmod.sound.ModSounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.SoundType;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.CHISEL_USE, SoundTypeBuilder.of(ModSounds.CHISEL_USE).subtitle("sounds.firstmod.chisel_use")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "chisel_use"))));
    }

    @Override
    public String getName() {
        return "FirstMod Sounds";
    }
}
