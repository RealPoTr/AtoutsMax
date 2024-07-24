package be.realpotr;

import org.bukkit.plugin.java.JavaPlugin;

public final class AtoutsMax extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AtoutsMax est activé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("AtoutsMax est désactivé !");
    }

}