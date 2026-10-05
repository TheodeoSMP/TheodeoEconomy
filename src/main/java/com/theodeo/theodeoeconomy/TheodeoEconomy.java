package com.theodeo.theodeoeconomy;

import org.bukkit.plugin.java.JavaPlugin;

public class TheodeoEconomy extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("TheodeoEconomy has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TheodeoEconomy has been disabled!");
    }
}