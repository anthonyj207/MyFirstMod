package com.isaac.myfirstmod.init;

import java.util.ArrayList;
import java.util.List;

import com.isaac.myfirstmod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	//public static Item redIngotItem;
	public static final List<Item> Items = new ArrayList<Item>();
	public static final Item RED_INGOT = new ItemBase("ingot_red");
	public static final Item BLUE_INGOT = new ItemBase("ingot_blue");
	
	//public static void init() {
	//	redIngotItem = new ItemRedIngot("redingot_item");
	//	redIngotItem.setRegistryName(new ResourceLocation(MyFirstMod.MODID, "redingot_item"));
	//	//GameRegistry.register(redIngotItem);
	//}
}
