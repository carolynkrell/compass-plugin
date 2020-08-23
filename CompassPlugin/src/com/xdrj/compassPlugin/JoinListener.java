package com.xdrj.compassPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class JoinListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if (!(event.getPlayer().getInventory().contains(new ItemStack(Material.COMPASS)))) {
			event.getPlayer().getInventory().setItem(8, new ItemStack(Material.COMPASS));
			event.getPlayer().getInventory().getItem(8).addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
		}
		
	}
	
}
