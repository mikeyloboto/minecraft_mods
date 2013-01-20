package ctmMonumentBlocks.common.Blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MultiCtmBlock extends ItemBlock{
	private final static String[] subNames = {
		"white", "orange",  "magenta", "lightBlue", "yellow", "lightGreen",
		"pink", "darkGrey", "lightGrey", "cyan", "purple", "blue", "brown",
		"green", "red", "black"
	};

	public MultiCtmBlock(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("ctmMultiBlock");
	}
	
	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + subNames[itemstack.getItemDamage()];
	}

}
