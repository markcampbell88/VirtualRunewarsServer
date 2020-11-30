package com.markcamp.VirtualRunewarsServer.model;

import com.markcamp.VirtualRunewarsServer.model.army.Army;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Player {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String password;

    @Getter
    private boolean armySetupComplete;

    @Getter
    private boolean turnSetupComplete;

    private Map<String, Army> armyMap = new HashMap<String,Army>();

    public Player(String name, String password)
    {
        this.name = name;
        this.password = password;
        this.armySetupComplete = false;
        this.turnSetupComplete = false;
    }

    public void addArmy(String armyID, String armyName) {
        // Get a creation of an army from the factory
        Army army = ArmyFactory.createArmy(armyID,armyName);

        armyMap.put(armyName,army);
    }

    public Collection<Army> getArmies() {
        return armyMap.values();
    }

    public void armySetupComplete()
    {
        this.armySetupComplete = true;
    }

    public void turnSetupComplete()
    {
        this.turnSetupComplete = true;
    }

    public void startNewTurn()
    {
        this.turnSetupComplete = false;
        // TODO reset all turn stuff
    }
}
