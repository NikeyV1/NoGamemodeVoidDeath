package de.nikey.nogamemodevoiddeath;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoGamemodeVoidDeath extends JavaPlugin {
    private static NoGamemodeVoidDeath plugin;

    @Override
    public void onEnable() {
        plugin = this;
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new Listener(),this);

    }

    @Override
    public void onDisable() {

    }

    public static NoGamemodeVoidDeath getPlugin() {
        return plugin;
    }
}
