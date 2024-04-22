package net.dadacap.dungeonmob;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonMob implements ModInitializer {
	public static final String MOD_ID = "dungeonmob";
    public static final Logger LOGGER = LoggerFactory.getLogger("dungeonmob");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}