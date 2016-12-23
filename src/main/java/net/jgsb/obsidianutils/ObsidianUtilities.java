package net.jgsb.obsidianutils;

import net.jgsb.obsidianutils.init.RecipeManager;
import net.jgsb.obsidianutils.init.Utilities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.jgsb.obsidianutils.proxy.CommonProxy;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME,version=Reference.VERSION)


public class ObsidianUtilities {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e){

		Utilities.init();
		Utilities.register();

	}

	@EventHandler
	public void init(FMLInitializationEvent e){

		proxy.registerRenders();
		RecipeManager.register();
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e){

	}

}