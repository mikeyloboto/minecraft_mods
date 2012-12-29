package modGems.common;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class RedBerylblock extends Block{

	public RedBerylblock(int id, int texture, Material material) {
		super(id, texture, material);
		setStepSound(Block.soundStoneFootstep);
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}
	
	@Override
	public String getTextureFile () {
		return ClientProxy.BLOCK_PNG;
	}
}
