package org.main;
import org.commands.Potato;

import org.events.*;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Hell extends SimplePlugin {
	@Override
	protected void onPluginStart() {
		Common.log("the plugin has started");
		registerEvents(new grassbreaking());
		registerEvents(new iron());
		registerEvents(new RandomBlocks());
		registerEvents(new Entities());
		registerEvents(new leather());
		registerEvents(new sheep());
		registerEvents(new chicken());
		registerEvents(new PlayerRespawning());
		registerEvents(new pigspawn());
		registerCommand(new Potato());
		registerEvents(new playerquis());
		registerEvents(new end());
		registerEvents(new playerjoinevent());
		registerEvents(new projectiles());
		registerEvents(new test());
		registerEvents(new bowthatspawncats());

	}


	}






