package me.dayton.Requiem.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.dayton.Requiem.Config.ConfigUtil;

public class PlayerChat implements Listener {
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		String chatFormat = ConfigUtil.chatFormat();
		chatFormat = chatFormat.replace("<player>", p.getPlayerListName());
		chatFormat = chatFormat.replace("<message>", e.getMessage());
		
		e.setFormat(chatFormat);
	}	
}