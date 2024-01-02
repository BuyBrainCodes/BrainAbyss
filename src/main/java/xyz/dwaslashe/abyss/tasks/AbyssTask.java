package xyz.dwaslashe.abyss.tasks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import xyz.dwaslashe.abyss.Main;
import xyz.dwaslashe.abyss.configs.PluginConfig;
import xyz.dwaslashe.abyss.objects.Abyss;
import xyz.dwaslashe.abyss.utils.Api;
import xyz.dwaslashe.abyss.utils.BossBarApi;

import java.util.HashMap;
import java.util.Map;

public class AbyssTask extends BukkitRunnable {

    private static int time = Main.pluginConfig.getMessages().getAbysstime();

    private static boolean opened = false;

    public static Map<Integer, Abyss> abyssList = new HashMap<>();

    private Main plugin;

    public AbyssTask(Main plugin) {
        this.plugin = plugin;
        runTaskTimer(plugin, 0L, 20L);
    }

    public static boolean isOpened() {
        return opened;
    }

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        AbyssTask.time = time;
    }

    @Override
    public void run() {
        setTime(getTime() - 1);
        if (getTime() == 900) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 minut");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 minut");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 minut");
        } else if (getTime() == 600) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "10 minut");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "10 minut");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() +  "10 minut");
        } else if (getTime() == 300) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 minut");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 minut");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 minut");
        } else if (getTime() == 120) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 minuty");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 minuty");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 minuty");
        } else if (getTime() == 30) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "30 sekund");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "30 sekund");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "30 sekund");
        } else if (getTime() == 15) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 sekund");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 sekund");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "15 sekund");
        } else if (getTime() == 5) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 sekund");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 sekund");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "5 sekund");
        } else if (getTime() == 3) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "3 sekundy");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "3 sekundy");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "3 sekund");
        } else if (getTime() == 2) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 sekundy");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 sekundy");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "2 sekund");
        } else if (getTime() == 1) {
            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagetime() + "1 sekundy");
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagetime() + "1 sekundy");
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagetime() + "1 sekunde");
        } else if (getTime() == 0) {
            abyssList.clear();

            int[] moved = new int[]{0};

            Bukkit.getWorlds().forEach(world -> world.getEntities().forEach(entity -> {
                if(entity instanceof Item){
                    Item item = (Item) entity;
                    ItemStack itemStack = item.getItemStack();
                    moved[0] += itemStack.getAmount();
                    Abyss.createFirst().addItem(itemStack);
                    entity.remove();
                }
            }));


            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessagemoved().replace("{MOVED}", String.valueOf(moved[0] + 1)));
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessagemoved().replace("{MOVED}", String.valueOf(moved[0] + 1)));
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColormoved(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylemoved(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessagemoved().replace("{MOVED}", String.valueOf(ref.moved)));

            Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessageopentime().replace("{TIME}", "5 sekund"));
            Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessageopentime().replace("{TIME}", "5 sekund"));
            //BossBarApi.sendGlobal(
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorwait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getStylewait(),
            //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
            //        Main.pluginConfig.getMessages().getAbyssmessageopentime().replace("{TIME}", "5 sekund"));
            Bukkit.getScheduler().runTaskLater(this.plugin, () -> {
                AbyssTask.opened = true;
                Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessageopen());
                Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessageopen());
                //BossBarApi.sendGlobal(
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getColoropen(),
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getStyleopen(),
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
                //        Main.pluginConfig.getMessages().getAbyssmessageopen());
            },  5 * 20L);
            Bukkit.getScheduler().runTaskLater(this.plugin, () -> {
                AbyssTask.opened = false;
                AbyssTask.setTime(320);
                Api.sendBroadcast(Main.pluginConfig.getMessages().getAbyssmessageclose());
                Api.sendActionBar(Main.pluginConfig.getMessages().getAbyssmessageclose());
                //BossBarApi.sendGlobal(
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getColorclose(),
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getStyleclose(),
                //        Main.pluginConfig.getConfigureMessages().getBossBar().getTime(),
                //        Main.pluginConfig.getMessages().getAbyssmessageclose());
            },  60 * 20L);
        }
    }
}
