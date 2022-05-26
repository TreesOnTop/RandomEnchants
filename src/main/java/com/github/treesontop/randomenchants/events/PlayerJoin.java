package com.github.treesontop.randomenchants.events;

import com.github.treesontop.randomenchants.ConfigHandler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (ConfigHandler.getConfig().getBoolean("Enabled")) {
            event.getPlayer().sendMessage("§aMade by Tree#9562 https://ferry.cf/bread");
        }
    }
}
