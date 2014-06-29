package net.wormss.letsmodreboot.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.wormss.letsmodreboot.resources.R;

public class ConfigurationHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		try {
			config.load();
			
			boolean configValue = config.get(Configuration.CATEGORY_GENERAL, R.config.VALUE, true, "Example configValue").getBoolean(true);
		} catch (Exception err) {
			// Log Exception
		} finally {
			config.save();
		}
	}
}
