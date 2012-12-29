package modGems.common;

import net.minecraftforge.client.MinecraftForgeClient;
import modGems.common.CommonProxy;

public class ClientProxy extends CommonProxy {
	public static String ITEMS_PNG = "/modGems/common/gemsartwork/items.png";
	public static String BLOCK_PNG = "/modGems/common/gemsartwork/blocks.png";

	public void registerRenderers () {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
}