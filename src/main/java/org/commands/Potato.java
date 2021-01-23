package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

public class Potato extends SimpleCommand {
	public Potato() {
		super("potato");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("potato is a god!");
		Common.tell(player, "&9Person is better though");
		player.getWorld().spawnEntity(player.getLocation(), EntityType.FIREWORK); // firewords

	}
}
