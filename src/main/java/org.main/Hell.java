package org.main;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.entity.Cat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.commands.Person;
import org.commands.Potato;
import org.commands.about;
import org.events.*;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Hell extends SimplePlugin {
	@Override
	protected void onPluginStart() {
		Common.log("the plugin has started");
		registerEvents(new grassbreaking());
		registerEvents(new iron());
		registerCommand(new about());
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
		registerCommand(new Person());
		registerEvents(new playerjoinevent());
		registerEvents(new projectiles());
		registerEvents(new test());
		registerEvents(new bowthatspawncats());

	}


	}






