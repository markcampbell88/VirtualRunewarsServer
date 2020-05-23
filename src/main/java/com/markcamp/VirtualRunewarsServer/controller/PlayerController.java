package com.markcamp.VirtualRunewarsServer.controller;

import com.markcamp.VirtualRunewarsServer.model.Game;
import com.markcamp.VirtualRunewarsServer.model.Player;
import com.markcamp.VirtualRunewarsServer.server.GameServer;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PlayerController {

    @Autowired
    GameServer gameServer;

    @GetMapping("/game/playerlist")
    public Collection<Player> getPlayerList(@RequestParam(value = "gameName") String gameName)
    {
        Game game = gameServer.getGame(gameName);
        Collection<Player> players = game.getPlayers();

        return players;
    }

    @GetMapping("/game/addplayer")
    public Player addPlayer(@RequestParam(value = "gameName") String gameName,@RequestParam(value = "playerName") String playerName)
    {
        Game game = gameServer.getGame(gameName);
        Player player = game.addPlayer(playerName);

        return player;
    }

}
