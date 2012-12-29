package pumpkinMods.common;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;

public class ConfigData {


public static int MFACE;
public static int GFACE;
public static int RFACE;
	
	static Configuration conf;
	public static void loadConf(FMLPreInitializationEvent event){
		conf = new Configuration(event.getSuggestedConfigurationFile());
		conf.load();
		System.out.println("PumpkinHeads Mods [PumpkinAPI] - Loading Blocks Configuration");
		loadBlocksConf();
		System.out.println("PumpkinHeads Mods [PumpkinAPI] - Loading Items Configuration");
		loadItemsConf();
		System.out.println("PumpkinHeads Mods [PumpkinAPI] - Loading Other Configuration");
		loadExtraConf();
		conf.save();
		System.out.println("PumpkinHeads Mods [PumpkinAPI] - Configuration Loaded");
		
	}
	private static void loadExtraConf() {
		
	}
	public static void loadBlocksConf(){


	}
	
	public static void loadItemsConf(){
		MFACE = conf.getItem("mface",  15329).getInt();
		GFACE = conf.getItem("gface",  15330).getInt();
		RFACE = conf.getItem("rface",  15331).getInt();

	}
	
	
}
