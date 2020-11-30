package com.markcamp.VirtualRunewarsServer.model.army;

import com.markcamp.VirtualRunewarsServer.model.army.Army;

public class Reanimates extends Army {

    public Reanimates(String name)
    {
        ID = REANIMATES_ID;
        this.name = name;
        this.race = RACE_WAIQAR;
    }
}
