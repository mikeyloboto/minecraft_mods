package ctmMonumentBlocks.common.Blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ctmMonumentBlocks.common.commonData.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CtmBlock extends Block {
public static int clor;
	public CtmBlock(int par1, int clor) {
		super(par1, 64, Material.cloth);
		// TODO Auto-generated constructor stub
		this.setResistance(20F);
		this.setHardness(0F);
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
	
    public int damageDropped(int par1)
    {
        return par1;
    }

    public static int getBlockFromDye(int par0)
    {
        return ~par0 & 15;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 16; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

}
