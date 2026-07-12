package net.matt.firstmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.matt.firstmod.item.ModItems;
import net.matt.firstmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.getRIK(ModItems.FLUORITE))
                .add(ItemIds.IRON_INGOT)
                .add(ItemIds.COAL);

        tag(ItemTags.SWORDS).add(ModItems.getRIK(ModItems.FLUORITE_SWORD));
        tag(ItemTags.PICKAXES).add(ModItems.getRIK(ModItems.FLUORITE_PICKAXE));
        tag(ItemTags.SHOVELS).add(ModItems.getRIK(ModItems.FLUORITE_SHOVEL));
        tag(ItemTags.AXES).add(ModItems.getRIK(ModItems.FLUORITE_AXE));
        tag(ItemTags.HOES).add(ModItems.getRIK(ModItems.FLUORITE_HOE));
        tag(ItemTags.SPEARS).add(ModItems.getRIK(ModItems.FLUORITE_SPEAR));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRIK(ModItems.FLUORITE_HELMET));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRIK(ModItems.FLUORITE_CHESTPLATE));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRIK(ModItems.FLUORITE_LEGGINGS));

        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRIK(ModItems.FLUORITE_BOOTS));
        tag(ItemTags.BOW_ENCHANTABLE).add(ModItems.getRIK(ModItems.KAUPEN_BOW));
    }
}
