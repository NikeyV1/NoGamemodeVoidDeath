package de.nikey.nogamemodevoiddeath;

import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player){
            Player p = (Player) entity;
            if (p.getGameMode() == GameMode.CREATIVE ||p.getGameMode() == GameMode.SPECTATOR){
                event.setCancelled(true);
            }
        }
    }
}
