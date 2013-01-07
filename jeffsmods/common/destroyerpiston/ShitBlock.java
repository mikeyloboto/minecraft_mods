package jeffsmods.common.destroyerpiston;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;;

public class ShitBlock extends Block {

	public ShitBlock(int par1) {
		super(par1, Material.grass);
		// TODO Auto-generated constructor stub
		//this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	@Override
	public int getBlockTextureFromSide(int inp1){
		//return 0;
		//number of picture in texture file for multi-block textures
		//oh, i remember why we need input ointeger
		//input is a side of the block, if you need different texture on differrent side
		//0 - bottom, 1-top, 2-5 - sides
		switch(inp1){
		case 1:
			return 1;
		default:
			return 0;
			
		}
	}
	@Override
	public String getTextureFile(){
		return ClientProxy.BLOCKS_TEXTURE;
		//texture file
		//texture should be 256x256
		//each block picture is 16x16
	}

}
