package org.events;

import com.massivecraft.massivecore.command.type.store.TypeEntityId;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.main.Hell;
import org.mineacademy.fo.Common;

import javax.xml.bind.SchemaOutputResolver;
import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
public class bowthatspawncats implements Listener {
	Set<UUID> arrow = new HashSet<>();
	Set<UUID> user = new HashSet<>();

	@EventHandler
	public void Bowshotevent(ProjectileLaunchEvent event){

		final Projectile shot = event.getEntity();
		if (shot instanceof Player){
			Player player = (Player) shot.getShooter();
			if(!player.hasPermission("hell.catbow")) { return; } } // make it so that the player need catbow permissions to shoot the bot
		if (shot instanceof Arrow && shot.getShooter() instanceof Player){
			arrow.add(event.getEntity().getUniqueId()); // gets uuid of the arrow and stores in in the arrow set


		}
	}
	@EventHandler
	public void arrowlandevent(ProjectileHitEvent event){
		Projectile shot = event.getEntity();
		if (shot instanceof Arrow && arrow.contains(shot.getUniqueId())) {
			arrow.remove(shot.getUniqueId());
			user.add(shot.getWorld().spawnEntity(shot.getLocation(), EntityType.CAT).getUniqueId());
			System.out.println(user);
			shot.remove();






		}
		}
	@EventHandler
	public void catspawn(EntitySpawnEvent event){
		if (event.getEntity() instanceof Cat) {
			Cat cat = (Cat) event.getEntity();

			new BukkitRunnable(){

				@Override
				public void run() {
					if(user.contains(cat.getUniqueId())) {
						cat.setCustomName("RED");
						cat.setCustomNameVisible(true);
						cat.setCollarColor(DyeColor.LIGHT_BLUE);
						cat.setCatType(Cat.Type.RED);
						user.remove(cat.getUniqueId());
						//Bukkit.getPlayer("Person1").sendMessage("Success");
						System.out.println(user);
					}
				}
			}.runTaskLater(Hell.getInstance(), 10);

				}
				}
		}







