/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 26-03-2014 13:45:49
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelHighGear extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape7;
	LODModelPart Shape8;
	LODModelPart Shape9;
	LODModelPart Shape10;
	LODModelPart Shape11;
	LODModelPart Shape24;
	LODModelPart Shape25;
	LODModelPart Shape42;
	LODModelPart Shape43;
	LODModelPart Shape12a;
	LODModelPart Shape12;
	LODModelPart Shape12c;
	LODModelPart Shape12b;
	LODModelPart Shape13;
	LODModelPart Shape13a;
	LODModelPart Shape12d;
	LODModelPart Shape12e;
	LODModelPart Shape12f;
	LODModelPart Shape12g;
	LODModelPart Shape13b;
	LODModelPart Shape13c;

	public ModelHighGear()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 64, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape2.setRotationPoint(7F, 11F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2.mirror = false;
		Shape3 = new LODModelPart(this, 64, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 12, 16);
		Shape3.setRotationPoint(-8F, 11F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3.mirror = false;
		Shape4 = new LODModelPart(this, 0, 17);
		Shape4.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape4.setRotationPoint(-7F, 19F, 7F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4.mirror = false;
		Shape5 = new LODModelPart(this, 0, 17);
		Shape5.addBox(0F, 0F, 0F, 14, 4, 1);
		Shape5.setRotationPoint(-7F, 19F, -8F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5.mirror = false;
		Shape6 = new LODModelPart(this, 30, 17);
		Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape6.setRotationPoint(6F, 16F, 7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6.mirror = false;
		Shape7 = new LODModelPart(this, 30, 17);
		Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape7.setRotationPoint(6F, 16F, -8F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7.mirror = false;
		Shape8 = new LODModelPart(this, 30, 17);
		Shape8.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape8.setRotationPoint(-7F, 16F, 7F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape8.mirror = false;
		Shape9 = new LODModelPart(this, 30, 17);
		Shape9.addBox(0F, 0F, 0F, 1, 3, 1);
		Shape9.setRotationPoint(-7F, 16F, -8F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape9.mirror = false;
		Shape10 = new LODModelPart(this, 42, 17);
		Shape10.addBox(0F, 0F, 0F, 1, 3, 10);
		Shape10.setRotationPoint(7F, 8F, -5F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape10.mirror = false;
		Shape11 = new LODModelPart(this, 42, 17);
		Shape11.addBox(0F, 0F, 0F, 1, 3, 10);
		Shape11.setRotationPoint(-8F, 8F, -5F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11.mirror = false;
		Shape24 = new LODModelPart(this, 0, 27);
		Shape24.addBox(0F, -1F, -1F, 3, 2, 2);
		Shape24.setRotationPoint(5.5F, 16F, 0F);
		Shape24.setTextureSize(128, 128);
		Shape24.mirror = true;
		this.setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new LODModelPart(this, 0, 27);
		Shape25.addBox(0F, -1F, -1F, 3, 2, 2);
		Shape25.setRotationPoint(5.5F, 16F, 0F);
		Shape25.setTextureSize(128, 128);
		Shape25.mirror = true;
		this.setRotation(Shape25, 0.7853982F, 0F, 0.0174533F);
		Shape42 = new LODModelPart(this, 0, 27);
		Shape42.addBox(0F, -1F, -1F, 3, 2, 2);
		Shape42.setRotationPoint(-8.5F, 16F, 0F);
		Shape42.setTextureSize(128, 128);
		Shape42.mirror = true;
		this.setRotation(Shape42, 0F, 0F, 0F);
		Shape43 = new LODModelPart(this, 0, 27);
		Shape43.addBox(0F, -1F, -1F, 3, 2, 2);
		Shape43.setRotationPoint(-8.5F, 16F, 0F);
		Shape43.setTextureSize(128, 128);
		Shape43.mirror = true;
		this.setRotation(Shape43, 0.7853982F, 0F, 0F);
		Shape12a = new LODModelPart(this, 0, 32);
		Shape12a.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12a.setRotationPoint(-6F, 15F, -2F);
		Shape12a.setTextureSize(128, 128);
		Shape12a.mirror = true;
		this.setRotation(Shape12a, 1.178097F, 0F, 0F);
		Shape12 = new LODModelPart(this, 0, 32);
		Shape12.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12.setRotationPoint(-6F, 15F, -2F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12c = new LODModelPart(this, 0, 32);
		Shape12c.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12c.setRotationPoint(-5F, 15F, 2F);
		Shape12c.setTextureSize(128, 128);
		Shape12c.mirror = true;
		this.setRotation(Shape12c, 1.178097F, 0F, 0F);
		Shape12b = new LODModelPart(this, 0, 32);
		Shape12b.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12b.setRotationPoint(-6F, 15F, -2F);
		Shape12b.setTextureSize(128, 128);
		Shape12b.mirror = true;
		this.setRotation(Shape12b, 0.3926991F, 0F, 0F);
		Shape13 = new LODModelPart(this, 20, 32);
		Shape13.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
		Shape13.setRotationPoint(-5F, 15F, -4.5F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0F, 0F, 0F);
		Shape13a = new LODModelPart(this, 20, 32);
		Shape13a.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
		Shape13a.setRotationPoint(-6F, 15F, 4.5F);
		Shape13a.setTextureSize(128, 128);
		Shape13a.mirror = true;
		this.setRotation(Shape13a, 0F, 0F, 0F);
		Shape12d = new LODModelPart(this, 0, 32);
		Shape12d.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12d.setRotationPoint(-6F, 15F, -2F);
		Shape12d.setTextureSize(128, 128);
		Shape12d.mirror = true;
		this.setRotation(Shape12d, 0.7853982F, 0F, 0F);
		Shape12e = new LODModelPart(this, 0, 32);
		Shape12e.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12e.setRotationPoint(-5F, 15F, 2F);
		Shape12e.setTextureSize(128, 128);
		Shape12e.mirror = true;
		this.setRotation(Shape12e, 0.7853982F, 0F, 0F);
		Shape12f = new LODModelPart(this, 0, 32);
		Shape12f.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12f.setRotationPoint(-5F, 15F, 2F);
		Shape12f.setTextureSize(128, 128);
		Shape12f.mirror = true;
		this.setRotation(Shape12f, 0F, 0F, 0F);
		Shape12g = new LODModelPart(this, 0, 32);
		Shape12g.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape12g.setRotationPoint(-5F, 15F, 2F);
		Shape12g.setTextureSize(128, 128);
		Shape12g.mirror = true;
		this.setRotation(Shape12g, 0.3926991F, 0F, 0F);
		Shape13b = new LODModelPart(this, 20, 32);
		Shape13b.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
		Shape13b.setRotationPoint(-6F, 15F, 4.5F);
		Shape13b.setTextureSize(128, 128);
		Shape13b.mirror = true;
		this.setRotation(Shape13b, 0.7853982F, 0F, 0F);
		Shape13c = new LODModelPart(this, 20, 32);
		Shape13c.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
		Shape13c.setRotationPoint(-5F, 15F, -4.5F);
		Shape13c.setTextureSize(128, 128);
		Shape13c.mirror = true;
		this.setRotation(Shape13c, 0.7853982F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		Shape10.render(te, f5);
		Shape11.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape24.render(te, f5);
		Shape25.render(te, f5);
		Shape42.render(te, f5);
		Shape43.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		for (double f = 0; f < 0.75; f += 0.125) {
			GL11.glTranslated(f, 0, 0);

			double d = 0.125;
			GL11.glTranslated(0, 0.9375, d);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, -d);
			Shape12c.render(te, f5);
			Shape12e.render(te, f5);
			Shape12f.render(te, f5);
			Shape12g.render(te, f5);
			GL11.glTranslated(0, 0.9375, d);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, -d);

			GL11.glTranslated(0, 0.9375, -d);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, d);
			Shape12a.render(te, f5);
			Shape12.render(te, f5);
			Shape12b.render(te, f5);
			Shape12d.render(te, f5);
			GL11.glTranslated(0, 0.9375, -d);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, d);

			d = 0.2875;
			GL11.glTranslated(0, 0.9375, -d);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, d);
			Shape13.render(te, f5);
			Shape13c.render(te, f5);
			GL11.glTranslated(0, 0.9375, -d);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, d);

			GL11.glTranslated(0, 0.9375, d);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, -d);
			Shape13a.render(te, f5);
			Shape13b.render(te, f5);
			GL11.glTranslated(0, 0.9375, d);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -0.9375, -d);

			GL11.glTranslated(-f, 0, 0);
		}
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
