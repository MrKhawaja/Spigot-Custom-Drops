package xyz.alveehawak.cdrop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class CDrop extends JavaPlugin {
    public static Plugin plugin;


    public CDrop() {
    }

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"EEEEEE primeedge er Cdrop plugin on hoise");
        plugin = this;
        getServer().getPluginManager().registerEvents(new MobDeath(), this);
    }

    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"PixelCDrop Off hoilo");
    }


}
