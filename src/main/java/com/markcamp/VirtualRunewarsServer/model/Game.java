package com.markcamp.VirtualRunewarsServer.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;

public class Game {

    public static final String STATUS_SETUP = "Setup";
    public static final String STATUS_TURN = "Turn";

    @Getter
    private String ID;

    @Getter
    private String name;

    @Getter
    private String gameStatus;

    @Getter
    private int turnNumber;

    @Getter
    private int roundNumber = 0;

    private boolean armySetupComplete;
    private boolean turnSetupComplete;


    private HashMap<String,Player> playerMap;

    public Game(String name)
    {
        this.name = name;
        this.playerMap = new HashMap<String,Player>();
        this.gameStatus = STATUS_SETUP;
        armySetupComplete = false;
        turnSetupComplete = false;
    }

    public Player addPlayer(String name,String password)
    {
        Player player = new Player(name,password);
        playerMap.put(name,player);
        return player;
    }
    public Collection<Player> getPlayers()
    {
        return playerMap.values();
    }

    public Player getPlayer(String name)
    {
        Player player = playerMap.get(name);
        return player;
    }

    public void checkAllPlayersArmySetup()
    {
        boolean setupComplete = true;

        for (Player player:playerMap.values())
        {
            if (!player.isArmySetupComplete())
            {
                setupComplete = false;
            }
        }
        if (setupComplete)
        {
            this.armySetupComplete = true;
        }
    }

    public void advanceRound()
    {
        this.roundNumber++;

        if (roundNumber == 10)
        {
            // Start New Turn
            startNewTurn();
        }
    }

    public void startNewTurn()
    {
        turnNumber++;
        roundNumber = 0;

        // Reset all players to a new turn
        for (Player player: playerMap.values())
        {
            player.startNewTurn();
        }
    }

}
