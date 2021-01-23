package org.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mineacademy.fo.Common;

import java.util.Random;

public class RandomBlocks implements Listener {
	@EventHandler(ignoreCancelled = true)
	public void Ontreebreak(final BlockBreakEvent event) {
		Random rn = new Random();
		final Player player = event.getPlayer();
		//Common.log(event.getBlock().getType().name());
		if (player.hasPermission("hell.ignoreblockbreakingevents")) { return;} // set permission to ignore these events
		if (event.isDropItems() && event.getBlock().getType().name().equals("OAK_LOG")) {
			//Common.tell(player, "I see you!");
			//Common.log("explosion occurred!");
			event.getBlock().getWorld().createExplosion(event.getBlock().getLocation(), 1); // makes the block explode
		}
		if (event.isDropItems() && event.getBlock().getType().name().equals("SAND")) {

			final int randomnumber = rn.nextInt(100) + 1;
			if (randomnumber < 30) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2000, 10));
			}
		}
		if (event.isDropItems() && event.getBlock().getType().name().equals("ANDESITE")) {

			final int randomnumber = rn.nextInt(100) + 1;
			if (randomnumber < 70) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 2000, 1));
			}

		}
		if (event.isDropItems() && event.getBlock().getType().name().equals("OAK_LEAVES")) {
			player.setInvulnerable(true);
			event.getBlock().getWorld().createExplosion(event.getBlock().getLocation(), 4);
			player.sendMessage("explosion");
			player.setInvulnerable(false);
		}
		if (event.isDropItems() && event.getBlock().getType().name().equals("RED_SAND")) {

			final int randomnumber = rn.nextInt(20);
			if (randomnumber < 2){
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2000, 30));
			}
		}


		}

	}
