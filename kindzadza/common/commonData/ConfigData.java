package kindzadza.common.commonData;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;

public class ConfigData {

	
	public static int CAK_ID;
	
	
	static Configuration conf;
	public static void loadConf(FMLPreInitializationEvent event){
		conf = new Configuration(event.getSuggestedConfigurationFile());
		loadExtraConf();
		conf.save();
		
	}
	private static void loadExtraConf() {
		CAK_ID = conf.get(Configuration.CATEGORY_GENERAL, "cak", 14350).getInt();
		
	}
	public static void loadBlocksConf(){

	}
	
	public static void loadItemsConf(){

	}
	
	
}
