package com.xdrj.compassPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CompassCommands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sethunted")) {
			if (args.length > 1) {
				sender.sendMessage("Too many arguments!");
				return false;
			}
			else if (args.length < 1) {
				sender.sendMessage("Not enough arguments!");
				return false;
			}
			Player target = (Bukkit.getServer().getPlayer(args[0]));
			if (target == null) {
				sender.sendMessage(args[0] + " is not online!");
				return false;
			} else {
				CompassPlugin.compassTarget = target;
				sender.sendMessage(target.getName() + " is now hunted!");
				return true;
			}
			
		}
		else if (cmd.getName().equalsIgnoreCase("givecompass")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args.length > 0) {
					sender.sendMessage("Too many arguments!");
					return false;
				} else {
					player.getInventory().setItem(8, new ItemStack(Material.COMPASS));
					player.getInventory().getItem(8).addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
					sender.sendMessage(sender.getName() + " was given a compass.");
					return true;
				}
			} else {
				sender.sendMessage("This command can only be run by a player.");
				return false;
			}
		
		}
		else {
			sender.sendMessage("random ass message");
			return false;
		}
		
	}
	
}
