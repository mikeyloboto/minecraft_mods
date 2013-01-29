package modGems.common.commonData;

import org.lwjgl.opengl.GL11;

import modGems.common.entity.GemBoxTileEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.ForgeHooksClient;

public class GemBoxModel extends ModelBase {
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	private float scale;

	public GemBoxModel(float scale) {
		textureWidth = 64;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(-8F, 0F, -8F, 16, 1, 16, scale);
		Shape1.setRotationPoint(0F, 7F, 0F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 17);
		Shape2.addBox(0F, 0F, 0F, 1, 15, 1, scale);
		Shape2.setRotationPoint(7F, -8F, 7F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 17);
		Shape3.addBox(0F, 0F, 0F, 1, 15, 1, scale);
		Shape3.setRotationPoint(7F, -8F, -8F);
		Shape3.setTextureSize(64, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 17);
		Shape4.addBox(0F, 0F, 0F, 1, 15, 1, scale);
		Shape4.setRotationPoint(-8F, -8F, -8F);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 17);
		Shape5.addBox(0F, 0F, 0F, 1, 15, 1, scale);
		Shape5.setRotationPoint(-8F, -8F, 7F);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 4, 17);
		Shape6.addBox(0F, 0F, 0F, 14, 1, 1, scale);
		Shape6.setRotationPoint(-7F, -8F, 7F);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 4, 17);
		Shape7.addBox(0F, 0F, 0F, 14, 1, 1, scale);
		Shape7.setRotationPoint(-7F, -8F, -8F);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 4, 19);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 14, scale);
		Shape8.setRotationPoint(7F, -8F, -7F);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 4, 19);
		Shape9.addBox(0F, 0F, 0F, 1, 1, 14, scale);
		Shape9.setRotationPoint(-8F, -8F, -7F);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 34);
		Shape10.addBox(0F, 0F, 0F, 12, 1, 12, scale);
		Shape10.setRotationPoint(-6F, 6F, -6F);
		Shape10.setTextureSize(64, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
	}

	public void render(float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(null, /* entity, */f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
	}

	public void renderNoRot(float f5) {
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

	public void render(GemBoxTileEntity boxblock, double x, double y, double z) {

		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslated(x, y, z);
		ForgeHooksClient.bindTexture(ClientProxy.GEMBOX_PNG, 0);

		renderNoRot(scale);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	public void render(float scale) {

		renderNoRot(scale);

	}

}
