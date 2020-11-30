package com.markcamp.VirtualRunewarsServer.model.army;

public class DeathKnight extends Army{

    public DeathKnight(String name)
    {
        ID = DEATH_KNIGHT_ARMY_ID;
        this.name = name;
        this.race = RACE_WAIQAR;

        this.dial = DialFactory.makeDeathKnightDial();
    }

}
