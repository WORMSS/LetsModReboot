package net.wormss.letsmodreboot.block;

import net.wormss.letsmodreboot.references.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static final ModBlock basic = new BlockBasic();
	
	public static void init() {
		GameRegistry.registerBlock(basic, Names.blocks.basic);
	}
}
