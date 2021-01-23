package org.events;

import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class projectiles implements Listener {
	// A set (list) storing flying eggs
	private final Set<UUID> shotEggs = new HashSet<>();

	// Listen to when a projectile is shot
	@EventHandler
	public void onProjectileLaunch(final ProjectileLaunchEvent event) {
		final Projectile shot = event.getEntity();

		// If the shot projectile is an egg and the shooter is a player,
		// register the flying egg for later
		if (shot instanceof Egg && shot.getShooter() instanceof Player)
			shotEggs.add(shot.getUniqueId());
	}

	// Listen to when a projectile hits the ground
	@EventHandler
	public void onProjectileHit(final ProjectileHitEvent event) {
		final Projectile shot = event.getEntity();

		// If the projectile is an egg and flying eggs set contains it,
		// run the following
		if (shot instanceof Egg && shotEggs.contains(shot.getUniqueId())) {

			// Clean the set
			shotEggs.remove(shot.getUniqueId());

			// Spawn a creeper at the location of the egg - sometimes a bit unprecise due to small egg calculations
			shot.getWorld().createExplosion(shot.getLocation(), 3);

		}
	}

	// Here is how to unregister events. This is not recommended and the Bukkit API is not
	// made well for this. I suggest you use a boolean field in the class to disable code
	// execution for those events instead
	//
	//ProjectileLaunchEvent.getHandlerList().unregister((Plugin) OrionPlugin.getInstance());
	//ProjectileHitEvent.getHandlerList().unregister((Plugin) OrionPlugin.getInstance());
	//HandlerList.unregisterAll((Plugin) OrionPlugin.getInstance());
}
