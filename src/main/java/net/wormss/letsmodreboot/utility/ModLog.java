package net.wormss.letsmodreboot.utility;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;

import net.wormss.letsmodreboot.resources.R;
import cpw.mods.fml.common.FMLLog;

public class ModLog {
	public static void log(Object... args) {
		FMLLog.log(R.mod.ID, Level.INFO, StringUtils.join(args, " "));
	}
}
