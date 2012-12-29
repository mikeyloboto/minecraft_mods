package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SapphireGem  extends Item {

	public SapphireGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(8);
        	setItemName("saphire");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}

