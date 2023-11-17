package com.micahscomputers;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.ipvp.canvas.MenuFunctionListener;

import com.micahscomputers.commands.commands;
import com.micahscomputers.items.adminWand;
import com.micahscomputers.items.deathripperDagger;
import com.micahscomputers.items.wizardsStaff;

import net.jitse.npclib.NPCLib;

public class Plugin extends JavaPlugin{
    
    private static NPCLib npclibrary;

    public void onEnable() {
        npclibrary = new NPCLib(this);
        deathripperDagger.init();
        wizardsStaff.init();
        adminWand.init();
        getCommand("giveadminwand").setExecutor(new commands());
        getCommand("givedagger").setExecutor(new commands());
        getCommand("givewizardsstaff").setExecutor(new commands());
        getCommand("openmenu").setExecutor(new commands());
        getCommand("dialogue").setExecutor(new commands());
        Bukkit.getPluginManager().registerEvents(new customItemHandler(), this);
        Bukkit.getPluginManager().registerEvents(new MenuFunctionListener(), this);
        npcHandler.npcHandlerFunction();
    }
    public static NPCLib getNPCLib() {
        return npclibrary;
    }
    public void onDisable() {

    }
}
