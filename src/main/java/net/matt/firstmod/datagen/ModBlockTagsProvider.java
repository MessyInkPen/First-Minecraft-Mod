package net.matt.firstmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.matt.firstmod.block.ModBlocks;
import net.matt.firstmod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.BlockIds;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.RAW_FLUORITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_DEEPSLATE_ORE))
                .add(ModBlocks.getRK(ModBlocks.MAGIC_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_SLAB))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_FENCE))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_FENCE_GATE))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_WALL))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_DOOR))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_TRAPDOOR))
                .add(ModBlocks.getRK(ModBlocks.PEDISTAL_BLOCK));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_DEEPSLATE_ORE));

        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.FLUORITE_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.FLUORITE_SLAB));
        tag(BlockTags.BUTTONS).add(ModBlocks.getRK(ModBlocks.FLUORITE_BUTTON));
        tag(BlockTags.PRESSURE_PLATES).add(ModBlocks.getRK(ModBlocks.FLUORITE_PRESSURE_PLATE));

        tag(BlockTags.FENCES).add(ModBlocks.getRK(ModBlocks.FLUORITE_FENCE));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(ModBlocks.FLUORITE_FENCE_GATE));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.FLUORITE_WALL));

        tag(BlockTags.DOORS).add(ModBlocks.getRK(ModBlocks.FLUORITE_DOOR));
        tag(BlockTags.TRAPDOORS).add(ModBlocks.getRK(ModBlocks.FLUORITE_TRAPDOOR));

        tag(ModTags.Blocks.NEEDS_FLUORITE_TOOL)
                .add(ModBlocks.getRK(ModBlocks.MAGIC_BLOCK))
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_FLUORITE_TOOL)
                .add(ModBlocks.getRK(Blocks.OBSIDIAN))
                .add(ModBlocks.getRK(Blocks.CRYING_OBSIDIAN))
                .add(ModBlocks.getRK(Blocks.NETHERITE_BLOCK))
                .add(ModBlocks.getRK(Blocks.RESPAWN_ANCHOR))
                .add(ModBlocks.getRK(Blocks.ANCIENT_DEBRIS));

        tag(BlockTags.CROPS).add(ModBlocks.getRK(ModBlocks.STRAWBERRY_CROP));
    }
}
