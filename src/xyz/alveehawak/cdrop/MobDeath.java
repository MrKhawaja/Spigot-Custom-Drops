package xyz.alveehawak.cdrop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobDeath implements Listener {
    @EventHandler
    public void onPlayerJoin(EntityDeathEvent event) {
        Integer id = event.getEntity().getEntityId();
        event.getEntity().getKiller().sendMessage(id.toString());
    }
}