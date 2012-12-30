package lotrWeaponsMod.common;

import java.util.Random;

import cpw.mods.fml.client.ITextureFX;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class LightBlock extends Block
{

	public LightBlock(int par1) {
		super(par1, Material.air);

		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	}

	//@Override
	
	public boolean isAirBlock(World world, int x, int y, int z) 
    {
        return true;
    }

    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return false;
    }
	@Override
	public int getBlockTextureFromSide(int inp)
	{
		return 3;

	}
	public boolean isOpaqueCube()
	{
        return false;
	}
	 public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	    {
	        return null;
	    }
	public int getRenderBlockPass()
	{
        return 1;
	}

	public boolean renderAsNormalBlock()
	{
        return false;
	}
    public boolean isBlockReplaceable(World world, int x, int y, int z) 
    {
        return true;
    }
	//@Override
	//public void onBlockAdded(World par1World, int i, int j, int k){
    //super.onBlockAdded(par1World, i, j, k);
	//		par1World.setBlock(i, j, k, 0);
	//		
		
	//}
	
	protected boolean canSilkHarvest()
	{
        return false;
	}

	public int idDropped(int par1, Random random, int par2) {
		return 0;
	}

	@Override
	public String getTextureFile () {
		return ClientProxy.LOTRBLOCKS_PNG;
	
	}
}
