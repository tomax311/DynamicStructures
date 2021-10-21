package castelcraft.dynamicstructures;

import castelcraft.dynamicstructures.commands.DieCommand;
import castelcraft.dynamicstructures.commands.FeedCommand;
import castelcraft.dynamicstructures.commands.GodCommand;
import castelcraft.dynamicstructures.commands.LoadSTRCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class DynamicStructures extends JavaPlugin {

    public static DynamicStructures plugin;
    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();

        System.out.println("DynamicStructures is running");

        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("die").setExecutor(new DieCommand());
        getCommand("loadstr").setExecutor(new LoadSTRCommand());



    }

    @Override
    public void onDisable() {
        System.out.println("DynamicStructures is stoping");
    }
}
