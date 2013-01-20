package ctmMonumentBlocks.common.Blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ctmMonumentBlocks.common.CtmMonumentBlocks;
import ctmMonumentBlocks.common.commonData.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CtmBlock extends Block {
	public CtmBlock(int par1) {
		super(par1, Material.iron);
		this.setResistance(20F);
		this.setHardness(1F);
		setBlockName("ctmBlock");
		setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabBlocks);
	}
	@Override
	public String getTextureFile() {
		return ClientProxy.CTM_BLOCKS_PNG;
	}
	
	@Override
	 public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
       return par2;
    }
	@Override
    public int damageDropped(int par1)
    {
        return par1;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
    	for (int i = 0; i < 16; i++) {
    		subItems.add(new ItemStack(this, 1, i));
    	}
    }

}
