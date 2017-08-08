/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 06/03/2013 11:27:07 PM
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


public class ModelSplitter extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape3;
	LODModelPart Shape12;
	LODModelPart Shape13;
	LODModelPart Shape14;
	LODModelPart Shape15;
	LODModelPart Shape16;
	LODModelPart Shape17;
	LODModelPart Shape18;
	LODModelPart Shape19;
	LODModelPart Shape20;
	LODModelPart Shape21;
	LODModelPart Shape22;
	LODModelPart Shape23;
	LODModelPart Shape2;
	LODModelPart Shape6;
	LODModelPart Shape3a;
	LODModelPart Shape13a;
	LODModelPart Shape17a;
	LODModelPart Shape21a;
	LODModelPart Shape16a;
	LODModelPart Shape20a;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape5;
	LODModelPart Shape12a;

	public ModelSplitter()
	{
		textureWidth = 128;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 48, 1);
		Shape3.addBox(0F, 0F, 0F, 1, 15, 16);
		Shape3.setRotationPoint(7F, 8F, -8F);
		Shape3.setTextureSize(128, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape13 = new LODModelPart(this, 0, 27);
		Shape13.addBox(0F, 0F, 0F, 6, 2, 2);
		Shape13.setRotationPoint(2.5F, 16F, -1.4F);
		Shape13.setTextureSize(128, 32);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.7853982F, 0F, 0F);
		Shape12 = new LODModelPart(this, 0, 27);
		Shape12.addBox(0F, 0F, 0F, 6, 2, 2);
		Shape12.setRotationPoint(2.5F, 15F, -1F);
		Shape12.setTextureSize(128, 32);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape15 = new LODModelPart(this, 0, 24);
		Shape15.addBox(0F, 0F, 0F, 2, 2, 6);
		Shape15.setRotationPoint(0F, 14.5F, -8.5F);
		Shape15.setTextureSize(128, 32);
		Shape15.mirror = true;
		this.setRotation(Shape15, 0F, 0F, 0.7853982F);
		Shape14 = new LODModelPart(this, 0, 24);
		Shape14.addBox(0F, 0F, 0F, 2, 2, 6);
		Shape14.setRotationPoint(-1F, 15F, -8.5F);
		Shape14.setTextureSize(128, 32);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape17 = new LODModelPart(this, 118, 15);
		Shape17.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape17.setRotationPoint(2F, 16F, -2.8F);
		Shape17.setTextureSize(128, 32);
		Shape17.mirror = true;
		this.setRotation(Shape17, 0.7853982F, 0F, 0F);
		Shape16 = new LODModelPart(this, 118, 15);
		Shape16.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape16.setRotationPoint(2F, 14F, -2F);
		Shape16.setTextureSize(128, 32);
		Shape16.mirror = true;
		this.setRotation(Shape16, 0F, 0F, 0F);
		Shape19 = new LODModelPart(this, 83, 26);
		Shape19.addBox(0F, 0F, 0F, 4, 4, 1);
		Shape19.setRotationPoint(0F, 13.2F, -3F);
		Shape19.setTextureSize(128, 32);
		Shape19.mirror = true;
		this.setRotation(Shape19, 0F, 0F, 0.7853982F);
		Shape18 = new LODModelPart(this, 83, 26);
		Shape18.addBox(0F, 0F, 0F, 4, 4, 1);
		Shape18.setRotationPoint(-2F, 14F, -3F);
		Shape18.setTextureSize(128, 32);
		Shape18.mirror = true;
		this.setRotation(Shape18, 0F, 0F, 0F);
		Shape21 = new LODModelPart(this, 107, 19);
		Shape21.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape21.setRotationPoint(3F, 16F, -4.2F);
		Shape21.setTextureSize(128, 32);
		Shape21.mirror = true;
		this.setRotation(Shape21, 0.7853982F, 0F, 0F);
		Shape20 = new LODModelPart(this, 107, 19);
		Shape20.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape20.setRotationPoint(3F, 13F, -3F);
		Shape20.setTextureSize(128, 32);
		Shape20.mirror = true;
		this.setRotation(Shape20, 0F, 0F, 0F);
		Shape23 = new LODModelPart(this, 83, 17);
		Shape23.addBox(0F, 0F, 0F, 6, 6, 1);
		Shape23.setRotationPoint(0F, 11.7F, -4F);
		Shape23.setTextureSize(128, 32);
		Shape23.mirror = true;
		this.setRotation(Shape23, 0F, 0F, 0.7853982F);
		Shape22 = new LODModelPart(this, 83, 17);
		Shape22.addBox(0F, 0F, 0F, 6, 6, 1);
		Shape22.setRotationPoint(-3F, 13F, -4F);
		Shape22.setTextureSize(128, 32);
		Shape22.mirror = true;
		this.setRotation(Shape22, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 68, 0);
		Shape2.addBox(0F, 0F, 0F, 14, 15, 1);
		Shape2.setRotationPoint(-7F, 8F, -8F);
		Shape2.setTextureSize(128, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 20);
		Shape6.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape6.setRotationPoint(-7F, 8F, 7F);
		Shape6.setTextureSize(128, 32);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 48, 1);
		Shape3a.addBox(0F, 0F, 0F, 1, 15, 16);
		Shape3a.setRotationPoint(-8F, 8F, -8F);
		Shape3a.setTextureSize(128, 32);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape13a = new LODModelPart(this, 0, 27);
		Shape13a.addBox(0F, 0F, 0F, 6, 2, 2);
		Shape13a.setRotationPoint(-8.5F, 16F, -1.4F);
		Shape13a.setTextureSize(128, 32);
		Shape13a.mirror = true;
		this.setRotation(Shape13a, 0.7853982F, 0F, 0F);
		Shape17a = new LODModelPart(this, 96, 23);
		Shape17a.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape17a.setRotationPoint(-3F, 16F, -2.8F);
		Shape17a.setTextureSize(128, 32);
		Shape17a.mirror = true;
		this.setRotation(Shape17a, 0.7853982F, 0F, 0F);
		Shape21a = new LODModelPart(this, 101, 0);
		Shape21a.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape21a.setRotationPoint(-4F, 16F, -4.2F);
		Shape21a.setTextureSize(128, 32);
		Shape21a.mirror = true;
		this.setRotation(Shape21a, 0.7853982F, 0F, 0F);
		Shape16a = new LODModelPart(this, 96, 23);
		Shape16a.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape16a.setRotationPoint(-3F, 14F, -2F);
		Shape16a.setTextureSize(128, 32);
		Shape16a.mirror = true;
		this.setRotation(Shape16a, 0F, 0F, 0F);
		Shape20a = new LODModelPart(this, 101, 0);
		Shape20a.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape20a.setRotationPoint(-4F, 13F, -3F);
		Shape20a.setTextureSize(128, 32);
		Shape20a.mirror = true;
		this.setRotation(Shape20a, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 118, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 9, 4);
		Shape4.setRotationPoint(-6F, 14F, -2F);
		Shape4.setTextureSize(128, 32);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 118, 0);
		Shape4a.addBox(0F, 0F, 0F, 1, 9, 4);
		Shape4a.setRotationPoint(5F, 14F, -2F);
		Shape4a.setTextureSize(128, 32);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 18, 26);
		Shape5.addBox(0F, 0F, 0F, 10, 1, 4);
		Shape5.setRotationPoint(-5F, 22F, -2F);
		Shape5.setTextureSize(128, 32);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape12a = new LODModelPart(this, 0, 27);
		Shape12a.addBox(0F, 0F, 0F, 6, 2, 2);
		Shape12a.setRotationPoint(-8.5F, 15F, -1F);
		Shape12a.setTextureSize(128, 32);
		Shape12a.mirror = true;
		this.setRotation(Shape12a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		boolean fail = (Boolean)li.get(0);
		Shape3a.render(te, f5);
		Shape2.render(te, f5);
		Shape5.render(te, f5);
		Shape4a.render(te, f5);
		Shape4.render(te, f5);
		Shape1.render(te, f5);
		Shape3.render(te, f5);
		Shape6.render(te, f5);

		if (!fail) {
			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);
			Shape17.render(te, f5);
			Shape20.render(te, f5);
			Shape13.render(te, f5);
			Shape12.render(te, f5);
			Shape21.render(te, f5);
			Shape16.render(te, f5);
			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);

			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(-phi, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);
			Shape12a.render(te, f5);
			Shape20a.render(te, f5);
			Shape16a.render(te, f5);
			Shape17a.render(te, f5);
			Shape21a.render(te, f5);
			Shape13a.render(te, f5);
			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(phi, 1, 0, 0);
			GL11.glTranslated(0, -1, 0);

			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(phi, 0, 0, 1);
			GL11.glTranslated(0, -1, 0);
			Shape15.render(te, f5);
			Shape18.render(te, f5);
			Shape19.render(te, f5);
			Shape14.render(te, f5);
			Shape23.render(te, f5);
			Shape22.render(te, f5);
			GL11.glTranslated(0, 1, 0);
			GL11.glRotatef(-phi, 0, 0, 1);
			GL11.glTranslated(0, -1, 0);
		}
	}

}
