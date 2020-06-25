package me.dayton.Requiem.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import me.dayton.Requiem.Config.ConfigUtil;

public class ServerListPing implements Listener {
	@EventHandler
	public void onServerListPing(ServerListPingEvent e) {
		int maxPlayers = ConfigUtil.maxPlayers();
		String serverMOTD = ConfigUtil.serverMOTD();
		serverMOTD = serverMOTD.replace("<servername>", ConfigUtil.serverName());
		serverMOTD = serverMOTD.replace("<world>", ConfigUtil.worldName());
		
		e.setMotd(serverMOTD);
		e.setMaxPlayers(maxPlayers);
	}
}
