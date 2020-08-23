package com.xdrj.compassPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class PlayerRespawnListener implements Listener{
	
	@EventHandler
	public void onPlayerRespawnEvent(PlayerRespawnEvent respawn) {
		respawn.getPlayer().getInventory().setItem(8, new ItemStack(Material.COMPASS));
		respawn.getPlayer().getInventory().getItem(8).addUnsafeEnchantment(Enchantment.VANISHING_CURSE, 1);
	}
}
