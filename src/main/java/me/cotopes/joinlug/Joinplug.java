package me.cotopes.joinlug;

import org.bukkit.plugin.java.JavaPlugin;

public final class Joinplug extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new joinleavelistener(), this);
    }
}