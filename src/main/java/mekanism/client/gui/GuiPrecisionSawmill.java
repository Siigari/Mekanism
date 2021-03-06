package mekanism.client.gui;

import mekanism.client.gui.GuiProgress.ProgressBar;
import mekanism.common.tile.TileEntityChanceMachine;

import net.minecraft.entity.player.InventoryPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiPrecisionSawmill extends GuiChanceMachine
{
	public GuiPrecisionSawmill(InventoryPlayer inventory, TileEntityChanceMachine tentity)
	{
		super(inventory, tentity);
	}
	
	@Override
	public ProgressBar getProgressType()
	{
		return ProgressBar.PURPLE;
	}
}
