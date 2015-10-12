package me.Robagio.PolicePlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SubCommands implements CommandExecutor {

	Main plugin;
	
	public SubCommands(Main plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(commandLabel.equalsIgnoreCase("police")){
			Player player = (Player) sender;
			
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("w")){
					player.sendMessage(ChatColor.GOLD + "You are on duty.");
				}
			}
			
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("2")){
					player.sendMessage(ChatColor.GRAY + "{ { { { { " + ChatColor.GOLD + "Police Commands, Page 2" + ChatColor.GRAY + " } } } } }");
					player.sendMessage(ChatColor.GOLD + "/police tasks" + ChatColor.GRAY + " views current tasks");
					player.sendMessage(ChatColor.GOLD + "/police sethq" + ChatColor.GRAY + " sets police headquarters location");
					player.sendMessage(ChatColor.GOLD + "/police rank" + ChatColor.GRAY + " views your current rank");
				}
			}
			
			if(args.length == 0){
			
			player.sendMessage(ChatColor.GRAY + "{ { { { { " + ChatColor.GOLD + "Police Commands" + ChatColor.GRAY + " } } } } }");
			player.sendMessage(ChatColor.GOLD + "/police hq" + ChatColor.GRAY + " teleport to police headquarters");
			player.sendMessage(ChatColor.GOLD + "/police w" + ChatColor.GRAY + " mark as on duty");
			player.sendMessage(ChatColor.GOLD + "/police chat" + ChatColor.GRAY + " toggles police chat");
			player.sendMessage(ChatColor.GOLD + "/police ranks" + ChatColor.GRAY + " views all police ranks");
			player.sendMessage(ChatColor.GRAY + "To view page 2, use " + ChatColor.GOLD + "/police 2");
		}
		
		return true;
	}
		return true;
	}
}
