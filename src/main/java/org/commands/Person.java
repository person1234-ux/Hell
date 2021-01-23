package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class Person extends SimpleCommand {
	public Person() {
		super("person");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		if (Bukkit.getPlayer("person1").isOnline()){
		Bukkit.getPlayer("person1").sendMessage("hi");}
		else {

			player.sendMessage("hello");
		}
//

	}
}
