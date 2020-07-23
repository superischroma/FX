package me.superischroma.fx;

import me.superischroma.fx.util.FLog;
import org.bukkit.plugin.java.JavaPlugin;

public final class FX extends JavaPlugin
{
    private static FX plugin;
    public static FX getPlugin()
    {
        return plugin;
    }

    @Override
    public void onEnable()
    {
        plugin = this;
        FLog.info("Enabled " + this.getDescription().getFullName());
    }

    @Override
    public void onDisable()
    {
        plugin = null;
        FLog.info("Disabled " + this.getDescription().getFullName());
    }

    private void loadListeners()
    {

    }

    private void loadCommands()
    {

    }
}
