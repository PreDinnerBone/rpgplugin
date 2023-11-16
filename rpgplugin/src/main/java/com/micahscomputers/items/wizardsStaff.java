package com.micahscomputers.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class wizardsStaff {
    
    public static ItemStack wizardsStaff;

    public static void init() {
        createWizardsStaff();
    }

    private static void createWizardsStaff() {
        ItemStack item = new ItemStack(Material.STONE_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aWizard's Staff");
        List<String> lore = new ArrayList<>();
        lore.add(" ");
        lore.add("§6§lRIGHT CLICK: §cQuantum Tunnel");
        lore.add("§6Teleport 7 block forward");
        lore.add("§6in the direction you are facing.");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        wizardsStaff = item;
    }
}