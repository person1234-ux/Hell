package org.events;

import org.bukkit.entity.Chicken;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

public class chicken implements Listener {
	@EventHandler
	public void chickenspawn(CreatureSpawnEvent event){
		if (event.getEntityType().name().equals("CHICKEN")){
			Chicken chicken = (Chicken) event.getEntity();
			chicken.setCustomName("Turkey_Neon");
			chicken.setCustomNameVisible(true);
			//Common.log("chicken spawned");
		}
	}
}
