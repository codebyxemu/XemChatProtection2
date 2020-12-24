/*
Plugin Developed & Maintained by Xemu
 */
package me.xemu.xemchatprotection2.checks;

import me.xemu.xemchatprotection2.XemChatProtection2;

public final class Checker
{

    public boolean checkSwearing(String message)
    {
        for (String s : XemChatProtection2.getInstance().getConfig().getStringList("Swearing.Words"))
        {
            if(message.toLowerCase().contains(s) || message.toLowerCase().contentEquals(s))
            {
                  return true;
            };
        };

        return false;
    };

    public boolean checkUnicode(String message)
    {
        
    };

};