package com.sin.newt.services;

import com.sin.newt.models.Player;

import java.util.UUID;

public class PlayerService {
    // Player Model

    // New Player
    public Player CreatePlayer(){
        Player player = new Player("bob", 23, true);
        return player;
    }

    // Get Player
    public Player GetPlayer(UUID playerId) {
        return new Player("bob", 23, true);
    }

    // Save Player

    // Upgrade Player

    // Edit Player
    public Player EditPlayer(Player player){
        player.setName("Joe");
        player.setAge(34);
        player.setDm(false);

        return player;
    }

    // Delete Player
}

