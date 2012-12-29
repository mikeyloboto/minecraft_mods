package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AquamarineGem  extends Item {

	public AquamarineGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(3);
        	setItemName("aquamarine");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
