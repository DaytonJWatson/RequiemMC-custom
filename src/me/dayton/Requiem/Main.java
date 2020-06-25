package me.dayton.Requiem;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.dayton.Requiem.Commands.BedCMD;
import me.dayton.Requiem.Commands.HelpCMD;
import me.dayton.Requiem.Commands.HomeCMD;
import me.dayton.Requiem.Commands.SpawnCMD;
import me.dayton.Requiem.Commands.SuicideCMD;
import me.dayton.Requiem.Config.Config;
import me.dayton.Requiem.Events.PlayerChat;
import me.dayton.Requiem.Events.PlayerJoin;
import me.dayton.Requiem.Events.PlayerQuit;
import me.dayton.Requiem.Events.ServerListPing;

public class Main extends JavaPlugin {
	
	private File spawnFile = new File(getDataFolder(), "spawn.yml");
	public YamlConfiguration spawn = YamlConfiguration.loadConfiguration(this.spawnFile);
	
	private File homesFile = new File(getDataFolder(), "homes.yml");
	public YamlConfiguration homes = YamlConfiguration.loadConfiguration(this.homesFile);
	
	private static Main instance;
	
	public void onEnable() {
		instance = this;
		
		getLogger().info("RequiemMC Designed for Requiem Survival Minecraft Server");
		
		loadFiles();
		loadCommands();
		loadEvents();
	}
	
	public void loadFiles() {
		Config c = new Config(this);
		c.createConfig();
		
		if (!spawnFile.exists()) {
			saveSpawnFile();
			getLogger().warning("spawn.yml not found, creating one for you!");
		}
		
		if (!homesFile.exists()) {
			saveHomesFile();
			getLogger().warning("homes.yml not found, creating one for you!");
		}
	}
	
	public void loadCommands() {
		getCommand("bed").setExecutor(new BedCMD());
		getCommand("help").setExecutor(new HelpCMD());
		getCommand("home").setExecutor(new HomeCMD());
		getCommand("sethome").setExecutor(new HomeCMD());
		getCommand("spawn").setExecutor(new SpawnCMD());
		getCommand("setspawn").setExecutor(new SpawnCMD());
		getCommand("suicide").setExecutor(new SuicideCMD());
	}
	
	public void loadEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new PlayerChat(), this);
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new PlayerQuit(), this);
		pm.registerEvents(new ServerListPing(), this);
	}
	
	public void saveSpawnFile() {
		try {
			this.spawn.save(this.spawnFile);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveHomesFile() {
	    try {
	    	this.homes.save(this.homesFile);
	    }
	    catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
	
	public static FileConfiguration getConfiguration() {
		return getInstance().getConfig();
	}
	
	public static Main getInstance() {
		return instance;
	}
}