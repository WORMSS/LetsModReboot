package net.wormss.letsmodreboot.item;

import net.wormss.letsmodreboot.references.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ModItem basic = new ItemBasic();
	
	public static void init() {
		GameRegistry.registerItem(basic, Names.items.basic);
	}
}
