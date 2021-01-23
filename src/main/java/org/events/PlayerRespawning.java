package org.events;

import com.gmail.nossr50.mcmmo.kyori.adventure.bossbar.BossBar;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.mineacademy.fo.Common;

public class PlayerRespawning implements Listener {
	@EventHandler
	public void onplayerrespawnevent(PlayerRespawnEvent event){
	Player player = event.getPlayer();

	if (player.isOnline()){
		if (player.hasPermission("hell.irespawn")) {return; } // sets permission to avoid playerrespawn events
		Common.tell(player, "&4 I never said you could escape hell");
		player.getInventory().setHelmet(new ItemStack(Material.PUMPKIN));
		ItemStack rb = new ItemStack(Material.LEATHER_BOOTS, 1);
		LeatherArmorMeta redboots = (LeatherArmorMeta)  rb.getItemMeta();
		redboots.setColor(Color.RED);
		rb.setItemMeta(redboots);
		player.getEquipment().setBoots(rb); // this gives the play red boots
		ItemStack rc = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		LeatherArmorMeta redchest = (LeatherArmorMeta)  rc.getItemMeta();
		redchest.setColor(Color.RED);

		rc.setItemMeta(redboots);
		player.getEquipment().setChestplate(rc); // this gives the play red chestplate
		ItemStack rl = new ItemStack(Material.LEATHER_LEGGINGS,1);
		LeatherArmorMeta redleggings = (LeatherArmorMeta) rl.getItemMeta();
		redleggings.setColor(Color.RED);
		rl.setItemMeta(redleggings);
		player.getEquipment().setLeggings(rl); // this gives the player red leggins
		player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
		player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);



	}
	}
}
