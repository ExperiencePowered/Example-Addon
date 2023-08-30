package net.experience.powered.exampleaddon;

import net.experience.powered.staffprotect.addons.MinecraftListener;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class ExampleListener extends MinecraftListener {
    @EventHandler
    public void onPlayerJoin(final @NotNull PlayerJoinEvent e) {
        Bukkit.getLogger().info("Welcome player " + e.getPlayer().getName());
    }
}
