package com.markcamp.VirtualRunewarsServer.controller;

import com.markcamp.VirtualRunewarsServer.model.Game;
import com.markcamp.VirtualRunewarsServer.model.Player;
import com.markcamp.VirtualRunewarsServer.model.army.Army;
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
    public Player addPlayer(@RequestParam(value = "gameName") String gameName,
                            @RequestParam(value = "playerName") String playerName,
                            @RequestParam(value = "password") String password)
    {
        Game game = gameServer.getGame(gameName);
        Player player = game.addPlayer(playerName,password);

        return player;
    }

    @GetMapping("/game/addarmy")
    public Player addArmy(@RequestParam(value = "gameName") String gameName,
                          @RequestParam(value = "playerName") String playerName,
                          @RequestParam(value = "armyID") String armyID,
                          @RequestParam(value = "armyName") String armyName,
                          @RequestParam(value = "password") String password
    )
    {
        Game game = gameServer.getGame(gameName);
        Player player = game.getPlayer(playerName);
        player.addArmy(armyID, armyName);

        return player;
    }
    @GetMapping("/game/listarmy")
    public Collection<Army> listArmy(@RequestParam(value = "gameName") String gameName,
                                    @RequestParam(value = "playerName") String playerName,
                                    @RequestParam(value = "password") String password
    )
    {
        Game game = gameServer.getGame(gameName);
        Player player = game.getPlayer(playerName);
        Collection<Army> armies = player.getArmies();

        return armies;
    }

    @GetMapping("/game/playersetupcomplete")
    public Player playerSetupComplete(@RequestParam(value = "gameName") String gameName,
                                                @RequestParam(value = "playerName") String playerName,
                                                @RequestParam(value = "password") String password
    )
    {
        Game game = gameServer.getGame(gameName);
        Player player = game.getPlayer(playerName);
        player.armySetupComplete();

        // If all players complete, start the game
        game.checkAllPlayersArmySetup();

        return player;
    }

}
