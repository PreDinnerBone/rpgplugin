package com.micahscomputers.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.micahscomputers.menuHandler;
import com.micahscomputers.items.adminWand;
import com.micahscomputers.items.deathripperDagger;
import com.micahscomputers.items.wizardsStaff;

public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giveadminwand")) {
            player.getInventory().addItem(adminWand.adminWand);
            sender.sendMessage("§4Gave " + sender.getName() + " the power to do good or evil");
        }

        if (cmd.getName().equalsIgnoreCase("givedagger")) {
            player.getInventory().addItem(deathripperDagger.deathripperDagger);
            sender.sendMessage("§4Gave " + sender.getName() + " a weapon worthy of the best");
        }
        if (cmd.getName().equalsIgnoreCase("givewizardsstaff")) {
            player.getInventory().addItem(wizardsStaff.wizardsStaff);
            sender.sendMessage("§4Gave " + sender.getName() + " an item that took too long to make");
        }
        if (cmd.getName().equalsIgnoreCase("openmenu")) {
            Player playerMenu = Bukkit.getPlayer(args[1].toString());
            menuHandler.displayMenu(playerMenu);
        }

        return true;
    }
    
}
