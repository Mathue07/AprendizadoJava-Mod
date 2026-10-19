package net.TestMod;

import net.TestMod.Items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Important Comment
public class TestMod implements ModInitializer {
	public static final String MOD_ID = "mod-de-teste";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
	}
}
