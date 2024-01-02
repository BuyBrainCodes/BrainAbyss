package xyz.dwaslashe.abyss.objects;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import xyz.dwaslashe.abyss.Main;
import xyz.dwaslashe.abyss.tasks.AbyssTask;
import xyz.dwaslashe.abyss.utils.ItemApi;
import java.util.HashMap;
import java.util.Map;

public class Abyss {

    private static Map<String, Abyss> openAbyssMap = new HashMap<>();

    public static Map<String, Abyss> getOpenAbyssMap() {
        return openAbyssMap;
    }

    private int page;
    private Inventory inventory;

    public Abyss(int page) {
        this.page = page;
        this.inventory = Bukkit.createInventory(null, 5 * 9, Main.pluginConfig.getMessages().getGui().getTitle() + page);
        this.inventory.setItem(inventory.getSize() - 9, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 8, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 7, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 6, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 5, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 4, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        this.inventory.setItem(inventory.getSize() - 3, new ItemApi(Main.pluginConfig.getMessages().getGui().getGlass().getMaterial()).setName(Main.pluginConfig.getMessages().getGui().getGlass().getName()).setLore(Main.pluginConfig.getMessages().getGui().getGlass().getLore()).getItemStack());
        update();
    }

    private void update() {
        if (AbyssTask.abyssList.size() > page + 1) {
            this.inventory.setItem(inventory.getSize() - 1, new ItemApi(Material.PLAYER_HEAD, 1, (short) 3)
                    .setOwnerURL("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTliZjMyOTJlMTI2YTEwNWI1NGViYTcxM2FhMWIxNTJkNTQxYTFkODkzODgyOWM1NjM2NGQxNzhlZDIyYmYifX19")
                    .setName(Main.pluginConfig.getMessages().getGui().getNextpage().getName())
                    .setLore(Main.pluginConfig.getMessages().getGui().getNextpage().getLore())
                    .getItemStack());
        } else {
            this.inventory.setItem(inventory.getSize() - 1, new ItemApi(Material.PLAYER_HEAD, 1, (short) 3)
                    .setOwnerURL("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZkMWZhYmRmM2UzNDI2NzFiZDlmOTVmNjg3ZmUyNjNmNDM5ZGRjMmYxYzllYThmZjE1YjEzZjFlN2U0OGI5In19fQ==")
                    .setName(Main.pluginConfig.getMessages().getGui().getNullpage().getName())
                    .setLore(Main.pluginConfig.getMessages().getGui().getNullpage().getLore())
                    .getItemStack());
        }
        if (page > 0) {
            this.inventory.setItem(inventory.getSize() - 2, new ItemApi(Material.PLAYER_HEAD, 1, (short) 3)
                    .setOwnerURL("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ==")
                    .setName(Main.pluginConfig.getMessages().getGui().getPreviouspage().getName())
                    .setLore(Main.pluginConfig.getMessages().getGui().getPreviouspage().getLore())
                    .getItemStack());
        } else {
            this.inventory.setItem(inventory.getSize() - 2, new ItemApi(Material.PLAYER_HEAD, 1, (short) 3)
                    .setOwnerURL("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZkMWZhYmRmM2UzNDI2NzFiZDlmOTVmNjg3ZmUyNjNmNDM5ZGRjMmYxYzllYThmZjE1YjEzZjFlN2U0OGI5In19fQ==")
                    .setName(Main.pluginConfig.getMessages().getGui().getNullpreviouspage().getName())
                    .setLore(Main.pluginConfig.getMessages().getGui().getNullpreviouspage().getLore())
                    .getItemStack());
        }
    }

    public void open(Player player){
        Abyss.getOpenAbyssMap().put(player.getName(), this);
        update();
        player.openInventory(inventory);
    }

    public void onAbyssClick(InventoryClickEvent event){
        Inventory inventory = event.getInventory();
        if(event.getSlot() < inventory.getSize()-9) return;
        event.setCancelled(true);
        if(event.getSlot() == inventory.getSize()-1){
            if(exists(page+1)) {
                event.getWhoClicked().closeInventory();
                get(page + 1).open((Player) event.getWhoClicked());
            }
        } else if(event.getSlot() == inventory.getSize()-2){
            if(exists(page-1)){
                event.getWhoClicked().closeInventory();
                get(page - 1).open((Player) event.getWhoClicked());
            }
        }
    }

    public static Abyss createFirst(){
        return AbyssTask.abyssList.computeIfAbsent(0, Abyss::new);
    }

    public static boolean exists(int page){
        return AbyssTask.abyssList.containsKey(page);
    }

    public static Abyss get(int page){
        return AbyssTask.abyssList.get(page);
    }

    public void addItem(ItemStack itemStack) {
        inventory.addItem(itemStack).forEach((slot, stack) -> AbyssTask.abyssList.computeIfAbsent(page + 1, Abyss::new).addItem(itemStack));
    }
}
