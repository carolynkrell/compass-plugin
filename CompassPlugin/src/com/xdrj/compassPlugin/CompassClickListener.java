package com.xdrj.compassPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class CompassClickListener implements Listener {
	
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.COMPASS && event.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.VANISHING_CURSE) && CompassPlugin.compassTarget != null) {
			event.getPlayer().setCompassTarget(CompassPlugin.compassTarget.getLocation());
		}
	}
	
}
