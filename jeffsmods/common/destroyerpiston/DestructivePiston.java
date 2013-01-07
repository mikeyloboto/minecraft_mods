package jeffsmods.common.destroyerpiston;

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


@Mod(modid="destroyerpiston", name="Block Removing Piston", version="1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)	
	
public class DestructivePiston{
	
	//ok, blocks init here
	public static Block ShitBlock;
	public static Block PistonDestroyerBase;
	public static Block PistonDestroyerHead;
	public static PistonDestroyerMoving PistonDestroyerMoving;

	
	
	@SidedProxy(clientSide="jeffsmods.common.destroyerpiston.ClientProxy", serverSide="jeffsmods.common.destroyerpiston.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		//loading configs here
		//better create separate class for that
		ConfigData.loadConf(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		//here is the main part of the mod, withh blocks, blackjack and hookers
		//here is creating all block properties.
		ShitBlock = new ShitBlock(ConfigData.SHIT_BLOCK_ID).setHardness(2F).setResistance(100F).setBlockName("shit_block");
		PistonDestroyerBase = new PistonDestroyerBase(ConfigData.PISTON_DEST_BASE,2);
		PistonDestroyerHead = new PistonDestroyerHead(ConfigData.PISTON_DEST_HEAD, 2);
		PistonDestroyerMoving = new PistonDestroyerMoving(ConfigData.PISTON_DEST_MOVING);
		//are you playing now?
		//are you here?
		//hello?
		//
		GameRegistry.registerBlock(ShitBlock);
		LanguageRegistry.addName(ShitBlock, "Block Of Shit");
		//this is block
		GameRegistry.registerBlock(PistonDestroyerBase);
		LanguageRegistry.addName(PistonDestroyerBase, "Destructive Piston");
		GameRegistry.registerBlock(PistonDestroyerHead);
		LanguageRegistry.addName(PistonDestroyerHead, "Destructive Piston");
		GameRegistry.registerBlock(PistonDestroyerMoving);
		LanguageRegistry.addName(PistonDestroyerMoving, "Destructive Piston");
		
		
		
		//GameRegistry.addRecipe(new ItemStack(ShitBlock), "xx", "xx", 'x', new ItemStack(net.minecraft.block.Block.dirt));
		GameRegistry.addRecipe(new ItemStack(PistonDestroyerBase), "x", "y", 'y', new ItemStack(Block.pistonBase), 'x', new ItemStack(net.minecraft.item.Item.pickaxeSteel));
		
		//adding crafting
		//keep going
		//now you will want to limit tools that can be used to harvest this block
		//MinecraftForge.setBlockHarvestLevel(ShitBlock,  "pickaxe",  1);
		//0 - wood, 1 - stone, 2 - iron, 3 - diamond
		
		//hmmm what else
		//i think we can launch it
		//are you still here?
		
		GameRegistry.registerTileEntity(TileEntityDestructionPiston.class, "destructionPiston");
		proxy.registerRenderers();
	}
	
	
	
}
