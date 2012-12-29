package modGems.common;
 
import java.util.Random;
 
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class WorldOreGen implements IWorldGenerator{
 
        public void generate(Random random, int chunkX, int chunkZ, World world,  IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
               
               
                switch(world.provider.dimensionId){
               
                case -1: generateNether(world, random, chunkX*16, chunkZ*16);
                case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
               
                }
        }
       
       
        public void generateSurface(World world, Random random, int blockX, int blockZ)
               {
            	   {
            		   	int Xcoord = blockX + random.nextInt(16);
            		   	int Ycoord = random.nextInt(56);
            		   	int Zcoord = blockZ + random.nextInt(16);
            		   	(new WorldGenMinable(modGems.common.gems.BerylStone.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   	}
            	   	{
            		   	int Xcoord = blockX + random.nextInt(16);
            		   	int Ycoord = random.nextInt(30);
            		   	int Zcoord = blockZ + random.nextInt(16);
                	   	(new WorldGenMinable(modGems.common.gems.AmethystOre.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
            	  if (ConfigData.AMETRINE_MINEABLE){
            		   int Xcoord = blockX + random.nextInt(16);
            		   int Ycoord = random.nextInt(25);
            		   int Zcoord = blockZ + random.nextInt(16);
            		   (new WorldGenMinable(modGems.common.gems.AmetrineOre.blockID, 3)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
            	   {
            		   int Xcoord = blockX + random.nextInt(16);
            		   int Ycoord = random.nextInt(50);
            		   int Zcoord = blockZ + random.nextInt(16);
            		   (new WorldGenMinable(modGems.common.gems.FossilStone.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
            	   {
            		   int Xcoord = blockX + random.nextInt(16);
            		   int Ycoord = random.nextInt(20);
            		   int Zcoord = blockZ + random.nextInt(16);
            		   (new WorldGenMinable(modGems.common.gems.QuartzOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
            	   {
            		   int Xcoord = blockX + random.nextInt(16);
            		   int Ycoord = random.nextInt(40);
            		   int Zcoord = blockZ + random.nextInt(16);
            		   (new WorldGenMinable(modGems.common.gems.OnyxOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
            	   {
            		   int Xcoord = blockX + random.nextInt(16);
            		   int Ycoord = random.nextInt(10);
            		   int Zcoord = blockZ + random.nextInt(16);
            		   (new WorldGenMinable(modGems.common.gems.SapphireOre.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
            	   }
               }
       
        public void generateNether(World world, Random random, int blockX, int blockZ){
               
               
               
        }
       
       
       
}