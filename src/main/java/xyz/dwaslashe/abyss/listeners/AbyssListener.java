package xyz.dwaslashe.abyss.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import xyz.dwaslashe.abyss.objects.Abyss;

import java.util.Optional;

public class AbyssListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onClickAbyss(InventoryClickEvent e) {
        if(e.getCurrentItem() == null) return;
        Optional.ofNullable(Abyss.getOpenAbyssMap().get(e.getWhoClicked().getName())).ifPresent(abyss -> abyss.onAbyssClick(e));
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onCloseAbyss(InventoryCloseEvent e) {
        Optional.ofNullable(Abyss.getOpenAbyssMap().get(e.getPlayer().getName())).ifPresent(abyss -> Abyss.getOpenAbyssMap().remove(e.getPlayer().getName()));
    }
}
