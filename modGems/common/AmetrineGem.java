package modGems.common;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class AmetrineGem extends Item {

		public AmetrineGem(int id) {
			super(id);
			
			// Constructor Configuration
	        	maxStackSize = 64;
	        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
	        	setIconIndex(2);
	        	setItemName("ametrine");

		}
		
		public String getTextureFile() {
			return ClientProxy.ITEMS_PNG;
		}

}
