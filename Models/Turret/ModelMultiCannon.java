/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 24/12/2016 9:14:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Turret;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelMultiCannon extends RotaryModelBase
{
	//fields
	LODModelPart Shape10;
	LODModelPart Shape3;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape7b;
	LODModelPart Shape7c;
	LODModelPart Shape7d;
	LODModelPart Shape7e;
	LODModelPart Shape7f;
	LODModelPart Shape7g;
	LODModelPart Shape8;
	LODModelPart Shape8a;
	LODModelPart Shape9;
	LODModelPart Shape3d;
	LODModelPart Shape1a;
	LODModelPart Shape10a;
	LODModelPart Shape10b;
	LODModelPart Shape10c;
	LODModelPart Shape1a0;
	LODModelPart Shape1a1;
	LODModelPart Shape1a2;
	LODModelPart Shape1a3;
	LODModelPart Shape1a4;
	LODModelPart Shape10d;
	LODModelPart Shape10e;
	LODModelPart Shape10f;
	LODModelPart Shape10g;
	LODModelPart Shape10h;
	LODModelPart Shape10i;
	LODModelPart Shape10j;
	LODModelPart Shape10k;

	public ModelMultiCannon()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape10 = new LODModelPart(this, 32, 64);
		Shape10.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10.setRotationPoint(0F, 11.5F, 6F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0.3926991F);
		Shape3 = new LODModelPart(this, 0, 57);
		Shape3.addBox(-4F, -2.5F, 2F, 8, 5, 1);
		Shape3.setRotationPoint(0F, 11.5F, 6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 16);
		Shape5.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape5.setRotationPoint(-8F, 23F, -8F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 34);
		Shape6.addBox(-5F, 0F, -5F, 10, 2, 10);
		Shape6.setRotationPoint(0F, 20F, 0F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 0, 0);
		Shape7.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7.setRotationPoint(0F, 22F, 0F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0.7853982F, 0F);
		Shape7a = new LODModelPart(this, 0, 0);
		Shape7a.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7a.setRotationPoint(0F, 22F, 0F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0.3926991F, 0F);
		Shape7b = new LODModelPart(this, 0, 0);
		Shape7b.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7b.setRotationPoint(0F, 22F, 0F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 1.178097F, 0F);
		Shape7c = new LODModelPart(this, 0, 0);
		Shape7c.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7c.setRotationPoint(0F, 22F, 0F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0.1963495F, 0F);
		Shape7d = new LODModelPart(this, 0, 0);
		Shape7d.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7d.setRotationPoint(0F, 22F, 0F);
		Shape7d.setTextureSize(128, 128);
		Shape7d.mirror = true;
		this.setRotation(Shape7d, 0F, -0.1963495F, 0F);
		Shape7e = new LODModelPart(this, 0, 0);
		Shape7e.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7e.setRotationPoint(0F, 22F, 0F);
		Shape7e.setTextureSize(128, 128);
		Shape7e.mirror = true;
		this.setRotation(Shape7e, 0F, 0.9817477F, 0F);
		Shape7f = new LODModelPart(this, 0, 0);
		Shape7f.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7f.setRotationPoint(0F, 22F, 0F);
		Shape7f.setTextureSize(128, 128);
		Shape7f.mirror = true;
		this.setRotation(Shape7f, 0F, 0.5890486F, 0F);
		Shape7g = new LODModelPart(this, 0, 0);
		Shape7g.addBox(-6F, 0F, -6F, 12, 1, 12);
		Shape7g.setRotationPoint(0F, 22F, 0F);
		Shape7g.setTextureSize(128, 128);
		Shape7g.mirror = true;
		this.setRotation(Shape7g, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 0, 98);
		Shape8.addBox(-4F, 0F, 0F, 2, 1, 9);
		Shape8.setRotationPoint(0F, 20F, 0F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0.7853982F, 0F, 0F);
		Shape8a = new LODModelPart(this, 0, 98);
		Shape8a.addBox(2F, 0F, 0F, 2, 1, 9);
		Shape8a.setRotationPoint(0F, 20F, 0F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0.7853982F, 0F, 0F);
		Shape9 = new LODModelPart(this, 0, 109);
		Shape9.addBox(-2F, 0F, 0F, 4, 1, 7);
		Shape9.setRotationPoint(0F, 21F, 4F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 1.186824F, 0F, 0F);
		Shape3d = new LODModelPart(this, 0, 47);
		Shape3d.addBox(-5F, -3.5F, 0F, 10, 7, 2);
		Shape3d.setRotationPoint(0F, 11.5F, 6F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 64);
		Shape1a.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a.setRotationPoint(0F, 11.5F, 6F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, -2.094395F);
		Shape10a = new LODModelPart(this, 32, 64);
		Shape10a.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10a.setRotationPoint(0F, 11.5F, 6F);
		Shape10a.setTextureSize(128, 128);
		Shape10a.mirror = true;
		this.setRotation(Shape10a, 0F, 0F, 1.178097F);
		Shape10b = new LODModelPart(this, 32, 72);
		Shape10b.addBox(-2.5F, -2.5F, -1F, 5, 5, 1);
		Shape10b.setRotationPoint(0F, 11.5F, -5F);
		Shape10b.setTextureSize(128, 128);
		Shape10b.mirror = true;
		this.setRotation(Shape10b, 0F, 0F, 1.178097F);
		Shape10c = new LODModelPart(this, 32, 64);
		Shape10c.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10c.setRotationPoint(0F, 11.5F, 2F);
		Shape10c.setTextureSize(128, 128);
		Shape10c.mirror = true;
		this.setRotation(Shape10c, 0F, 0F, 1.178097F);
		Shape1a0 = new LODModelPart(this, 0, 64);
		Shape1a0.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a0.setRotationPoint(0F, 11.5F, 6F);
		Shape1a0.setTextureSize(128, 128);
		Shape1a0.mirror = true;
		this.setRotation(Shape1a0, 0F, 0F, 0F);
		Shape1a1 = new LODModelPart(this, 0, 64);
		Shape1a1.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a1.setRotationPoint(0F, 11.5F, 6F);
		Shape1a1.setTextureSize(128, 128);
		Shape1a1.mirror = true;
		this.setRotation(Shape1a1, 0F, 0F, 1.047198F);
		Shape1a2 = new LODModelPart(this, 0, 64);
		Shape1a2.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a2.setRotationPoint(0F, 11.5F, 6F);
		Shape1a2.setTextureSize(128, 128);
		Shape1a2.mirror = true;
		this.setRotation(Shape1a2, 0F, 0F, 2.094395F);
		Shape1a3 = new LODModelPart(this, 0, 64);
		Shape1a3.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a3.setRotationPoint(0F, 11.5F, 6F);
		Shape1a3.setTextureSize(128, 128);
		Shape1a3.mirror = true;
		this.setRotation(Shape1a3, 0F, 0F, 3.141593F);
		Shape1a4 = new LODModelPart(this, 0, 64);
		Shape1a4.addBox(-0.5F, -3F, -14F, 1, 1, 13);
		Shape1a4.setRotationPoint(0F, 11.5F, 6F);
		Shape1a4.setTextureSize(128, 128);
		Shape1a4.mirror = true;
		this.setRotation(Shape1a4, 0F, 0F, -1.047198F);
		Shape10d = new LODModelPart(this, 32, 64);
		Shape10d.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10d.setRotationPoint(0F, 11.5F, 6F);
		Shape10d.setTextureSize(128, 128);
		Shape10d.mirror = true;
		this.setRotation(Shape10d, 0F, 0F, 0.7853982F);
		Shape10e = new LODModelPart(this, 32, 72);
		Shape10e.addBox(-2.5F, -2.5F, -1F, 5, 5, 1);
		Shape10e.setRotationPoint(0F, 11.5F, -5F);
		Shape10e.setTextureSize(128, 128);
		Shape10e.mirror = true;
		this.setRotation(Shape10e, 0F, 0F, 0.7853982F);
		Shape10f = new LODModelPart(this, 32, 72);
		Shape10f.addBox(-2.5F, -2.5F, -1F, 5, 5, 1);
		Shape10f.setRotationPoint(0F, 11.5F, -5F);
		Shape10f.setTextureSize(128, 128);
		Shape10f.mirror = true;
		this.setRotation(Shape10f, 0F, 0F, 0F);
		Shape10g = new LODModelPart(this, 32, 72);
		Shape10g.addBox(-2.5F, -2.5F, -1F, 5, 5, 1);
		Shape10g.setRotationPoint(0F, 11.5F, -5F);
		Shape10g.setTextureSize(128, 128);
		Shape10g.mirror = true;
		this.setRotation(Shape10g, 0F, 0F, 0.3926991F);
		Shape10h = new LODModelPart(this, 32, 64);
		Shape10h.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10h.setRotationPoint(0F, 11.5F, 6F);
		Shape10h.setTextureSize(128, 128);
		Shape10h.mirror = true;
		this.setRotation(Shape10h, 0F, 0F, 0F);
		Shape10i = new LODModelPart(this, 32, 64);
		Shape10i.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10i.setRotationPoint(0F, 11.5F, 2F);
		Shape10i.setTextureSize(128, 128);
		Shape10i.mirror = true;
		this.setRotation(Shape10i, 0F, 0F, 0F);
		Shape10j = new LODModelPart(this, 32, 64);
		Shape10j.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10j.setRotationPoint(0F, 11.5F, 2F);
		Shape10j.setTextureSize(128, 128);
		Shape10j.mirror = true;
		this.setRotation(Shape10j, 0F, 0F, 0.7853982F);
		Shape10k = new LODModelPart(this, 32, 64);
		Shape10k.addBox(-3F, -3F, -1F, 6, 6, 1);
		Shape10k.setRotationPoint(0F, 11.5F, 2F);
		Shape10k.setTextureSize(128, 128);
		Shape10k.mirror = true;
		this.setRotation(Shape10k, 0F, 0F, 0.3926991F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
		Shape5.render(te, f5);

		GL11.glPushMatrix();

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape7b.render(te, f5);
		Shape7c.render(te, f5);
		Shape7d.render(te, f5);
		Shape7e.render(te, f5);
		Shape7f.render(te, f5);
		Shape7g.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(theta, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape3.render(te, f5);
		Shape8.render(te, f5);
		Shape8a.render(te, f5);
		Shape9.render(te, f5);
		Shape3d.render(te, f5);

		double d = 0.725;
		GL11.glTranslated(0, d, 0);
		GL11.glRotated((double)li.get(0), 0, 0, 1);
		GL11.glTranslated(0, -d, 0);

		//barrels
		Shape1a.render(te, f5);
		Shape1a0.render(te, f5);
		Shape1a1.render(te, f5);
		Shape1a2.render(te, f5);
		Shape1a3.render(te, f5);
		Shape1a4.render(te, f5);

		//Rings
		Shape10.render(te, f5);
		Shape10d.render(te, f5);
		Shape10e.render(te, f5);
		Shape10f.render(te, f5);
		Shape10g.render(te, f5);
		Shape10h.render(te, f5);
		Shape10i.render(te, f5);
		Shape10j.render(te, f5);
		Shape10k.render(te, f5);
		Shape10a.render(te, f5);
		Shape10b.render(te, f5);
		Shape10c.render(te, f5);

		GL11.glPopMatrix();
	}

}
