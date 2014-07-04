package net.wormss.letsmodreboot.handlers;

import java.io.File;
import java.util.List;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.wormss.letsmodreboot.resources.R;
import net.wormss.letsmodreboot.utility.ModLog;

public class ConfigHandler {
	static class EventRegister {
		@SubscribeEvent
		void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			ModLog.log("configChanged:", event.modID);
			if (event.modID.equalsIgnoreCase(R.mod.ID)) {
				loadConfig();
	        }
		}
	}
	
	private static Configuration config;
	public static boolean value = true;
	
	public static void init(File configFile) {
		if ( config == null ) {
			config = new Configuration(configFile);
			loadConfig();
			FMLCommonHandler.instance().bus().register(new EventRegister());
		}
	}
	
	private static void loadConfig() {
		if ( config == null ) {
			return;
		}
		ModLog.log("loadConfig:", config);
		config.load();
		value = config.get(Configuration.CATEGORY_GENERAL, R.config.VALUE, value, "Example configValue").getBoolean(value);
		
		if ( config.hasChanged() ) {
			config.save();
		}
	}

	public static List getGuiElements() {
		return new ConfigElement(config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements();
	}

	public static String configPath() {
		return config.toString();
	}
	
}
