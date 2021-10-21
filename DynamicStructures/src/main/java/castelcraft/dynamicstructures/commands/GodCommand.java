package castelcraft.dynamicstructures.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player ){

            Player p = (Player) sender;

            if (p.isInvulnerable()){

                p.setInvulnerable(false);
                p.sendMessage("you are now vulnarable");

            }

            else{

                p.setInvulnerable(true);
                p.sendMessage("you are invulnarable");

            }
        }

        return true;
    }
}
