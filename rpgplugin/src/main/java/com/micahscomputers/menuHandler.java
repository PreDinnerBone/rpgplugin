package com.micahscomputers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.ipvp.canvas.Menu;
import org.ipvp.canvas.mask.BinaryMask;
import org.ipvp.canvas.mask.Mask;
import org.ipvp.canvas.slot.Slot;
import org.ipvp.canvas.type.ChestMenu;

public class menuHandler {

    public static Menu createMenu() {
        return ChestMenu.builder(5)
            .title("NPC Shop")
            .build();
    }

    int menuId = 1;

    public static void displayMenu(Player player) {
        ItemStack fillerItem = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = fillerItem.getItemMeta();
        meta.setDisplayName(" ");
        fillerItem.setItemMeta(meta);

        ItemStack test = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta2 = fillerItem.getItemMeta();
        meta2.setDisplayName("Claim Item");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_UNBREAKABLE);
        test.setItemMeta(meta2);

        Menu menu = createMenu();
        Mask mask = BinaryMask.builder(menu)
                        .item(fillerItem)
                        .pattern("111111111") // First row
                        .pattern("111111111")
                        .pattern("111101111") // Second row
                        .pattern("111111111") // Third row
                        .pattern("111111111").build(); // Fourth row

        Slot slot = menu.getSlot(22);

        slot.setClickHandler((playerclicked, info) -> {
            player.getInventory().addItem(test);
            menu.close();
        });
        menu.getSlot(22).setItem(test);
        mask.apply(menu);
        menu.open(player);
    }
}
