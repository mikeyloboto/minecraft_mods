package modGems.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import modGems.common.commonData.ClientProxy;

public class AmetrineBlock extends Block {

	public AmetrineBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
		// TODO Auto-generated constructor stub

		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}

	@Override
	public int getBlockTextureFromSide(int inp) {
		return 12;
	}

	@Override
	public String getTextureFile() {
		return ClientProxy.BLOCK_PNG;

	}
}
