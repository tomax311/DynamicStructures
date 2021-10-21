package castelcraft.dynamicstructures.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public  class LoadSTRCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;

            if(args.length > 0){


            }
            else {

                p.sendMessage(ChatColor.RED+ "You need to set the structure name !");

            }


        }

        return true;
    }

}
