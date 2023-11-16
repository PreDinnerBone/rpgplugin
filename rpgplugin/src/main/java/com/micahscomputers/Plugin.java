package com.micahscomputers;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.ipvp.canvas.MenuFunctionListener;

import com.micahscomputers.commands.commands;
import com.micahscomputers.items.adminWand;
import com.micahscomputers.items.deathripperDagger;
import com.micahscomputers.items.wizardsStaff;

public class Plugin extends JavaPlugin{
    
    public void onEnable() {
        deathripperDagger.init();
        wizardsStaff.init();
        adminWand.init();
        getCommand("giveadminwand").setExecutor(new commands());
        getCommand("givedagger").setExecutor(new commands());
        getCommand("givewizardsstaff").setExecutor(new commands());
        getCommand("openmenu").setExecutor(new commands());
        getServer().getPluginManager().registerEvents(new customItemHandler(), this);
        Bukkit.getPluginManager().registerEvents(new MenuFunctionListener(), this);
    }
    public void onDisable() {

    }
}
