package me.dayton.Requiem.Config;

import java.util.List;

import me.dayton.Requiem.Main;
import me.dayton.Requiem.Utils;

public class ConfigUtil {
	
	// serverSettings
	
	public static String serverName() {
		return Utils.chat(Main.getConfiguration().getString("serverSettings.serverName"));
	}
	
	public static String serverMOTD() {
		return Utils.chat(Main.getConfiguration().getString("serverSettings.serverMOTD"));
	}
	
	public static String worldName() {
		return Main.getConfiguration().getString("serverSettings.worldName");
	}
	
	public static int maxPlayers() {
		return Main.getConfiguration().getInt("serverSettings.maxPlayers");
	}
	
	// chatSettings
	
	public static boolean chatSettingsEnabled() {
		return Main.getConfiguration().getBoolean("chatSettings.enabled");
	}
	
	public static String joinMessage() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.joinMessage"));
	}
	
	public static String firstJoinMessage() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.firstJoinMessage"));
	}
	
	public static String quitMessage() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.quitMessage"));
	}
	
	public static String chatFormat() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.chatFormat"));
	}
	
	public static boolean headerEnabled() {
		return Main.getConfiguration().getBoolean("chatSettings.headerEnabled");
	}
	
	public static String headerText() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.headerText"));
	}
	
	public static boolean footerEnabled() {
		return Main.getConfiguration().getBoolean("chatSettings.footerEnabled");
	}
	
	public static String footerText() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.footerText"));
	}
	
	public static String bannerRight() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.bannerRight"));
	}
	
	public static String bannerLeft() {
		return Utils.chat(Main.getConfiguration().getString("chatSettings.bannerLeft"));
	}
	
	// messageSettings
	
	public static String prefix() {
		return Utils.chat(Main.getConfiguration().getString("messageSettings.prefix"));
	}
	
	public static String playerNull() {
		return Utils.chat(Main.getConfiguration().getString("messageSettings.playerNull"));
	}
	
	public static String noPermission() {
		return Utils.chat(Main.getConfiguration().getString("messageSettings.noPermission"));
	}
	
	public static String invalidUsage() {
		return Utils.chat(Main.getConfiguration().getString("messageSettings.invalidUsage"));
	}
	
	public static String errorMessage() {
		return Utils.chat(Main.getConfiguration().getString("messageSettings.errorMessage"));
	}
	
	// playerCommandSettings
	
	public static String gotoBed() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.gotoBed"));
	}
	
	public static String setBed() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.setBed"));
	}
	
	public static String bedNull() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.bedNull"));
	}
	
	public static String discordInvite() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.discordInvite"));
	}
	
	public static String discordMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.discordMessage"));
	}
	
	public static String gotoHome() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.gotoHome"));
	}
	
	public static String setHome() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.setHome"));
	}
	
	public static String homeNull() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.homeNull"));
	}
	
	public static String gotoSpawn() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.gotoSpawn"));
	}
	
	public static String setSpawn() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.setSpawn"));
	}
	
	public static String spawnNull() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.spawnNull"));
	}
	
	public static String suicideMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.suicideMessage"));
	}
	
	public static String tpaMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaMessage"));
	}
	
	public static String tpaRequestMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaRequestMessage"));
	}
	
	public static String tpaAcceptMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaAcceptMessage"));
	}
	
	public static String tpaAcceptedMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaAcceptedMessage"));
	}
	
	public static String tpaDenyMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaDenyMessage"));
	}
	
	public static String tpaCancelMessage() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaCancelMessage"));
	}
	
	public static String tpaRequestNull() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaRequestNull"));
	}
	
	public static String tpaRequestActive() {
		return Utils.chat(Main.getConfiguration().getString("playerCommandSettings.tpaRequestActive"));
	}
	
	// staffCommandSettings
	
	public static String teleportMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.teleportMessage"));
	}
	
	public static String flyEnabledMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.flyEnabledMessage"));
	}
	
	public static String flyDisabledMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.flyDisabledMessage"));
	}
	
	public static String survivalMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.survivalMessage"));
	}
	
	public static String creativeMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.creativeMessage"));
	}
	
	public static String healMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.healMessage"));
	}
	
	public static String invseeMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.invseeMessage"));
	}
	
	public static String dayMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.dayMessage"));
	}

	public static String noonMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.noonMessage"));
	}
	
	public static String nightMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.nightMessage"));
	}
	
	public static String midnightMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.midnightMessage"));
	}
	
	public static String vanishMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.vanishMessage"));
	}
	
	public static String weatherEnabledMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.weatherEnabledMessage"));
	}
	
	public static String weatherDisabledMessage() {
		return Utils.chat(Main.getConfiguration().getString("staffCommandSettings.weatherDisabledMessage"));
	}
	
	// groupSettings
	
	public static String moderatorPrefix() {
		return Utils.chat(Main.getConfiguration().getString("Moderators.prefix"));
	}
	
	public static List<String> moderatorsGroup() {
		return Main.getConfiguration().getStringList("Moderators.mods");
	}
	
	public static String administratorPrefix() {
		return Utils.chat(Main.getConfiguration().getString("Administrators.prefix"));
	}
	
	public static List<String> administratorsGroup() {
		return Main.getConfiguration().getStringList("Administrators.admins");
	}
	
	public static String foundersPrefix() {
		return Utils.chat(Main.getConfiguration().getString("Founders.prefix"));
	}
	
	public static List<String> foundersGroup() {
		return Main.getConfiguration().getStringList("Founders.founders");
	}
}