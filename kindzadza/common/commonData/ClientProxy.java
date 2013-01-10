package kindzadza.common.commonData;

import net.minecraftforge.client.MinecraftForgeClient;
import lotrWeaponsMod.common.commonData.CommonProxy;
public class ClientProxy extends CommonProxy
	{

	public static String LOTRITEMS_PNG = "/lotrWeaponsMod/common/artwork/items.png";

	public void registerRenderers () {
		MinecraftForgeClient.preloadTexture(LOTRITEMS_PNG);		
	}
}