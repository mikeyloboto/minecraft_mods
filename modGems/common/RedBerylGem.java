package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedBerylGem  extends Item {

	public RedBerylGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(7);
        	setItemName("redberyl");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}

}
