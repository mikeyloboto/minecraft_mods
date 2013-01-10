package ctmMonumentBlocks.common.commonData;

import ctmMonumentBlocks.common.CtmMonumentBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;

public class CreativeTabCtmBlocks extends CreativeTabs{
	
public CreativeTabCtmBlocks() {
	
	super(ClientProxy.CTM_BLOCKS_PNG);
	// TODO Auto-generated constructor stub
}
public String getTranslatedTabLabel()
{
return StringTranslate.getInstance().translateKey("" + this.getTabLabel());
}
public String getTabLabel()
	{
		return "CTM Monument Blocks";
	}	

@Override
public ItemStack getIconItemStack() {

    return new ItemStack(CtmMonumentBlocks.WhiteBlock);
}
}
