package com.markcamp.VirtualRunewarsServer.model;

import com.markcamp.VirtualRunewarsServer.model.army.Army;
import com.markcamp.VirtualRunewarsServer.model.army.DeathKnight;
import com.markcamp.VirtualRunewarsServer.model.army.Reanimates;

public class ArmyFactory {


    public static Army createArmy(String armyID, String armyName)
    {
        Army army = null;

        if (armyID.equals(Army.DEATH_KNIGHT_ARMY_ID))
        {
            army = new DeathKnight(armyName);
        }
        else if (armyID.equals(Army.REANIMATES_ID))
        {
            army = new Reanimates(armyName);
        }


        return army;
    }
}
