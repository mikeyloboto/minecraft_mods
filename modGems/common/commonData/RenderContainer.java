package modGems.common.commonData;

import modGems.common.CollectibleGems;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.ForgeHooksClient;

import org.lwjgl.opengl.GL11;

public class RenderContainer extends TileEntitySpecialRenderer
{
    private GemBoxModel model = new GemBoxModel();

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick)
    {
        int meta = te.worldObj.getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
        model.render(0.0625f, x, y, z, 180f, (meta & 3) * 90f, (meta & 4) == 4, te.getBlockType().blockID == CollectibleGems.renderId, (meta & 8) == 8);
    }
}