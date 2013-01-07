package modGems.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;
import modGems.common.commonData.CommonProxy;;

public class ClientProxy extends CommonProxy {
	public static String ITEMS_PNG = "/modGems/common/gemsartwork/items.png";
	public static String BLOCK_PNG = "/modGems/common/gemsartwork/blocks.png";
	public static String GEMBOX_PNG = "/modGems/common/gemsartwork/gembox.png";

	public void registerRenderers () {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(GEMBOX_PNG);
	}
}