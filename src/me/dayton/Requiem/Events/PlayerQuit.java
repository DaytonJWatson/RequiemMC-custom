package me.dayton.Requiem.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.dayton.Requiem.Config.ConfigUtil;

public class PlayerQuit implements Listener {
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		// Player Quit
		String quitMessage = ConfigUtil.quitMessage();
		quitMessage = quitMessage.replace("<player>", p.getName());
		quitMessage = quitMessage.replace("<servername>", ConfigUtil.serverName());
		
		e.setQuitMessage(quitMessage);
	}
}