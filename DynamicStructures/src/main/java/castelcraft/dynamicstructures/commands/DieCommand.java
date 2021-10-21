package castelcraft.dynamicstructures.commands;

import castelcraft.dynamicstructures.DynamicStructures;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DieCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (command.getName().equalsIgnoreCase("die")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED+ DynamicStructures.plugin.getConfig().getString("DeadMessage"));

            }

        }
        return true;
    }
}
