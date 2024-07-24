package be.realpotr.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AtoutsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            sender.sendMessage("Ouverture des atouts");
        } else {
            sender.sendMessage("Cette commande ne peut être exécutée que par un joueur.");
        }



        return true;
    }

}