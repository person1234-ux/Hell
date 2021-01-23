package org.events;

import com.comphenix.protocol.PacketType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;

import java.util.Random;

public class iron implements Listener {
	@EventHandler
	public void onIronbreak(BlockBreakEvent event){
		Player player = event.getPlayer();
		//Common.log(event.getBlock().getType().name());
		if (event.getBlock().getType().name().equals("IRON_ORE")) {
			Random rn = new Random();
			int randomnumber = rn.nextInt(4);
			System.out.println(randomnumber);
			if (randomnumber == 0) {

				event.setDropItems(false);
				player.sendMessage("You didn't get iron ore!");

			Common.tell(player, "At least you know you can get diamonds");
			player.sendMessage("The chance of getting iron is 50%"); }
			else{
				Common.tell(player, "&byou got lucky that you got iron_ore");
			}
		}
		}
	}

