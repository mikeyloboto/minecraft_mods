package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HeliodorGem  extends Item {

	public HeliodorGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(5);
        	setItemName("heliodor");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
