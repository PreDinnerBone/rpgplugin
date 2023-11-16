package com.micahscomputers;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.micahscomputers.items.wizardsStaff;

public class customItemHandler implements Listener {
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack heldItem = player.getInventory().getItemInMainHand();

        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            String itemName = heldItem.getItemMeta().getDisplayName();
            String wizardsStaffSfxCmd = "playsound minecraft:entity.enderman.teleport player " + player.getName();
            if (itemName != null) {
                if (itemName.equals(wizardsStaff.wizardsStaff.getItemMeta().getDisplayName())) {
                    List<Block> sight = player.getLineOfSight(null, 7);
                    Location loc = player.getLocation();
                    org.bukkit.util.Vector dir = loc.getDirection();
                    boolean blockInPath = false;
                    dir.normalize();
                    dir.multiply(7);
                    loc.add(dir);
                    for (Block block : sight) {
                        if (block.getType() != Material.AIR) {
                            blockInPath = true;
                        }
                    }
                    
                    Location block = new Location(loc.getWorld(), loc.getX(), loc.getY()-1, loc.getZ());

                    if (blockInPath || block.getBlock().getType() != Material.AIR ) {
                        player.sendMessage("§cThere is a block in the way!");
                        //player.sendMessage("Targeted block(s): " + loc.getX() + ", " + loc.getY() + ", " + loc.getZ() + ", And: " + block.getX() + ", " + block.getY() + ", " + block.getZ());
                        //loc.getBlock().setType(Material.BEDROCK);
                        //block.getBlock().setType(Material.BEDROCK);
                    } else {
                        Bukkit.dispatchCommand(player, wizardsStaffSfxCmd);
                        player.teleport(loc);
                    }
                }
            }
        }
    }
}
