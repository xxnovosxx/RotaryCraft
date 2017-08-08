/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Items.Tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Reika.RotaryCraft.Base.ItemRotaryTool;

public class ItemCalculator extends ItemRotaryTool {

	public ItemCalculator(int tex) {
		super(tex);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer ep)
	{
		//ModLoader.openGUI(ep, new GuiCalculator(ep, world));
		return is;
	}
}
