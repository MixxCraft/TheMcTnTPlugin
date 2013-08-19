/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mctnt.plugin.util;

import com.mctnt.plugin.core.TheMcTnTPlugin;
import com.mewin.WGCustomFlags.WGCustomFlagsPlugin;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.bukkit.plugin.Plugin;

/**
 *
 * @author Harry5573
 */
public class WorldGuardUtils {

    public static WGCustomFlagsPlugin getWGCustomFlags(TheMcTnTPlugin plugin) {
        Plugin wgcf = plugin.getServer().getPluginManager().getPlugin("WGCustomFlags");
        if ((wgcf == null) || (!(wgcf instanceof WGCustomFlagsPlugin))) {
            return null;
        }
        return (WGCustomFlagsPlugin) wgcf;
    }

    public static WorldGuardPlugin getWorldGuard(TheMcTnTPlugin plugin) {
        Plugin wg = plugin.getServer().getPluginManager().getPlugin("WorldGuard");
        if ((wg == null) || (!(wg instanceof WorldGuardPlugin))) {
            return null;
        }
        return (WorldGuardPlugin) wg;
    }
}
