package net.experience.powered.exampleaddon;

import net.experience.powered.staffprotect.StaffProtect;
import net.experience.powered.staffprotect.StaffProtectProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class APIUtil {
    public static @NotNull StaffProtect getInstance() {
        @NotNull Optional<StaffProtect> provider = StaffProtectProvider.getInstance();
        if (provider.isEmpty()) {
            throw new NullPointerException("Plugin was not initialized"); // This should not happen
        }
        return provider.get();
    }
}
