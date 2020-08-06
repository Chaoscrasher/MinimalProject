package com.test.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class MinimumProjectPlugin extends JavaPlugin {

	public static MinimumProjectPlugin instance;

	@Override
	public void onEnable()
	{
		instance = this;
		System.out.println("MinimumProject loaded!");
		this.saveDefaultConfig();
	}

	@Override
	public void onDisable()
	{

	}
}
