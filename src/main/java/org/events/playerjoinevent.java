package org.events;

import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mineacademy.fo.Common;

import java.util.ArrayList;
import java.util.List;

public class playerjoinevent implements Listener {
	@EventHandler
	public void test(PlayerJoinEvent event){
		Player player = event.getPlayer();
		if (player.hasPermission("hello.ignorejoinevent")) {return;} // ingores player rejoin event



		Common.tellLater(20, player, "&4 Welcome to hell");
		player.getInventory().setHelmet(new ItemStack(Material.PUMPKIN));
		player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2000000, 1, false));
		try {
		ItemStack personsw = new ItemStack(Material.IRON_SWORD);
		ItemMeta ps = personsw.getItemMeta();
		ps.setDisplayName("Person's sword");
		List<String> lorelist = new ArrayList<String>();
		lorelist.add("Person's killer");
		ps.setLore(lorelist);
		personsw.setItemMeta(ps);
		personsw.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
		personsw.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 3);
		player.getInventory().setItemInMainHand(personsw);
		player.setGameMode(GameMode.SURVIVAL);


			player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
			player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
			ItemStack rb = new ItemStack(Material.LEATHER_BOOTS, 1);
			LeatherArmorMeta redboots = (LeatherArmorMeta)  rb.getItemMeta();
			redboots.setColor(Color.RED);
			ArrayList<String> redbootslore = new ArrayList<String>();
			redbootslore.add("Person's redboots");
			redbootslore.add("Evan's hate these");
			redboots.setLore(redbootslore);
			redboots.setDisplayName("Person's boosts");
			rb.setItemMeta(redboots);
			player.getEquipment().setBoots(rb); // this gives the play red boots
			ItemStack rc = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
			LeatherArmorMeta redchest = (LeatherArmorMeta)  rc.getItemMeta();
			redchest.setColor(Color.RED);
			ArrayList<String> chestlore = new ArrayList<>();
			chestlore.add("hi");
			rc.setItemMeta(redchest);
			redchest.setLore(chestlore);
			player.getEquipment().setChestplate(rc); // this gives the play red chestplate
			ItemStack rl = new ItemStack(Material.LEATHER_LEGGINGS,1);
			LeatherArmorMeta redleggings = (LeatherArmorMeta) rl.getItemMeta();
			redleggings.setColor(Color.RED);
			rl.setItemMeta(redleggings);
			player.getEquipment().setLeggings(rl); // this gives the player red leggins
			player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
			player.getInventory().getHelmet().addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);



		} catch (NullPointerException exception){
			Common.log("NullPointerException error");
		}
		Common.tellLater(24, player,"&6Ha Ha Ha");


	}
}
