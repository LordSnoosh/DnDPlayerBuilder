package com.sin.newt;


import com.sin.newt.models.*;
import com.sin.newt.services.PlayerService;

public class Main {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        Player player = playerService.CreatePlayer();
        // edit player
        playerService.EditPlayer(player);
        //
        player.getName();
        player.getAge();
        player.getDm();
        player.getPlayerId();

    }


}
