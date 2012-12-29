package lotrWeaponsMod.common;

import java.util.Random;

import cpw.mods.fml.client.ITextureFX;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class LightBlock extends Block
{

	public LightBlock(int par1) {
		super(par1, Material.air);

		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
		this.setLightOpacity(0);
		this.setLightValue(1.0F);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setStepSound(null);
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

	public int getRenderBlockPass()
	{
        return 1;
	}

	public boolean renderAsNormalBlock()
	{
        return false;
	}

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
