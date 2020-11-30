package com.markcamp.VirtualRunewarsServer.model.army;

import lombok.Getter;

public class DialPieSlice {

    @Getter
    private String color;
    @Getter
    private String action;
    @Getter
    private int turnNumber;

    public DialPieSlice(String color, int turnNumber, String action)
    {
        this.color = color;
        this.turnNumber = turnNumber;
        this.action = action;
    }
}
