package com.micahscomputers.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class deathripperDagger {
    
    public static ItemStack deathripperDagger;

    public static void init() {
        createDeathripperDagger();
    }

    private static void createDeathripperDagger() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Deathripper Dagger");
        List<String> lore = new ArrayList<>();
        lore.add("§7Damage: §c+150");
        lore.add("§7Strength: §c+75");
        lore.add("§7Crit Chance: §c+10%");
        lore.add("§7Crit Damage: §c+25%");
        lore.add(" ");
        lore.add("§6§lLEGENDARY SWORD");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        deathripperDagger = item;
    }
}
