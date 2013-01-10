package ctmMonumentBlocks.common;

import ctmMonumentBlocks.common.Blocks.CtmBlock;
import ctmMonumentBlocks.common.commonData.ConfigData;
import ctmMonumentBlocks.common.commonData.CommonProxy;
import ctmMonumentBlocks.common.commonData.CreativeTabCtmBlocks;
import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.Block;
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
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.SidedProxy;




@Mod(modid="ctmMonumentBlocks", name="CTM Monument Blocks", version="V1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CtmMonumentBlocks
	{
	public static final CreativeTabs TabCtm = new CreativeTabCtmBlocks();
	
	public static Block WhiteBlock;
	public static Block OrangeBlock;
	public static Block MagentaBlock;
	public static Block LightBlueBlock;
	public static Block YellowBlock;
	public static Block LimeBlock;
	public static Block PinkBlock;
	public static Block DarkGrayBlock;
	public static Block LightGrayBlock;
	public static Block CyanBlock;
	public static Block PurpleBlock;
	public static Block BlueBlock;
	public static Block BrownBlock;
	public static Block GreenBlock;
	public static Block RedBlock;
	public static Block BlackBlock;
	public static int blId = ConfigData.CTM_BLOCK_ID;
	public static String bn = ConfigData.CTM_DEFAULT_NAME;
	
	
	@SidedProxy(clientSide="ctmMonumentBlocks.common.commonData.ClientProxy", serverSide="ctmMonumentBlocks.common.commonData.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		ConfigData.loadConfig(event);
	}
	@Init
	public void Init(FMLInitializationEvent event){
		WhiteBlock = new CtmBlock(blId, 0);
		//OrangeBlock = new CtmBlock(blId, 1);
		//MagentaBlock = new CtmBlock(blId, 2);
		//LightBlueBlock = new CtmBlock(blId, 3);
		//YellowBlock = new CtmBlock(blId, 4);
		//LimeBlock = new CtmBlock(blId, 5);
		//PinkBlock = new CtmBlock(blId, 6);
		//DarkGrayBlock = new CtmBlock(blId, 7);
		//LightGrayBlock = new CtmBlock(blId, 8);
		//CyanBlock = new CtmBlock(blId, 9);
		//PurpleBlock = new CtmBlock(blId, 10);
		//BlueBlock = new CtmBlock(blId, 11);
		//BrownBlock = new CtmBlock(blId, 12);
		//GreenBlock = new CtmBlock(blId, 13);
		//RedBlock = new CtmBlock(blId, 14);
		//BlackBlock = new CtmBlock(blId, 15);
		
		GameRegistry.registerBlock(WhiteBlock);
		//GameRegistry.registerBlock(OrangeBlock);
		//GameRegistry.registerBlock(MagentaBlock);
		//GameRegistry.registerBlock(LightBlueBlock);
		//GameRegistry.registerBlock(YellowBlock);
		//GameRegistry.registerBlock(LimeBlock);
		//GameRegistry.registerBlock(PinkBlock);
		//GameRegistry.registerBlock(DarkGrayBlock);
		//GameRegistry.registerBlock(LightGrayBlock);
		//GameRegistry.registerBlock(CyanBlock);
		//GameRegistry.registerBlock(PurpleBlock);
		//GameRegistry.registerBlock(BlueBlock);
		//GameRegistry.registerBlock(BrownBlock);
		//GameRegistry.registerBlock(GreenBlock);
		//GameRegistry.registerBlock(RedBlock);
		//GameRegistry.registerBlock(BlackBlock);
		
		
		
		proxy.registerRenderers();
	}
	}
	