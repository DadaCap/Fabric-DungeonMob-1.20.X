package net.dadacap.dungeonmob;

import net.dadacap.dungeonmob.block.ModBlocks;
import net.dadacap.dungeonmob.item.ModItemGroups;
import net.dadacap.dungeonmob.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonMob implements ModInitializer {
	public static final String MOD_ID = "dungeonmob";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerMobDlock();
	}
}