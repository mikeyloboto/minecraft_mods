package lotrWeaponsMod.common;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

public class GlowingPhial extends Item {

	public GlowingPhial(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		
		// Constructor Configuration
        	maxStackSize = 64;
        	setCreativeTab(pumpkinMods.common.pumpkinModsBase.pumpkinTabItems);
        	setIconIndex(7);
        	setItemName("glowing_phial");

	}
	
	public String getTextureFile() {
		return ClientProxy.LOTRITEMS_PNG;
	}
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {     

            if (par3Entity instanceof EntityPlayer)
            {
                EntityPlayer var7 = (EntityPlayer)par3Entity;
                
            }

            if (par5)
            {
            	
                int plX = (int)par3Entity.posX;
                int plY = (int)par3Entity.posY-1;
                int plZ = (int)par3Entity.posZ;
                Random rand = new Random();
                int chance = rand.nextInt(20);
                if (par2World.getBlockId(plX,  plY,  plZ) == 0){
                	//par2World.setBlockWithNotify(plX, plY, plZ, lotrWeapons.LightBlock.blockID);
                	//EnumSkyBlock par1EnumSkyBlock = null;
                	for (int i = plX-8; i<=(plX+8); i++){
                		for (int j = plY-8; j <=plY+8; j++){
                			for (int k = plZ-8; k<=plZ+8; k++){
                				if (par2World.getBlockId(i,  j,  k) == lotrWeapons.LightBlock.blockID){
                					par2World.setBlock(i, j, k, 0);
                					System.out.println("Removed");
                				}
                			}
                		}
                	}
                	par2World.setBlockAndMetadataWithUpdate(plX,  plY,  plZ,  lotrWeapons.LightBlock.blockID,  0,  true);
                	//System.out.println("fail");
                }
                
               
            }
        
	}
}
