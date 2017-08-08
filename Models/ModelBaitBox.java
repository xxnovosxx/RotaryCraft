/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 16/03/2013 11:41:11 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelBaitBox extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape5;
	LODModelPart Shape7;
	LODModelPart Shape4;
	LODModelPart Shape6;
	LODModelPart Shape8;
	LODModelPart Shape9;
	LODModelPart Shape8a;
	LODModelPart Shape6a;
	LODModelPart Shape1a;
	LODModelPart Shape2a;
	LODModelPart Shape3a;
	LODModelPart Shape4a;
	LODModelPart Shape7a;
	LODModelPart Shape5a;
	LODModelPart Shape9a;
	LODModelPart Shape9b;
	LODModelPart Shape9c;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape2g;
	LODModelPart Shape2h;
	LODModelPart Shape2i;
	LODModelPart Shape6b;
	LODModelPart Shape6c;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape6f;
	LODModelPart Shape6g;
	LODModelPart Shape6h;
	LODModelPart Shape6i;
	LODModelPart Shape10;
	LODModelPart Shape11;
	LODModelPart Shape11a;
	LODModelPart Shape12;
	LODModelPart Shape12a;
	LODModelPart Shape13;
	LODModelPart Shape13a;
	LODModelPart Shape13b;
	LODModelPart Shape13c;

	public ModelBaitBox()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 34, 9);
		Shape1.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape1.setRotationPoint(-7F, 8F, 7F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 34, 9);
		Shape2.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2.setRotationPoint(-7F, 8F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 34, 9);
		Shape3.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape3.setRotationPoint(-7F, 8F, -5F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 34, 9);
		Shape5.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape5.setRotationPoint(-7F, 8F, 4F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 34, 9);
		Shape7.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape7.setRotationPoint(-7F, 8F, 1F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 34, 9);
		Shape4.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape4.setRotationPoint(-7F, 8F, -2F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 22);
		Shape6.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape6.setRotationPoint(7F, 8F, -8F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape8 = new LODModelPart(this, 0, 22);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape8.setRotationPoint(-8F, 8F, -8F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new LODModelPart(this, 111, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape9.setRotationPoint(7F, 9F, 7F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0F, 0F);
		Shape8a = new LODModelPart(this, 0, 22);
		Shape8a.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape8a.setRotationPoint(-8F, 23F, -8F);
		Shape8a.setTextureSize(128, 128);
		Shape8a.mirror = true;
		this.setRotation(Shape8a, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 0);
		Shape6a.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6a.setRotationPoint(-8F, 17F, -7F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 34, 9);
		Shape1a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape1a.setRotationPoint(-7F, 23F, 7F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 34, 9);
		Shape2a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2a.setRotationPoint(-7F, 11F, 7F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 34, 9);
		Shape3a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape3a.setRotationPoint(-7F, 23F, -5F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 34, 9);
		Shape4a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape4a.setRotationPoint(-7F, 23F, -2F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 34, 9);
		Shape7a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape7a.setRotationPoint(-7F, 23F, 1F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 34, 9);
		Shape5a.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape5a.setRotationPoint(-7F, 23F, 4F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape9a = new LODModelPart(this, 111, 0);
		Shape9a.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape9a.setRotationPoint(-8F, 9F, 7F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape9b = new LODModelPart(this, 111, 0);
		Shape9b.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape9b.setRotationPoint(7F, 9F, -8F);
		Shape9b.setTextureSize(128, 128);
		Shape9b.mirror = true;
		this.setRotation(Shape9b, 0F, 0F, 0F);
		Shape9c = new LODModelPart(this, 111, 0);
		Shape9c.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape9c.setRotationPoint(-8F, 9F, -8F);
		Shape9c.setTextureSize(128, 128);
		Shape9c.mirror = true;
		this.setRotation(Shape9c, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 34, 9);
		Shape2b.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2b.setRotationPoint(-7F, 23F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 34, 9);
		Shape2c.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2c.setRotationPoint(-7F, 20F, 7F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new LODModelPart(this, 34, 9);
		Shape2d.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2d.setRotationPoint(-7F, 17F, 7F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape2e = new LODModelPart(this, 34, 9);
		Shape2e.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2e.setRotationPoint(-7F, 14F, 7F);
		Shape2e.setTextureSize(128, 128);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
		Shape2f = new LODModelPart(this, 34, 9);
		Shape2f.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2f.setRotationPoint(-7F, 11F, -8F);
		Shape2f.setTextureSize(128, 128);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 0F);
		Shape2g = new LODModelPart(this, 34, 9);
		Shape2g.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2g.setRotationPoint(-7F, 14F, -8F);
		Shape2g.setTextureSize(128, 128);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, 0F);
		Shape2h = new LODModelPart(this, 34, 9);
		Shape2h.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2h.setRotationPoint(-7F, 17F, -8F);
		Shape2h.setTextureSize(128, 128);
		Shape2h.mirror = true;
		this.setRotation(Shape2h, 0F, 0F, 0F);
		Shape2i = new LODModelPart(this, 34, 9);
		Shape2i.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape2i.setRotationPoint(-7F, 20F, -8F);
		Shape2i.setTextureSize(128, 128);
		Shape2i.mirror = true;
		this.setRotation(Shape2i, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 0, 22);
		Shape6b.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape6b.setRotationPoint(7F, 23F, -8F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new LODModelPart(this, 0, 0);
		Shape6c.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6c.setRotationPoint(-8F, 20F, -7F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape6d = new LODModelPart(this, 0, 0);
		Shape6d.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6d.setRotationPoint(-8F, 11F, -7F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, 0F);
		Shape6e = new LODModelPart(this, 0, 0);
		Shape6e.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6e.setRotationPoint(-8F, 14F, -7F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, 0F);
		Shape6f = new LODModelPart(this, 0, 0);
		Shape6f.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6f.setRotationPoint(7F, 11F, -7F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape6g = new LODModelPart(this, 0, 0);
		Shape6g.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6g.setRotationPoint(7F, 14F, -7F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0F);
		Shape6h = new LODModelPart(this, 0, 0);
		Shape6h.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6h.setRotationPoint(7F, 17F, -7F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0F);
		Shape6i = new LODModelPart(this, 0, 0);
		Shape6i.addBox(0F, 0F, 0F, 1, 1, 14);
		Shape6i.setRotationPoint(7F, 20F, -7F);
		Shape6i.setTextureSize(128, 128);
		Shape6i.mirror = true;
		this.setRotation(Shape6i, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 34, 0);
		Shape10.addBox(0F, 0F, 0F, 8, 1, 8);
		Shape10.setRotationPoint(-4F, 16F, -4F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new LODModelPart(this, 85, 0);
		Shape11.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape11.setRotationPoint(-5F, 15F, 4F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape11a = new LODModelPart(this, 85, 0);
		Shape11a.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape11a.setRotationPoint(-5F, 15F, -5F);
		Shape11a.setTextureSize(128, 128);
		Shape11a.mirror = true;
		this.setRotation(Shape11a, 0F, 0F, 0F);
		Shape12 = new LODModelPart(this, 67, 0);
		Shape12.addBox(0F, 0F, 0F, 1, 1, 8);
		Shape12.setRotationPoint(-5F, 15F, -4F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12a = new LODModelPart(this, 67, 0);
		Shape12a.addBox(0F, 0F, 0F, 1, 1, 8);
		Shape12a.setRotationPoint(4F, 15F, -4F);
		Shape12a.setTextureSize(128, 128);
		Shape12a.mirror = true;
		this.setRotation(Shape12a, 0F, 0F, 0F);
		Shape13 = new LODModelPart(this, 0, 17);
		Shape13.addBox(-0.5F, -0.5F, 0F, 1, 1, 4);
		Shape13.setRotationPoint(-4.2F, 15.5F, -4.2F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.2443461F, -2.356194F, 0F);
		Shape13.mirror = false;
		Shape13a = new LODModelPart(this, 0, 17);
		Shape13a.addBox(-0.5F, -0.5F, 0F, 1, 1, 4);
		Shape13a.setRotationPoint(4.2F, 15.5F, -4.2F);
		Shape13a.setTextureSize(128, 128);
		Shape13a.mirror = true;
		this.setRotation(Shape13a, 0.2443461F, 2.356194F, 0F);
		Shape13b = new LODModelPart(this, 0, 17);
		Shape13b.addBox(-0.5F, -0.5F, 0F, 1, 1, 4);
		Shape13b.setRotationPoint(4.2F, 15.5F, 4.2F);
		Shape13b.setTextureSize(128, 128);
		Shape13b.mirror = true;
		this.setRotation(Shape13b, 0.2443461F, 0.7853982F, 0F);
		Shape13c = new LODModelPart(this, 0, 17);
		Shape13c.addBox(-0.5F, -0.5F, 0F, 1, 1, 4);
		Shape13c.setRotationPoint(-4.2F, 15.5F, 4.2F);
		Shape13c.setTextureSize(128, 128);
		Shape13c.mirror = true;
		this.setRotation(Shape13c, 0.2443461F, -0.7853982F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape5.render(te, f5);
		Shape7.render(te, f5);
		Shape4.render(te, f5);
		Shape6.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		Shape8a.render(te, f5);
		Shape6a.render(te, f5);
		Shape1a.render(te, f5);
		Shape2a.render(te, f5);
		Shape3a.render(te, f5);
		Shape4a.render(te, f5);
		Shape7a.render(te, f5);
		Shape5a.render(te, f5);
		Shape9a.render(te, f5);
		Shape9b.render(te, f5);
		Shape9c.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape2g.render(te, f5);
		Shape2h.render(te, f5);
		Shape2i.render(te, f5);
		Shape6b.render(te, f5);
		Shape6c.render(te, f5);
		Shape6d.render(te, f5);
		Shape6e.render(te, f5);
		Shape6f.render(te, f5);
		Shape6g.render(te, f5);
		Shape6h.render(te, f5);
		Shape6i.render(te, f5);
		Shape10.render(te, f5);
		Shape11.render(te, f5);
		Shape11a.render(te, f5);
		Shape12.render(te, f5);
		Shape12a.render(te, f5);
		Shape13.render(te, f5);
		Shape13a.render(te, f5);
		Shape13b.render(te, f5);
		Shape13c.render(te, f5);
	}

}
