package me.dayton.Requiem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import me.dayton.Requiem.Homes;
import me.dayton.Requiem.Config.ConfigUtil;

public class HomeCMD implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("sethome")) {
			if(sender.hasPermission("req.sethome")) {
				if ((sender instanceof ConsoleCommandSender)) {
					
				} else if ((sender instanceof Player)) {
					Player p = (Player) sender;
					Homes.setHome(p);
					p.sendMessage(ConfigUtil.setHome());
				} else {
					sender.sendMessage(ConfigUtil.errorMessage());
				}
			}
		} else if (cmd.getName().equalsIgnoreCase("home")) {
			if(sender.hasPermission("req.home")) {
				if ((sender instanceof ConsoleCommandSender)) {
					
				} else if ((sender instanceof Player)) {
					Player p = (Player) sender;
					if (Homes.homeIsNull(p)) {
						p.sendMessage(ConfigUtil.homeNull());
					} else {
						Homes.goHome(p);
						p.sendMessage(ConfigUtil.gotoHome());
					}
				}
			}
		}
		return false;
	}
}