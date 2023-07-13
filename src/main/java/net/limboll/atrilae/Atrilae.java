package net.limboll.atrilae;

import net.fabricmc.api.ModInitializer;
import net.limboll.atrilae.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Atrilae implements ModInitializer {
	public static final String Mod_ID = "atrilae";
    public static final Logger LOGGER = LoggerFactory.getLogger("atrilae");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}