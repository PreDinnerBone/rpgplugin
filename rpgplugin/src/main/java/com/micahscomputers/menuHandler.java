package com.micahscomputers;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.ipvp.canvas.Menu;
import org.ipvp.canvas.mask.BinaryMask;
import org.ipvp.canvas.mask.Mask;
import org.ipvp.canvas.type.ChestMenu;

public class menuHandler {

    public static Menu createMenu() {
        return ChestMenu.builder(5)
            .title("NPC Shop")
            .build();
    }

    int menuId = 1;

    public static void displayMenu(Player player) {
        Menu menu = createMenu();
        Mask mask = BinaryMask.builder(menu)
                        .item(new ItemStack(Material.GRAY_STAINED_GLASS_PANE))
                        .pattern("111111111") // First row
                        .pattern("111111111")
                        .pattern("111101111") // Second row
                        .pattern("111111111") // Third row
                        .pattern("111111111").build(); // Fourth row
        mask.apply(menu);
        menu.open(player);
    }
}
