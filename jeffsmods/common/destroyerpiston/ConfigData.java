package jeffsmods.common.destroyerpiston;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class ConfigData {
public static int SHIT_BLOCK_ID;
public static int PISTON_DEST_BASE;
public static int PISTON_DEST_HEAD;
public static int PISTON_DEST_MOVING;


static Configuration conf;
public static void loadConf(FMLPreInitializationEvent event){
	conf = new Configuration(event.getSuggestedConfigurationFile());
	conf.load();
	SHIT_BLOCK_ID = conf.getBlock("BlockOfShit", 2500).getInt();
	PISTON_DEST_BASE = conf.getBlock("PistonDestBase", 2501).getInt();
	PISTON_DEST_HEAD = conf.getBlock("PistonDestHead", 2502).getInt();
	PISTON_DEST_MOVING = conf.getBlock("PistonDestMove", 2503).getInt();
	
	//to be able to change block id in case several mods use it already
	//if yopu don't do it, people will hate you and call you piece of dick
	conf.save();
	
}

}
