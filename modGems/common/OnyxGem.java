package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OnyxGem  extends Item {

	public OnyxGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(6);
        	setItemName("onyx");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
