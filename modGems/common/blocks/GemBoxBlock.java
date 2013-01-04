package modGems.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import modGems.common.commonData.ClientProxy;

public class GemBoxBlock extends Block {

	public GemBoxBlock(int par1, int par2) {
		super(par1, par2, Material.glass);
		// Constructor Configuration
		
	}
	@Override
	//public String getTextureFile () {
	//	return ClientProxy.BLOCK_PNG;
	//}
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
