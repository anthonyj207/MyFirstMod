package com.isaac.myfirstmod.items;

import com.isaac.myfirstmod.MyFirstMod;
import com.isaac.myfirstmod.Interfaces.IHasModel;
import com.isaac.myfirstmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.Items.add(this);
	}
	
	@Override
	public void registerModels() {
		MyFirstMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
