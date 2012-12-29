package lotrWeaponsMod.common;

import net.minecraft.item.Item;

public class GlowingPhial extends Item {

	public GlowingPhial(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(7);
        	setItemName("glowing_phial");

	}
	
	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
}
