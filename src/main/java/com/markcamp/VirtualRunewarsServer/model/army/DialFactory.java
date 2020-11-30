package com.markcamp.VirtualRunewarsServer.model.army;

public class DialFactory {


    public static Dial makeDeathKnightDial()
    {
        Dial dial = new Dial();

        DialSide leftSide = new DialSide();
        dial.setLeftDial(leftSide);
        leftSide.addPieSlice(Dial.COLOR_BLUE,3,Dial.ACTION_MOVE_ONE);
        leftSide.addPieSlice(Dial.COLOR_BLUE,5,Dial.ACTION_MOVE_TWO);
        leftSide.addPieSlice(Dial.COLOR_BLUE,7,Dial.ACTION_MOVE_THREE);
        leftSide.addPieSlice(Dial.COLOR_BLUE,9,Dial.ACTION_MOVE_TWO);
        leftSide.addPieSlice(Dial.COLOR_BLUE,4,Dial.ACTION_REFORM);
        leftSide.addPieSlice(Dial.COLOR_BLUE,6,Dial.ACTION_SHIFT_ONE);
        leftSide.addPieSlice(Dial.COLOR_BLUE,7,Dial.ACTION_RALLY);
        leftSide.addPieSlice(Dial.COLOR_BLUE,4,Dial.ACTION_MELEE);

        DialSide rightSide = new DialSide();
        dial.setRightDial(rightSide);
        rightSide.addPieSlice(Dial.COLOR_BLUE,0,Dial.ACTION_TURN_MINUS_ONE);
        rightSide.addPieSlice(Dial.COLOR_BLUE,0,Dial.ACTION_CHARGE_PLUS_ONE);
        rightSide.addPieSlice(Dial.COLOR_BLUE,0,Dial.ACTION_TURN_CHARGE);
        rightSide.addPieSlice(Dial.COLOR_BLUE,0,Dial.ACTION_MOVE_TWO);
        rightSide.addPieSlice(Dial.COLOR_BLUE,0,Dial.ACTION_RALLY);
        rightSide.addPieSlice(Dial.COLOR_RED,0,Dial.ACTION_MORTAL);
        rightSide.addPieSlice(Dial.COLOR_WHITE,0,Dial.ACTION_ACTION);

        return dial;
    }
}
