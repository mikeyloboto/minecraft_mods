package modGems.common;
import java.util.Random;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CitrineDust extends Item {

		public CitrineDust(int id) {
			super(id);
			
			// Constructor Configuration
	        	maxStackSize = 64;
	        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
	        	setIconIndex(9);
	        	setItemName("citrinedust");

		}
		
		public String getTextureFile() {
			return ClientProxy.ITEMS_PNG;
		}

}
