package net.wormss.letsmodreboot.creative;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import net.wormss.letsmodreboot.item.ModItems;
import net.wormss.letsmodreboot.references.R;
import net.wormss.letsmodreboot.references.Strings;
import net.wormss.letsmodreboot.utility.ModLog;

public class ModCreativeTabs {
	
	public static final CreativeTabs general = new CreativeTabs(R.tabs.general){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ModItems.basic;
		}
	};
}
