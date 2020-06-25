package me.dayton.Requiem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.Requiem.Config.ConfigUtil;

public class SuicideCMD implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("suicide")) {
			if(sender.hasPermission("req.suicide")) {
				p.setHealth(0);
				p.sendMessage(ConfigUtil.suicideMessage());
			} else {
				p.sendMessage(ConfigUtil.noPermission());
			}
		}
		return false;
	}
}