package jeffsmods.common.destroyerpiston;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public static String BLOCKS_TEXTURE = "/jeffsmods/common/destroyerpiston/artwork/blocks.png";
	public static String ITEMS_TEXTURE = "/jeffsmods/common/destroyerpiston/artwork/items.png";
	
	public void registerRenderers(){
		MinecraftForgeClient.preloadTexture(BLOCKS_TEXTURE);
		MinecraftForgeClient.preloadTexture(ITEMS_TEXTURE);
		
		
		
	}

}
