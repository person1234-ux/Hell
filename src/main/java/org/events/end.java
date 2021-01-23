package org.events;

import com.massivecraft.factions.event.EventFactionsNameChange;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.mineacademy.fo.Common;

public class end implements Listener {
	@EventHandler
	public void endcrystal(EntityDamageByEntityEvent event){

		if (event.getEntityType().name().equals("ENDER_CRYSTAL") && event.getDamager().getName().equals("Arrow")) {
			event.setCancelled(true);
			Bukkit.broadcastMessage("Ender crystals can't be damaged by arrows");
		}
		if (event.getEntityType().name().equals("ENDER_DRAGON") && event.getDamager().getName().equals("Arrow"))
		{
			event.setCancelled(true);
			Bukkit.broadcastMessage("Ender dragons can't be killed with arrows");
		}
	}

	}
