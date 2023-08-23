package me.melchi.flyplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Speed implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {



        int sp = 0;

        if(!(commandSender instanceof Player))return false;


            Player player = ((Player) commandSender).getPlayer();

            if (!(player.hasPermission("flyplugin.speed")))return false;

            if(strings.length == 0) {

                player.sendMessage("Inserire un valore alla speed");

                return true;

            }


            if (strings.length == 1) {

                try {

                    sp = Integer.parseInt(strings[0]);

                } catch (NumberFormatException e) {

                    player.sendMessage("Inserire un valore valido");

                    return false;

                }


                if (sp >= 0 && sp <= 10) {

                    if (player.isFlying()) {

                        player.setFlySpeed((float) sp / 10);

                        player.sendMessage(ChatColor.DARK_GREEN + "Sei ipersonico fra a velocità " + ChatColor.GREEN + sp);

                    } else {

                        player.setWalkSpeed((float) sp / 10);
                        player.sendMessage(ChatColor.DARK_GREEN + " Sei flash fra a velocità " + ChatColor.GREEN + sp);

                    }

                } else {

                    player.sendMessage("Inserire un valore compreso tra 1 e 10");
                    return false;

                }

            } else if(strings.length == 2) {

                Player target = Bukkit.getPlayer(strings[0]);

                try {

                    sp = Integer.parseInt(strings[1]);

                } catch (NumberFormatException e) {

                    player.sendMessage("Inserire un valore valido");

                    return false;

                }

                if (sp >= 0 && sp <= 10) {

                    if (target.isFlying()) {

                        target.setFlySpeed((float) sp / 10);

                        target.sendMessage(ChatColor.DARK_GREEN + "Sei ipersonico fra a velocità " + ChatColor.GREEN + sp);

                    } else {

                        target.setWalkSpeed((float) sp / 10);
                        target.sendMessage(ChatColor.DARK_GREEN + " Sei flash fra a velocità " + ChatColor.GREEN + sp);

                    }

                } else {

                    player.sendMessage("Inserire un valore compreso tra 1 e 10");
                    return false;

                }

            }


        return true;
    }


}
