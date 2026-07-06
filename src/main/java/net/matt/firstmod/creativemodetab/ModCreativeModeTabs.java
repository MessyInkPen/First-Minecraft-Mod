package net.matt.firstmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.matt.firstmod.FirstMod;
import net.matt.firstmod.block.ModBlocks;
import net.matt.firstmod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "mod_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE))
                    .title(Component.translatable("creativemodetab.firstmod.mod_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.FLUORITE);
                        output.accept(ModItems.RAW_FLUORITE);
                        output.accept(ModBlocks.FLUORITE_BLOCK);
                        output.accept(ModBlocks.RAW_FLUORITE_BLOCK);
                        output.accept(ModBlocks.FLUORITE_ORE);
                        output.accept(ModBlocks.FLUORITE_DEEPSLATE_ORE);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModBlocks.MAGIC_BLOCK);
                        output.accept(ModItems.STRAWBERRY);
                        output.accept(ModItems.COMBUSTIBLE_SPORES);
                        output.accept(ModBlocks.FLUORITE_STAIRS);
                        output.accept(ModBlocks.FLUORITE_SLAB);
                        output.accept(ModBlocks.FLUORITE_BUTTON);
                        output.accept(ModBlocks.FLUORITE_PRESSURE_PLATE);
                        output.accept(ModBlocks.FLUORITE_FENCE);
                        output.accept(ModBlocks.FLUORITE_FENCE_GATE);
                        output.accept(ModBlocks.FLUORITE_WALL);
                        output.accept(ModBlocks.FLUORITE_DOOR);
                        output.accept(ModBlocks.FLUORITE_TRAPDOOR);
                        output.accept(ModItems.FLUORITE_SWORD);
                        output.accept(ModItems.FLUORITE_PICKAXE);
                       output.accept(ModItems.FLUORITE_SHOVEL);
                       output.accept(ModItems.FLUORITE_AXE);
                       output.accept(ModItems.FLUORITE_HOE);
                       output.accept(ModItems.FLUORITE_SPEAR);
                       output.accept(ModItems.FLUORITE_HELMET);
                       output.accept(ModItems.FLUORITE_CHESTPLATE);
                       output.accept(ModItems.FLUORITE_LEGGINGS);
                       output.accept(ModItems.FLUORITE_BOOTS);
                       output.accept(ModItems.FLUORITE_HORSE_ARMOR);
                       output.accept(ModBlocks.FLUORITE_LAMP);
                       output.accept(ModItems.KAUPEN_BOW);
                       output.accept(ModItems.SCULKBEAM_STAFF);
                    }).build());


    public static void registerModCreativeModeTabs(){
        FirstMod.LOGGER.info("Registering Creative Mode tabs for " + FirstMod.MOD_ID);

    }
}
