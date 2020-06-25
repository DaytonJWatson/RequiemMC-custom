package me.dayton.Requiem.Config;

import org.bukkit.plugin.Plugin;

public class Config {
	private Plugin pl;
	
	public Config(Plugin pl) {
		this.pl = pl;
	}
	
	public void createConfig() {
		pl.getConfig().options().copyDefaults(true);
		pl.saveDefaultConfig();
	}
}
