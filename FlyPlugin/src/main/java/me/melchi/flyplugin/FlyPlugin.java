package me.melchi.flyplugin;

import me.melchi.flyplugin.commands.FlyCommand;
import me.melchi.flyplugin.commands.Speed;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class FlyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic



            getCommand("fly").setExecutor(new FlyCommand());

        try {
            getCommand("speed").setExecutor(new Speed());

        }catch (NullPointerException e) {

            System.out.println("NON FUNGEEEEEEEEEEEEEEEEE");


        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
