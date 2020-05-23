package com.markcamp.VirtualRunewarsServer.controller;

import com.markcamp.VirtualRunewarsServer.model.Game;
import com.markcamp.VirtualRunewarsServer.model.Player;
import com.markcamp.VirtualRunewarsServer.server.GameServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameServer gameServer;

    @GetMapping("/game/create")
    public Game gameCreate(@RequestParam(value = "gameName") String gameName)
    {
        Game newGame = gameServer.createGame(gameName);
        return newGame;
    }

    @GetMapping("/game/list")
    public Collection<Game> gameList()
    {
        Collection<Game> games = gameServer.getGames();

        return games;
    }


    @GetMapping("/game/view")
    public Game gameView()
    {
        return new Game("Mark");
    }

}
