package me.cotopes.joinlug;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.checkerframework.common.returnsreceiver.qual.This;

public class joinleavelistener implements Listener {

    @EventHandler
    public void leaveplayer(PlayerQuitEvent event){

        Player player = event.getPlayer();
        event.setQuitMessage(player.getName() + " покинул сервер.");
    }

    @EventHandler
    public void JoinPlayer(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if(player.hasPlayedBefore()){
            event.setJoinMessage(ChatColor.YELLOW + player.getName() + ChatColor.GREEN + "" + ChatColor.BOLD + " присоеденился к серверу!");
        }
        else{
            event.setJoinMessage(ChatColor.GOLD + "" + ChatColor.BOLD + player.getName() + ChatColor.RESET + "" + ChatColor.GREEN + " впервые присоеденился к нам!");
        }
    }
}
