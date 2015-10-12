package me.Robagio.PolicePlugin;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	Logger policeLogger = Bukkit.getLogger();
	
	public void onEnable(){
		policeLogger.info(ChatColor.GOLD + "Police has been enabled!");
		this.getCommand("police").setExecutor(new SubCommands(this));
	}
	
	public void onDisable(){
		policeLogger.info(ChatColor.GOLD + "Police has been disabled!");
	}
	
}
