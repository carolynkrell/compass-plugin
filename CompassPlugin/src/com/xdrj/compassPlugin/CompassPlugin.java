package com.xdrj.compassPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class CompassPlugin extends JavaPlugin {
	
	public static Player compassTarget;
	
	//run when plugin is first enabled
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new JoinListener(), this);
		getServer().getPluginManager().registerEvents(new CompassClickListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerRespawnListener(), this);
		CompassCommands compassExecutor = new CompassCommands();
		this.getCommand("sethunted").setExecutor(compassExecutor);
		this.getCommand("givecompass").setExecutor(compassExecutor);
	}
	
	//run when plugin is first disabled
	@Override
	public void onDisable() {
		
	}
	
}
