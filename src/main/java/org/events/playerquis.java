package org.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerquis implements Listener {
	@EventHandler
	public void playerquits(PlayerQuitEvent event){
		Player player = event.getPlayer();
		if (player.hasPermission("hell.iquit")) {return; }
		Bukkit.broadcastMessage(event.getPlayer().getName() + " has quit because they couldn't handle hell");

	}
}
