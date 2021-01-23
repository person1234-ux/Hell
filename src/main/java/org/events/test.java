package org.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class test implements Listener {
	@EventHandler public void testbreakblocks(BlockBreakEvent event) {
		Player player= event.getPlayer();
		if (!player.hasPermission("hell.test")) {
			return;
		} else {
			System.out.println(event.getBlock().getType().name());
			System.out.println("To disable this set all player permission for hell.test to false");

		}
	}
}
