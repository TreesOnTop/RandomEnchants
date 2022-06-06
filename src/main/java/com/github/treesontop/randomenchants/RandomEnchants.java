package com.github.treesontop.randomenchants;

import com.github.treesontop.randomenchants.events.CraftItem;
import com.github.treesontop.randomenchants.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.LocalDate;
import java.time.ZoneId;

public final class RandomEnchants extends JavaPlugin {

    private static RandomEnchants mainClass;

    public static RandomEnchants getMainClass() {
        return mainClass;
    }

    @Override
    public void onEnable() {
        mainClass = this;
        ConfigHandler.reloadConfig();
        if (ConfigHandler.getConfig().getBoolean("Enabled")) {
            getServer().getPluginManager().registerEvents(new CraftItem(), this);
            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            Bukkit.getConsoleSender().sendMessage("§a[RandomEnchants] Plugin enabled!");
        } else {
            Bukkit.getConsoleSender().sendMessage("§c[RandomEnchants] Plugin disabled!");
        }
        Bukkit.getConsoleSender().sendMessage("§aMade by Tree#9562 https://treesontop.tk/bread");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
