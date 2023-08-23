package me.melchi.flyplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static java.lang.Float.parseFloat;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if(commandSender instanceof Player) {
            Player player = ((Player) commandSender).getPlayer();

            if(strings.length == 0) {

                FlyMethod(player);

            } else if(strings.length == 1){

                Player target = Bukkit.getPlayer(strings[0]);

                FlyMethod(target);

            }



        }



        return true;
    }

    private void FlyMethod(Player player) {

        if (player.getAllowFlight()) {

            player.setAllowFlight(false);

            player.sendMessage(" You’re not flying anymore");

        } else {

            player.setAllowFlight(true);

            player.sendMessage(" You're flying");

        }

    }




}
