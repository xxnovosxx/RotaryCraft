/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 03/03/2013 1:10:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelVacuum extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape5g;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape6c;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape6f;
	LODModelPart Shape6g;
	LODModelPart Shape6h;
	LODModelPart Shape6i;
	LODModelPart Shape6j;
	LODModelPart Shape6k;
	LODModelPart Shape6l;
	LODModelPart Shape6m;
	LODModelPart Shape6n;
	LODModelPart Shape6o;
	LODModelPart Shape6p;

	public ModelVacuum()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 36, 0);
		Shape1.addBox(0F, 0F, 0F, 12, 12, 12);
		Shape1.setRotationPoint(-6F, 10F, -6F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 2, 2, 16);
		Shape2.setRotationPoint(-8F, 22F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 0);
		Shape2a.addBox(0F, 0F, 0F, 2, 2, 16);
		Shape2a.setRotationPoint(-8F, 8F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 0);
		Shape2b.addBox(0F, 0F, 0F, 2, 2, 16);
		Shape2b.setRotationPoint(6F, 8F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 0);
		Shape2c.addBox(0F, 0F, 0F, 2, 2, 16);
		Shape2c.setRotationPoint(6F, 22F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 84, 0);
		Shape3.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape3.setRotationPoint(-6F, 22F, 6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 84, 0);
		Shape3a.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape3a.setRotationPoint(-6F, 8F, 6F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 84, 0);
		Shape3b.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape3b.setRotationPoint(-6F, 22F, -8F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 84, 0);
		Shape3c.addBox(0F, 0F, 0F, 12, 2, 2);
		Shape3c.setRotationPoint(-6F, 8F, -8F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 45);
		Shape4.addBox(0F, 0F, 0F, 2, 12, 2);
		Shape4.setRotationPoint(-8F, 10F, 6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 45);
		Shape4a.addBox(0F, 0F, 0F, 2, 12, 2);
		Shape4a.setRotationPoint(6F, 10F, 6F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 0, 45);
		Shape4b.addBox(0F, 0F, 0F, 2, 12, 2);
		Shape4b.setRotationPoint(6F, 10F, -8F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 0, 45);
		Shape4c.addBox(0F, 0F, 0F, 2, 12, 2);
		Shape4c.setRotationPoint(-8F, 10F, -8F);
		Shape4c.setTextureSize(128, 128);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 29);
		Shape5.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape5.setRotationPoint(-6F, 22F, 5F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 0, 18);
		Shape5a.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape5a.setRotationPoint(5F, 22F, -5F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new LODModelPart(this, 0, 29);
		Shape5b.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape5b.setRotationPoint(-6F, 22F, -6F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5d = new LODModelPart(this, 0, 18);
		Shape5d.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape5d.setRotationPoint(-6F, 9F, -5F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape5e = new LODModelPart(this, 0, 29);
		Shape5e.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape5e.setRotationPoint(-6F, 9F, 5F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 0F);
		Shape5f = new LODModelPart(this, 0, 29);
		Shape5f.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape5f.setRotationPoint(-6F, 9F, -6F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 0F);
		Shape5g = new LODModelPart(this, 0, 18);
		Shape5g.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape5g.setRotationPoint(5F, 9F, -5F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 32);
		Shape6.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape6.setRotationPoint(-5F, 21F, -7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 27, 18);
		Shape6a.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6a.setRotationPoint(5F, 10F, 6F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 27, 18);
		Shape6b.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6b.setRotationPoint(-6F, 10F, 6F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new LODModelPart(this, 0, 32);
		Shape6c.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape6c.setRotationPoint(-5F, 10F, 6F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape6d = new LODModelPart(this, 27, 18);
		Shape6d.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6d.setRotationPoint(-6F, 10F, -7F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, 0F);
		Shape6e = new LODModelPart(this, 0, 32);
		Shape6e.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape6e.setRotationPoint(-5F, 21F, 6F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, 0F);
		Shape6f = new LODModelPart(this, 0, 32);
		Shape6f.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape6f.setRotationPoint(-5F, 10F, -7F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape6g = new LODModelPart(this, 27, 18);
		Shape6g.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6g.setRotationPoint(-7F, 10F, 5F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0F);
		Shape6h = new LODModelPart(this, 27, 18);
		Shape6h.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6h.setRotationPoint(5F, 10F, -7F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0F);
		Shape6i = new LODModelPart(this, 0, 34);
		Shape6i.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape6i.setRotationPoint(6F, 21F, -5F);
		Shape6i.setTextureSize(128, 128);
		Shape6i.mirror = true;
		this.setRotation(Shape6i, 0F, 0F, 0F);
		Shape6j = new LODModelPart(this, 27, 18);
		Shape6j.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6j.setRotationPoint(-7F, 10F, -6F);
		Shape6j.setTextureSize(128, 128);
		Shape6j.mirror = true;
		this.setRotation(Shape6j, 0F, 0F, 0F);
		Shape6k = new LODModelPart(this, 0, 34);
		Shape6k.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape6k.setRotationPoint(-7F, 10F, -5F);
		Shape6k.setTextureSize(128, 128);
		Shape6k.mirror = true;
		this.setRotation(Shape6k, 0F, 0F, 0F);
		Shape6l = new LODModelPart(this, 0, 34);
		Shape6l.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape6l.setRotationPoint(6F, 10F, -5F);
		Shape6l.setTextureSize(128, 128);
		Shape6l.mirror = true;
		this.setRotation(Shape6l, 0F, 0F, 0F);
		Shape6m = new LODModelPart(this, 27, 18);
		Shape6m.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6m.setRotationPoint(6F, 10F, -6F);
		Shape6m.setTextureSize(128, 128);
		Shape6m.mirror = true;
		this.setRotation(Shape6m, 0F, 0F, 0F);
		Shape6n = new LODModelPart(this, 0, 18);
		Shape6n.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape6n.setRotationPoint(-6F, 22F, -5F);
		Shape6n.setTextureSize(128, 128);
		Shape6n.mirror = true;
		this.setRotation(Shape6n, 0F, 0F, 0F);
		Shape6o = new LODModelPart(this, 27, 18);
		Shape6o.addBox(0F, 0F, 0F, 1, 12, 1);
		Shape6o.setRotationPoint(6F, 10F, 5F);
		Shape6o.setTextureSize(128, 128);
		Shape6o.mirror = true;
		this.setRotation(Shape6o, 0F, 0F, 0F);
		Shape6p = new LODModelPart(this, 0, 34);
		Shape6p.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape6p.setRotationPoint(-7F, 21F, -5F);
		Shape6p.setTextureSize(128, 128);
		Shape6p.mirror = true;
		this.setRotation(Shape6p, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape5b.render(te, f5);
		Shape5d.render(te, f5);
		Shape5e.render(te, f5);
		Shape5f.render(te, f5);
		Shape5g.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape6b.render(te, f5);
		Shape6c.render(te, f5);
		Shape6d.render(te, f5);
		Shape6e.render(te, f5);
		Shape6f.render(te, f5);
		Shape6g.render(te, f5);
		Shape6h.render(te, f5);
		Shape6i.render(te, f5);
		Shape6j.render(te, f5);
		Shape6k.render(te, f5);
		Shape6l.render(te, f5);
		Shape6m.render(te, f5);
		Shape6n.render(te, f5);
		Shape6o.render(te, f5);
		Shape6p.render(te, f5);
	}
}
