package me.dayton.Requiem;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Homes {
	public static void setHome(Player p) {
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".X", Double.valueOf(p.getLocation().getX()));
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".Y", Double.valueOf(p.getLocation().getY()));
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".Z", Double.valueOf(p.getLocation().getZ()));
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".Yaw", Float.valueOf(p.getLocation().getYaw()));
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".Pitch", Float.valueOf(p.getLocation().getPitch()));
		Main.getInstance().homes.set("Homes." + p.getUniqueId().toString() + ".World", p.getLocation().getWorld().getName());
		Main.getInstance().saveHomesFile();
	}

	public static void goHome(Player p) {
		Location home = new Location(
				Bukkit.getWorld(Main.getInstance().homes.getString("Homes." + p.getUniqueId().toString() + ".World")),
				Main.getInstance().homes.getDouble("Homes." + p.getUniqueId().toString() + ".X"),
				Main.getInstance().homes.getDouble("Homes." + p.getUniqueId().toString() + ".Y"),
				Main.getInstance().homes.getDouble("Homes." + p.getUniqueId().toString() + ".Z"),
				(float) Main.getInstance().homes.getLong("Homes." + p.getUniqueId().toString() + ".Yaw"),
				(float) Main.getInstance().homes.getLong("Homes." + p.getUniqueId().toString() + ".Pitch"));

		p.teleport(home);
	}

	public static boolean homeIsNull(Player p) {
		if (Main.getInstance().homes.getString("Homes." + p.getUniqueId()) == null) {
			return true;
		}
		return false;
	}
}