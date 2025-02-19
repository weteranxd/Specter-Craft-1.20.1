package scm.chrom.spectercraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scm.chrom.spectercraft.block.ModBlocks;
import scm.chrom.spectercraft.item.ModItemGroups;
import scm.chrom.spectercraft.item.ModItems;

public class SpecterCraft implements ModInitializer {
	public static final String MOD_ID = "specter-craft";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}