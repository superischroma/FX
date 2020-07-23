package me.superischroma.fx.service;

import me.superischroma.fx.FX;
import org.bukkit.event.Listener;

public abstract class FXService implements Listener
{
    protected final FX plugin;

    public FXService()
    {
        plugin = FX.getPlugin();
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        plugin.fsh.add(this);
    }

    public abstract void start();
    public abstract void stop();
}