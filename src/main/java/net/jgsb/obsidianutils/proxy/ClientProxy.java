package net.jgsb.obsidianutils.proxy;

import net.jgsb.obsidianutils.init.Utilities;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders(){
		Utilities.registerRenders();
	}

}
