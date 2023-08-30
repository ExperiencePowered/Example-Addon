package net.experience.powered.exampleaddon;

import net.experience.powered.staffprotect.addons.MinecraftCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ExampleCommand extends MinecraftCommand {
    public ExampleCommand() {
        super("example");
    }

    @Override
    public boolean execute(final @NotNull CommandSender sender, final @NotNull String commandLabel, final @NotNull String[] args) {
        if (sender.hasPermission("example.boo")) {
            sender.sendMessage("You do have example.boo permision.");
            return true;
        }
        sender.sendMessage("You do not have example.boo permission.");
        return false;
    }

    @Override
    public @NotNull List<String> tabComplete(final @NotNull CommandSender sender, final @NotNull String alias, final @NotNull String @NotNull [] args) throws IllegalArgumentException {
        return StringUtil.copyPartialMatches(args[0], new ArrayList<>(), new ArrayList<>()); // Shows nothing
    }
}
