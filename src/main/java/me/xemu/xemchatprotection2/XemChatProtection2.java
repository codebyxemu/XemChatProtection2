/*
Plugin Developed & Maintained by Xemu
 */
package me.xemu.xemchatprotection2;

import org.bukkit.plugin.java.JavaPlugin;

public final class XemChatProtection2 extends JavaPlugin 
{

    private static XemChatProtection2 instance;
    public static XemChatProtection2 getInstance()
    {
        return instance;
    };

    @Override public void onEnable()
    {
        instance = this;
        getLogger().info("Plugin Enabled");
    };

    @Override public void onDisable() 
    {
        instance = null;
        getLogger().info("Plugin Disabled");
    };
    
};
