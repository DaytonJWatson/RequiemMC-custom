package me.dayton.Requiem.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dayton.Requiem.Utils;
import me.dayton.Requiem.Config.ConfigUtil;

public class HelpCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
		Player p = (Player) sender;
		String bannerRight = ConfigUtil.bannerRight();
		String bannerLeft = ConfigUtil.bannerLeft();
		
		if(cmd.getName().equalsIgnoreCase("help")) {
			if(p.hasPermission("req.help") || p.isOp()) {
				
				p.sendMessage(bannerLeft + "Help" + bannerRight);
				p.sendMessage(Utils.chat("&8/&6help &8>> &7Displays Help menu"));
				p.sendMessage(Utils.chat("&8/&6bed &8>> &7Takes you to your bed"));
				p.sendMessage(Utils.chat("&8/&6spawn &8>> &7Takes you to spawn"));
				p.sendMessage(Utils.chat("&8/&6suicide &8>> &7Mistakes were made"));
				p.sendMessage(Utils.chat("&8/&6tpa &8>> &7Request to teleport to player"));
			}
		}
		return false;
	}
}