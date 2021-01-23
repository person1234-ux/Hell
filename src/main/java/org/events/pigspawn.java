package org.events;

import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

public class pigspawn implements Listener {
	@EventHandler(ignoreCancelled = true)
	public void pigrider(CreatureSpawnEvent event){
		//Common.log(event.getEntityType().name());
		if (event.getEntityType().name().equals("PIG")){
			Pig pig = (Pig) event.getEntity();
			pig.setSaddle(true);
			pig.setCustomName("Oink");
			pig.setCustomNameVisible(true);
			pig.setInvulnerable(false);
		}
	}
}
