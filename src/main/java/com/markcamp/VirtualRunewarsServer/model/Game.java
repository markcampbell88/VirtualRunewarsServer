package com.markcamp.VirtualRunewarsServer.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;

public class Game {

    @Getter
    @Setter
    private String ID;

    @Getter
    @Setter
    private String name;

    private HashMap<String,Player> playerMap;

    public Game(String name)
    {
        this.name = name;
        this.playerMap = new HashMap<String,Player>();
    }

    public Player addPlayer(String name)
    {
        Player player = new Player(name);
        playerMap.put(name,player);
        return player;
    }
    public Collection<Player> getPlayers()
    {
        return playerMap.values();
    }
}
