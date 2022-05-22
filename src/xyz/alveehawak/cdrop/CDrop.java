package xyz.alveehawak.cdrop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class CDrop extends JavaPlugin {
    public static Plugin plugin;


    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"CDrop Turned On");
        plugin = this;
        getServer().getPluginManager().registerEvents(new MobDeath(), this);
    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"CDrop turned Off");
    }


}
