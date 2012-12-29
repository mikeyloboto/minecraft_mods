package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sardonyx  extends Item {

	public Sardonyx(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(13);
        	setItemName("sardonyx");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}

