package kindzadza.common;

import kindzadza.common.commonData.CommonProxy;
import kindzadza.common.commonData.ConfigData;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.SidedProxy;


@Mod(modid="kindzadza", name="KinDzaDza Mod (Soviet Movie)", version="1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)	
	
public class KinDzaDza{
	
	//ok, blocks init here

	
	
	@SidedProxy(clientSide="kindzadza.common.ClientProxy", serverSide="kindzadza.common.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		//loading configs here
		//better create separate class for that
		ConfigData.loadConf(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		
		
		
		proxy.registerRenderers();
	}
	
	
	
}
