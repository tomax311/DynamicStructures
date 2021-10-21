package castelcraft.dynamicstructures.commands;

import castelcraft.dynamicstructures.DynamicStructures;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            if(args.length > 0){
                int Food = Integer.parseInt(args[0]);
                p.setFoodLevel(Food);
                p.sendMessage(ChatColor.RED+ "thanks for using");
            }
            else {

                p.setFoodLevel(DynamicStructures.plugin.getConfig().getInt("Food"));
                p.sendMessage(ChatColor.RED+ "default food level added to your stomach.");

            }


        }

        return true;
    }
}



