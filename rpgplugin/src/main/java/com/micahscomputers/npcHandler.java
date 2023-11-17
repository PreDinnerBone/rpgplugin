package com.micahscomputers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.jitse.npclib.NPCLib;
import net.jitse.npclib.api.NPC;

public class npcHandler {

    private static final Location location = new Location(Bukkit.getWo, 0, 0, 0);
    private static NPCLib npclibrary = Plugin.getNPCLib();
    public static void npcHandlerFunction() { 
        List<String> nametag = new ArrayList<>();
        nametag.add("cat");
        NPC npc = npclibrary.createNPC(nametag);
        npc.setLocation(Location location);
        npc.create(); // Generates the packets.
        Player player = Bukkit.getPlayer("MinerJacob");
        npc.show(player);
    }
}
