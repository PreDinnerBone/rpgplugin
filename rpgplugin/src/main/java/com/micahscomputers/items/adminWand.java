package com.micahscomputers.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class adminWand {
    
    public static ItemStack adminWand;

    public static void init() {
        createAdminWand();
    }

    private static void createAdminWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5§kLLL§4 Admin Wand §5§kLLL");
        List<String> lore = new ArrayList<>();
        lore.add("§6Only those with the power to create");
        lore.add("§6the universe can wield this item");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        adminWand = item;
    }
}