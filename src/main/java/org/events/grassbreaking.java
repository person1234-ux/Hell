package org.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.mineacademy.fo.Common;

public class grassbreaking implements Listener {
	@EventHandler
	public void preventgrassbreaking(BlockBreakEvent event) {
		Player player = event.getPlayer();
		if (player.hasPermission("hell.breakdirt")){  return; } // makes it so that I can break dirt if I give myself the canbreakdirt permissions

		if (event.getBlock().getType().name() =="GRASS_BLOCK"|| event.getBlock().getType().name().equals("DIRT") || event.getBlock().getType().name().equals("FARMLAND")) {
			player.sendMessage("you can't do that! :)");
			event.setCancelled(true);
		}
		}
	}
