package net.matt.firstmod;

import net.fabricmc.api.ModInitializer;

import net.matt.firstmod.block.ModBlocks;
import net.matt.firstmod.creativemodetab.ModCreativeModeTabs;
import net.matt.firstmod.data.ModDataComponents;
import net.matt.firstmod.item.ModItems;
import net.matt.firstmod.registries.ModCompostable;
import net.matt.firstmod.registries.ModFuels;
import net.matt.firstmod.stat.ModStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModFuels.registerFuels();
		ModCompostable.registerCompostable();
		ModDataComponents.registerDataComponents();
		ModStats.registerStats();
	}
}