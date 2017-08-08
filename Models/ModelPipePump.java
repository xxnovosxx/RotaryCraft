/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 10/06/2014 3:43:55 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelPipePump extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape3f;
	LODModelPart Shape3g;
	LODModelPart Shape4;
	LODModelPart Shape4b;

	public ModelPipePump()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 18, 1, 14);
		Shape1.setRotationPoint(-9F, 22F, -7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 19);
		Shape1a.addBox(0F, 0F, 0F, 18, 1, 14);
		Shape1a.setRotationPoint(-9F, 9F, -7F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 70, 19);
		Shape2.addBox(0F, 0F, 0F, 18, 12, 1);
		Shape2.setRotationPoint(-9F, 10F, 6F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 70, 0);
		Shape2a.addBox(0F, 0F, 0F, 18, 12, 1);
		Shape2a.setRotationPoint(-9F, 10F, -7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 35);
		Shape3.addBox(0.4F, 0F, -0.25F, 2, 1, 1);
		Shape3.setRotationPoint(-9F, 8F, 5F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, -0.5235988F, 0F);
		Shape3a = new LODModelPart(this, 0, 38);
		Shape3a.addBox(0.4F, 0F, -0.25F, 20, 1, 1);
		Shape3a.setRotationPoint(-9F, 8F, -4F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, -0.5235988F, 0F);
		Shape3b = new LODModelPart(this, 43, 38);
		Shape3b.addBox(0.4F, 0F, -0.25F, 14, 1, 1);
		Shape3b.setRotationPoint(-9F, 8F, -1F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, -0.5235988F, 0F);
		Shape3c = new LODModelPart(this, 74, 38);
		Shape3c.addBox(0.4F, 0F, -0.25F, 8, 1, 1);
		Shape3c.setRotationPoint(-9F, 8F, 2F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, -0.5235988F, 0F);
		Shape3d = new LODModelPart(this, 7, 35);
		Shape3d.addBox(18.4F, 0F, -0.25F, 2, 1, 1);
		Shape3d.setRotationPoint(-9F, 8F, -16F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, -0.5235988F, 0F);
		Shape3e = new LODModelPart(this, 64, 35);
		Shape3e.addBox(0.4F, 0F, -0.25F, 20, 1, 1);
		Shape3e.setRotationPoint(-9F, 8F, -7F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, -0.5235988F, 0F);
		Shape3f = new LODModelPart(this, 33, 35);
		Shape3f.addBox(6.4F, 0F, -0.25F, 14, 1, 1);
		Shape3f.setRotationPoint(-9F, 8F, -10F);
		Shape3f.setTextureSize(128, 128);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, -0.5235988F, 0F);
		Shape3g = new LODModelPart(this, 14, 35);
		Shape3g.addBox(12.4F, 0F, -0.25F, 8, 1, 1);
		Shape3g.setRotationPoint(-9F, 8F, -13F);
		Shape3g.setTextureSize(128, 128);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, -0.5235988F, 0F);
		Shape4 = new LODModelPart(this, 28, 41);
		Shape4.addBox(0F, 0F, 0F, 1, 12, 12);
		Shape4.setRotationPoint(-9F, 10F, -6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 41);
		Shape4b.addBox(0F, 0F, 0F, 1, 12, 12);
		Shape4b.setRotationPoint(8F, 10F, -6F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape4.render(te, f5);
		Shape4b.render(te, f5);

		for (int i = 0; i < 360; i += 90) {
			GL11.glTranslated(0, 1, 0);
			GL11.glRotated(i, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);
			Shape3.render(te, f5);
			Shape3a.render(te, f5);
			Shape3b.render(te, f5);
			Shape3c.render(te, f5);
			Shape3d.render(te, f5);
			Shape3e.render(te, f5);
			Shape3f.render(te, f5);
			Shape3g.render(te, f5);
			GL11.glTranslated(0, 1, 0);
			GL11.glRotated(-i, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);
		}
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
