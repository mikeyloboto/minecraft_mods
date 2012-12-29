package modGems.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class AmberGem  extends Item {

	public AmberGem(int id) {
		super(id);
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(0);
        	setItemName("amber");

	}
	
	public String getTextureFile() {
		return ClientProxy.ITEMS_PNG;
	}
}
