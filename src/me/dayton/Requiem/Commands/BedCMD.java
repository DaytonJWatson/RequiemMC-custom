package me.dayton.Requiem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.Requiem.Config.ConfigUtil;

public class BedCMD implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("bed")) {
			if (sender.hasPermission("req.bed")) {
				if (p.getBedSpawnLocation() != null) {
					p.teleport(p.getBedSpawnLocation());
					p.sendMessage(ConfigUtil.gotoBed());
				} else {
					p.sendMessage(ConfigUtil.bedNull());
				}
			}
		}
		return false;
	}
}