package org.events;

import com.sk89q.worldguard.bukkit.event.entity.DamageEntityEvent;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.mineacademy.fo.Common;

public class leather implements Listener {


	@EventHandler
	public void onleather(EntityDamageByEntityEvent event) {


		if (event.getEntityType().equals(EntityType.COW) && event.getDamager() instanceof Player){
//			if (event.getEntity().isDead()) {
				Player player = (Player) event.getDamager();
				event.setCancelled(true);
				player.sendMessage("You can't kill Betsy sorry :)");
//			}



		}
	}
	@EventHandler
	public void customCowname(CreatureSpawnEvent event){

		if (event.getEntityType().name().equals("COW")){
			Cow cow = (Cow) event.getEntity();
			cow.setCustomName("Besty");
			cow.setCustomNameVisible(true);
			//Common.log("Cow spawned");
		}
	}



}
