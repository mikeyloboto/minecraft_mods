package ctmMonumentBlocks.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ctmMonumentBlocks.common.Blocks.CtmBlock;
import ctmMonumentBlocks.common.Blocks.MultiCtmBlock;
import ctmMonumentBlocks.common.commonData.CommonProxy;
import ctmMonumentBlocks.common.commonData.ConfigData;




@Mod(modid="ctmMonumentBlocks", name="CTM Monument Blocks", version="V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CtmMonumentBlocks
	{
	//public static final CreativeTabs TabCtm = new CreativeTabCtmBlocks();
	
	public static Block CtmBlock;

	public static int blId = ConfigData.CTM_BLOCK_ID;
	public static String bn = ConfigData.CTM_DEFAULT_NAME;
	private static final String[] multiBlockNames = { 
		"White " + bn, "Orange " + bn, "Magenta " + bn, "Light Blue " + bn,
		"Yellow " + bn, "Light Green " + bn, "Pink " + bn, "Dark Grey " + bn,
		"Light Grey " + bn, "Cyan " + bn, "Purple " + bn, "Blue " + bn,
		"Brown " + bn, "Green " + bn, "Red " + bn, "Black " + bn
	};
	
	@SidedProxy(clientSide="ctmMonumentBlocks.common.commonData.ClientProxy", serverSide="ctmMonumentBlocks.common.commonData.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		ConfigData.loadConfig(event);
	}
	@Init
	public void Init(FMLInitializationEvent event){
		//CtmBlock = new CtmBlock(blId);
		//GameRegistry.registerBlock(CtmBlock, MultiCtmBlock.class);
		for (int i = 0; i < 16; i++) {
			//ItemStack CtmBlockStack = new ItemStack(CtmBlock, 1, i);
			//LanguageRegistry.addName(CtmBlockStack, multiBlockNames[CtmBlockStack.getItemDamage()]);
		}
		proxy.registerRenderers();
		
	}
	
	}