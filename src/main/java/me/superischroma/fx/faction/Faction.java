package me.superischroma.fx.faction;

import lombok.Getter;
import me.superischroma.fx.FX;
import me.superischroma.fx.util.FLog;
import me.superischroma.fx.util.FUtil;

public class Faction
{
    private static FX plugin = FX.getPlugin();

    @Getter
    private String identifier;

    @Getter
    private String name;

    private Faction(String identifier, String name)
    {
        this.identifier = identifier;
        this.name = name;
    }

    public void save()
    {
        plugin.factions.set(identifier + ".name", name);
        plugin.factions.save();
    }

    public static Faction getFactionByIdentifier(String identifier)
    {
        if (!plugin.factions.contains(identifier))
            return null;
        return new Faction(identifier, plugin.factions.getString(identifier + "name"));
    }

    public static Faction getFactionByName(String name)
    {
        if (!plugin.factions.contains(FUtil.flatten(name)))
            return null;
        return new Faction(FUtil.flatten(name), name);
    }

    public static Faction createFaction(String name)
    {
        Faction faction = new Faction(FUtil.flatten(name), name);
        faction.save();
        FLog.info("New YAML section created for faction: " + name);
        return faction;
    }
}