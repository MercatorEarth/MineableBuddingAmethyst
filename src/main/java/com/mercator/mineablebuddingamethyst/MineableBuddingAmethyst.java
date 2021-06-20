package com.mercator.mineablebuddingamethyst;

import org.bukkit.plugin.java.JavaPlugin;

public final class MineableBuddingAmethyst extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockBreakHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
