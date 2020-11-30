package com.markcamp.VirtualRunewarsServer.model.army;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DialSide {

    @Getter
    private List<DialPieSlice> dialSlices;

    public DialSide()
    {
        dialSlices = new ArrayList<DialPieSlice>();
    }

    public void addPieSlice(String color, int turnNumber, String action)
    {
        DialPieSlice slice = new DialPieSlice(color, turnNumber, action);
        dialSlices.add(slice);
    }

}
