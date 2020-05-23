package com.markcamp.VirtualRunewarsServer.server;

import com.markcamp.VirtualRunewarsServer.model.Game;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GameServer {

    private static GameServer gameServer;

    private Map<String,Game> gameMap;

    private GameServer()
    {
        gameMap = new HashMap<String,Game>();
    }

    public synchronized static GameServer getGameServer()
    {
        if (gameServer == null)
        {
            gameServer = new GameServer();
        }

        return gameServer;
    }

    public Collection<Game> getGames()
    {
        return gameMap.values();
    }
    public Game createGame(String name)
    {
        Game game = new Game(name);
        gameMap.put(name,game);
        return game;
    }
    public Game getGame(String name)
    {
        Game game = gameMap.get(name);
        return game;
    }



}
