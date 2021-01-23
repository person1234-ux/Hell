package org.events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;

import java.util.Random;

public class Entities implements Listener {
	@EventHandler(ignoreCancelled = true)
	public void Killallcreepers(CreatureSpawnEvent event){
		Random rn = new Random();


		if (event.getEntity().getType().name().equals("CREEPER")){
			event.setCancelled(true);

//			Common.log("A creeper has been prevented from spawning");
//			Entities creepers = (Entities) event.getEntity();
//			event.getLocation().getWorld().createExplosion(event.getLocation(), 2);


//

		}
		if (event.getEntity().getType().name().equals("ZOMBIE")){
			 Zombie zombie = (Zombie) event.getEntity();
			 zombie.getEquipment().setHelmet(new ItemStack(Material.CREEPER_HEAD));
			 zombie.getEquipment().getHelmet().addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
			
			 final int random = rn.nextInt(4);
			 if (random == 0) {
				 zombie.setCustomName("BOB");
				 zombie.setBaby();
				 zombie.getEquipment().setItemInMainHand(new ItemStack(Material.SHIELD));
			 }
			 else {
			 	zombie.setCustomName("Billy");
			 	zombie.setAdult();
			 	zombie.setArrowsInBody(2);
			 }


		}
	}
}
