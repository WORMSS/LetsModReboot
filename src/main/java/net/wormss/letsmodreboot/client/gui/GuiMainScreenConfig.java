package net.wormss.letsmodreboot.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.wormss.letsmodreboot.handlers.ConfigHandler;
import net.wormss.letsmodreboot.references.R;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiMainScreenConfig extends GuiConfig {

	public GuiMainScreenConfig(GuiScreen parentScreen) {
		super(
			parentScreen,
			ConfigHandler.getGuiElements(),
			R.mod.ID,
			false,
			false,
			getAbridgedConfigPath(ConfigHandler.configPath())
		);
	}

}
