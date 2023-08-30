package net.experience.powered.exampleaddon;

import net.experience.powered.staffprotect.addons.AbstractAddon;
import net.experience.powered.staffprotect.addons.AddonManager;
import net.experience.powered.staffprotect.addons.MinecraftScheduler;
import org.bukkit.Bukkit;

public final class Example_Addon extends AbstractAddon {

    @Override
    public void onLoad() {
        Bukkit.getLogger().info("Loaded ExampleAddon");
    }

    @Override
    public void onUnload() {
        Bukkit.getLogger().info("Unloaded ExampleAddon");
    }

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabled ExampleAddon");

        // Example use of scheduler
        MinecraftScheduler scheduler = getScheduler();
        scheduler.runTaskLater(() -> {
            Bukkit.getLogger().info("Disabling ExampleAddon after 5 seconds");
            // How to get addon manager
            AddonManager manager = getAPI().getAddonManager();
            manager.disable(this);
        }, 100L);

        // Example use of registering command
        boolean registered = registerCommand(new ExampleCommand());
        if (registered) {
            Bukkit.getLogger().info("Successfully registered command.");
        }

        // Example use of registering listener
        registerListener(new ExampleListener());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabled ExampleAddon");
    }
}
