/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.ModInterface.Lua;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.ModInteract.Lua.LuaMethod;
import Reika.RotaryCraft.TileEntities.Transmission.TileEntityAdvancedGear;
import Reika.RotaryCraft.TileEntities.Transmission.TileEntityAdvancedGear.GearType;
import dan200.computercraft.api.lua.LuaException;

public class LuaSetRatio extends LuaMethod {

	public LuaSetRatio() {
		super("setRatio", TileEntityAdvancedGear.class);
	}

	@Override
	public Object[] invoke(TileEntity te, Object[] args) throws LuaException, InterruptedException {
		TileEntityAdvancedGear adv = (TileEntityAdvancedGear) te;
		if (adv.getGearType() == GearType.CVT) {
			int ratio = ((Double)args[0]).intValue();
			adv.setRatio(ratio);
		}
		return null;
	}

	@Override
	public String getDocumentation() {
		return "Sets the CVT ratio.\nArgs: Ratio\nReturns: Nothing";
	}

	@Override
	public String getArgsAsString() {
		return "int ratio";
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.VOID;
	}

}
