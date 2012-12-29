package pumpkinMods.common;

import net.minecraftforge.client.MinecraftForgeClient;
import pumpkinMods.common.CommonProxy;

public class ClientProxy extends CommonProxy
	{

	public static String PUMPITEMS_PNG = "/pumpkinMods/common/artwork/items.png";
	public static String PUMPBLOCKS_PNG = "/pumpkinMods/common/artwork/blocks.png";
	public static String PUMPTAB_PNG = "/pumpkinMods/common/artwork/tab.png";

	public void registerRenderers () {
		MinecraftForgeClient.preloadTexture(PUMPITEMS_PNG);
		MinecraftForgeClient.preloadTexture(PUMPBLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(PUMPTAB_PNG);
	}
}