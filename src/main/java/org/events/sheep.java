package org.events;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.mineacademy.fo.Common;

import java.util.Random;

public class sheep implements Listener {
	@EventHandler
	public void sheepspawn(CreatureSpawnEvent event) {
		if (event.getEntityType().name().equals("SHEEP")) {
			Sheep sheep = (Sheep) event.getEntity();
			Random rn = new Random();
			final int randomnumber = rn.nextInt(2);
			if (randomnumber == 0) {
				sheep.setBaby();
				sheep.setColor(DyeColor.RED);
				sheep.setCustomNameVisible(true);
				sheep.setCustomName("Persons");
			} else {
				final int randomnumber2 = rn.nextInt(2);
			sheep.setAdult();
			sheep.setColor(DyeColor.LIGHT_BLUE);
			if (randomnumber2 == 0) {
				sheep.setInvulnerable(true);
				sheep.getWorld().createExplosion(sheep.getLocation(), 2);
				sheep.setInvulnerable(false);
			}
			}

			}
		}
	}
