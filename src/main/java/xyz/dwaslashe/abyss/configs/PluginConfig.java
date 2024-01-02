package xyz.dwaslashe.abyss.configs;

import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.*;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;

import java.util.Arrays;
import java.util.List;

@Getter @Setter
@Header("#")
@Header("#By dwaslashe and WuShei")
@Header("#Contact discord dwaslashe v2#5620")
@Header("#")
@Header("#Team BrainCodes")
@Header("#")
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class PluginConfig extends OkaeriConfig {

    private License license = new License();
    private Messages messages = new Messages();
    private ConfigureMessages configureMessages = new ConfigureMessages();

    //License
    @Getter @Setter
    @Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
    public static class License extends OkaeriConfig {

        @Comment("#You will get the licenses on our discord when you buy the plugin")
        private String license = "";
    }

    //Messages
    @Getter @Setter
    @Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
    public static class Messages extends OkaeriConfig {

        @Comment("#Time is in seconds")
        private int abysstime = 900;

        @Comment("#Abyss Announcements (RGB colors are supported on versions 1.9+)")
        private String abyssmessagemoved = "&#FFD700&lOTCHŁAŃ &8>> &aPrzeniesiono &e{MOVED} &aprzedmiotów do otchłani!";
        private String abyssmessageopentime = "&#FFD700&lOTCHŁAŃ &8>> &aOtchłan zostanie otwarta za &e{TIME}";
        private String abyssmessageopen = "&#FFD700&lOTCHŁAŃ &8>> &aOtchlan została otwarta &e/otchlan";
        private String abyssmessageclose = "&#FFD700&lOTCHŁAŃ &8>> &cOtchlan zostala zamknieta!";
        private String abyssmessagetime = "&#FFD700&lOTCHŁAŃ &8>> &aPrzedmioty zostaną przeniesione do otchłani za &e";

        private Command command = new Command();

        @Getter @Setter
        public static class Command extends OkaeriConfig {

            @Comment("#Command messages")
            private String abyssopen = " &8>> &cOtchłań jest zamknięta";
            private String abyssempty = " &8>> &cOtchłań jest pusta";
            private String abyssreload = " &8>> &aPomyślnie przeładowałeś &eplugin!";
            private String abyssreloadnopermission = " &8>> &cNie posiadasz do tego permisji! &8(&ebrainabyss.command.reload&8)";
            private String abyssreloadpermission = "brainabyss.command.reload";
        }

        private Gui gui = new Gui();

        @Getter @Setter
        public static class Gui extends OkaeriConfig {

            private String title = "Otchlan - Strona ";

            private Nextpage nextpage = new Nextpage();

            @Getter @Setter
            public static class Nextpage extends OkaeriConfig {

                private String name = "&eNastepna strona";
                private List<String> lore = Arrays.asList(" ", " &f&nKliknij aby przejść na nastepną strone!");
            }

            private Nullpage nullpage = new Nullpage();

            @Getter @Setter
            public static class Nullpage extends OkaeriConfig {

                private String name = "&cBrak kolejnej strony";
                private List<String> lore = Arrays.asList(" ");
            }

            private Previouspage previouspage = new Previouspage();

            @Getter @Setter
            public static class Previouspage extends OkaeriConfig {

                private String name = "&ePoprzednia strona";
                private List<String> lore = Arrays.asList(" ", " &f&nKliknij aby przejść na poprzednią strone!");
            }

            private Nullpreviouspage nullpreviouspage = new Nullpreviouspage();

            @Getter @Setter
            public static class Nullpreviouspage extends OkaeriConfig {

                private String name = "&cBrak poprzedniej strony";
                private List<String> lore = Arrays.asList(" ");
            }

            private Glass glass = new Glass();

            @Getter @Setter
            public static class Glass extends OkaeriConfig {

                private Material material = Material.BLACK_STAINED_GLASS_PANE;
                private String name = "&r ";
                private List<String> lore = Arrays.asList(" ");
            }
        }
    }

    //Configure Messages
    @Getter @Setter
    @Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
    public static class ConfigureMessages extends OkaeriConfig {

        private Chat chat = new Chat();

        @Getter @Setter
        public static class Chat extends OkaeriConfig {

            private boolean enable = true;
        }

        private ActionBar actionBar = new ActionBar();

        @Getter @Setter
        public static class ActionBar extends OkaeriConfig {

            private boolean enable = true;
        }
    }
}
