package me.dayton.Requiem.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.dayton.Requiem.Config.ConfigUtil;

public class PlayerJoin implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		// New and Existing Player Logins
		
		String firstJoinMessage = ConfigUtil.firstJoinMessage();
		firstJoinMessage = firstJoinMessage.replace("<player>", p.getName());
		firstJoinMessage = firstJoinMessage.replace("<servername>", ConfigUtil.serverName());
		
		String joinMessage = ConfigUtil.joinMessage();
		joinMessage = joinMessage.replace("<player>", p.getName());
		joinMessage = joinMessage.replace("<servername>", ConfigUtil.serverName());
		
		ItemStack newPlayerFood = new ItemStack(Material.BREAD, 16);
		ItemMeta newPlayerFoodMeta = newPlayerFood.getItemMeta();
		newPlayerFoodMeta.setDisplayName("§7Requiem §6Rations");
		newPlayerFood.setItemMeta(newPlayerFoodMeta);
		
		if(p.hasPlayedBefore()) {
			e.setJoinMessage(joinMessage);
		} else if(!p.hasPlayedBefore()) {
			e.setJoinMessage(firstJoinMessage);
	        p.getInventory().addItem(newPlayerFood);
		}
		
		// Prefix's for Founders, Admins, and Mods
		
		/*List<String> foundersGroup = ConfigUtil.foundersGroup();
		List<String> administratorsGroup = ConfigUtil.administratorsGroup();
		List<String> moderatorsGroup = ConfigUtil.moderatorsGroup();
		
		if(foundersGroup.contains(p.getName())) {
			p.setPlayerListName(ConfigUtil.foundersPrefix() + p.getName());
		} else {
			return;
		}
		
		if(administratorsGroup.contains(p.getName())) {
			p.setPlayerListName(ConfigUtil.administratorPrefix() + p.getName());
		} else {
			return;
		}
		
		if(moderatorsGroup.contains(p.getName())) {
			p.setPlayerListName(ConfigUtil.moderatorPrefix() + p.getName());
		} else {
			return;
		}*/
	}
}
