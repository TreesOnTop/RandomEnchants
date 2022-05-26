package com.github.treesontop.randomenchants;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class ConfigHandler {
    private static YamlConfiguration config;

    public static void reloadConfig() {
        File configFile = new File(RandomEnchants.getMainClass().getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            RandomEnchants.getMainClass().saveResource("config.yml", true);
            configFile = new File(RandomEnchants.getMainClass().getDataFolder(), "config.yml");
        }
        config = YamlConfiguration.loadConfiguration(configFile);
    }

    public static YamlConfiguration getConfig() {
        return config;
    }
}