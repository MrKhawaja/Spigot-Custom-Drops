package xyz.alveehawak.cdrop;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class MobDeath implements Listener {
    @EventHandler
    public void onPlayerJoin(EntityDeathEvent event) {
        LivingEntity mob = event.getEntity();
        if(mob instanceof Witch){
            event.getDrops().add(new ItemStack(Material.EMERALD, 4));
            event.getDrops().add(new ItemStack(Material.SULPHUR, 3));
        }else if(mob instanceof Villager){
            event.getDrops().add(new ItemStack(Material.EMERALD, 2));
        }
    }
}
