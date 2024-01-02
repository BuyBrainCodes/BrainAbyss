package xyz.dwaslashe.abyss.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import xyz.dwaslashe.abyss.Main;
import xyz.dwaslashe.abyss.objects.Abyss;
import xyz.dwaslashe.abyss.tasks.AbyssTask;
import xyz.dwaslashe.abyss.utils.Api;

public class AbyssCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission(Main.pluginConfig.getMessages().getCommand().getAbyssreloadpermission())) {
                    Api.sendMessage(sender, Main.pluginConfig.getMessages().getCommand().getAbyssreload());
                    Main.pluginConfig.load();
                    return false;
                } else {
                    Api.sendMessage(sender, Main.pluginConfig.getMessages().getCommand().getAbyssreloadnopermission());
                    return false;
                }
            }
        }
        if (!AbyssTask.isOpened()) {
            Api.sendMessage(sender, Main.pluginConfig.getMessages().getCommand().getAbyssopen());
            return false;
        }
        if (AbyssTask.abyssList.isEmpty()) {
            Api.sendMessage(sender, Main.pluginConfig.getMessages().getCommand().getAbyssempty());
            return false;
        }
        Player p = (Player) sender;
        Abyss.get(0).open(p);
        return false;
    }
}
