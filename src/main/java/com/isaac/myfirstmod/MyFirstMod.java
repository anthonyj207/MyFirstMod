package com.isaac.myfirstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.isaac.myfirstmod.proxy.CommonProxy;


@Mod(modid=MyFirstMod.MODID, version=MyFirstMod.VERSION)
public class MyFirstMod {
	public static final String MODID="myfirstmod";
	public static final String VERSION="1.0";
	
	@SidedProxy(clientSide="com.isaac.myfirstmod.proxy.ClientProxy", serverSide="com.isaac.myfirstmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("preInit has started...");
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("init has started...");
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("postInit has started...");
		proxy.postInit(event);
	}
	
}
