package xyz.dwaslashe.abyss.utils;

import me.neznamy.tab.api.chat.rgb.RGBUtils;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.dwaslashe.abyss.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Api {

    public static String fixColor(String message) {
        RGBUtils rgbUtils = RGBUtils.getInstance();
        return message == null ? "" : ChatColor.translateAlternateColorCodes('&', rgbUtils.convertToBukkitFormat(message, true))
                .replace(">>", "»")
                .replace("<<", "«");
    }

    public static List<String> fixColor(List<String> message) {
        return message.stream().map(Api::fixColor).collect(Collectors.toList());
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(fixColor(message));
    }

    public static void sendLog(String message) {
        Bukkit.getConsoleSender().sendMessage(fixColor(message));
    }
    

    public static void sendBroadcast(String message) {
        if (Main.pluginConfig.getConfigureMessages().getChat().isEnable()) {
            Bukkit.getOnlinePlayers().forEach(player -> sendMessage(player, fixColor(message)));
        }
    }

    public static void sendActionBar(String message) {
        if (Main.pluginConfig.getConfigureMessages().getActionBar().isEnable()) {
            for (Player all : Bukkit.getOnlinePlayers()) {
                all.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(Api.fixColor(message)));
            }
        }
    }

    public static List<String> startsWith(List<String> subcommands, String start) {
        if (start != null && !start.equals("") && subcommands != null && !subcommands.isEmpty()) {
            ArrayList<String> startingStrings = new ArrayList<>();
            for (String subcommand : subcommands) {
                if (subcommand.regionMatches(true, 0, start, 0, start.length())) {
                    startingStrings.add(subcommand);
                }
            }

            return startingStrings;
        } else {
            return subcommands;
        }
    }

}