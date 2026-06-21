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
                    }).build());


    public static void registerModCreativeModeTabs(){
        FirstMod.LOGGER.info("Registering Creative Mode tabs for " + FirstMod.MOD_ID);

    }
}
