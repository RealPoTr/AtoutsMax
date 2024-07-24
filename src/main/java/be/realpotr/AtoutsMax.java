package be.realpotr;

import be.realpotr.commands.AtoutsCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AtoutsMax extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AtoutsMax est activé !");
        getCommand("atouts").setExecutor(new AtoutsCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("AtoutsMax est désactivé !");
    }

}