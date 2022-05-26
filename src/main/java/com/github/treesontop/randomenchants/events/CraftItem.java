package com.github.treesontop.randomenchants.events;

import com.github.treesontop.randomenchants.ConfigHandler;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import java.util.Objects;

public class CraftItem implements Listener {
    @EventHandler
    public void onCraftItem(CraftItemEvent event) {
        if (ConfigHandler.getConfig().getBoolean("Enabled")) {
            if (Objects.requireNonNull(event.getCurrentItem()).getType() == Material.LEATHER_BOOTS) {
                event.getCurrentItem().addEnchantment(Enchantment.PROTECTION_FALL, 4);
            } else if (Objects.requireNonNull(event.getCurrentItem()).getEnchantments().size() == 0) {
                Enchantment randEnchant = Enchantment.values()[(int) (Math.random() * Enchantment.values().length)];
                Objects.requireNonNull(event.getCurrentItem()).addUnsafeEnchantment(randEnchant, (int) Math.ceil(Math.random() * randEnchant.getMaxLevel()));
            }
        }
    }
}
