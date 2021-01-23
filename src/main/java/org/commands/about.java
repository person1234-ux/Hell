package org.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class about extends SimpleCommand {
	public about() {
		super("about");
	}

	@Override
	public void onCommand() {
		Player player = getPlayer();
		player.sendMessage("The fun plugin is by person");


	}
}
