package xyz.dwaslashe.abyss;

import eu.okaeri.configs.ConfigManager;
import eu.okaeri.configs.yaml.bukkit.YamlBukkitConfigurer;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.dwaslashe.abyss.commands.AbyssCommand;
import xyz.dwaslashe.abyss.configs.PluginConfig;
import xyz.dwaslashe.abyss.listeners.AbyssListener;
import xyz.dwaslashe.abyss.tasks.AbyssTask;
import xyz.dwaslashe.abyss.utils.LicenseApi;

import java.io.File;

@Getter @Setter
public class Main extends JavaPlugin {

    public static PluginConfig pluginConfig;

    public static Main main;

    public static Main getMain() {
        return main;
    }

    public Main() {
        main = this;
    }

    @Override
    public void onDisable() {
        //It's nothing to add
    }

    @Override
    public void onEnable() {
        pluginConfig = ConfigManager.create(PluginConfig.class, it -> {
            it.withConfigurer(new YamlBukkitConfigurer());
            it.withBindFile(new File(this.getDataFolder(), "config.yml"));
            it.saveDefaults();
            it.load(true);
        });

        pluginConfig.load();

        //if (!new LicenseApi(pluginConfig.getLicense().getLicense(), "https://buybrain.pl/license/verify.php", this).register()) return;

        Bukkit.getPluginManager().registerEvents(new AbyssListener(), this);
        new AbyssTask(this);
        getCommand("abyss").setExecutor(new AbyssCommand());
    }

}
