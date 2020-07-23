package me.superischroma.fx;

import me.superischroma.fx.config.Config;
import me.superischroma.fx.faction.Faction;
import me.superischroma.fx.service.FXService;
import me.superischroma.fx.service.FXServiceHandler;
import me.superischroma.fx.util.FLog;
import org.bukkit.plugin.java.JavaPlugin;

public final class FX extends JavaPlugin
{
    private static FX plugin;
    public static FX getPlugin()
    {
        return plugin;
    }

    public Config factions;

    public FXServiceHandler fsh;

    @Override
    public void onEnable()
    {
        plugin = this;
        factions = new Config("factions.yml");
        fsh = new FXServiceHandler();
        loadServices();
        loadCommands();
        Faction.createFaction("test faction penis");
        FLog.info("Enabled " + this.getDescription().getFullName());
    }

    @Override
    public void onDisable()
    {
        plugin = null;
        for (FXService service : fsh.getServices())
        {
            service.stop();
        }
        FLog.info("Disabled " + this.getDescription().getFullName());
    }

    private void loadServices()
    {
    }

    private void loadCommands()
    {

    }
}
