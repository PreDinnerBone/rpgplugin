package com.micahscomputers;

import org.bukkit.entity.Player;

public class dialogueHandler {

    public static void createDialogue(Player player, String sender) throws InterruptedException {
        player.sendMessage("§e[NPC] " + sender + ": " + "§fHow are you today?");
        Thread.sleep(2000);
        player.sendMessage("§e[NPC] " + sender + ": " + "§fI have this leftover sword, would you like it?");
        Thread.sleep(3000);
        menuHandler.displayMenu(player);
    }

    public static void sendDialogue(Player player) throws InterruptedException {
        createDialogue(player, "§eBlacksmith");
    }    
}
