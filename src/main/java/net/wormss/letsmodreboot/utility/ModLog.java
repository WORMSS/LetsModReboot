package net.wormss.letsmodreboot.utility;

import org.apache.logging.log4j.Level;

import net.wormss.letsmodreboot.resources.R;
import cpw.mods.fml.common.FMLLog;

public class ModLog {
	public static void log(Object... args) {
		String str = "";
		for ( Object obj : args ) {
			str += String.valueOf(obj) + " ";
		}
		FMLLog.log(R.mod.ID, Level.INFO, str);
	}
}
