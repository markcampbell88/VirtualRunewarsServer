package com.markcamp.VirtualRunewarsServer.model.army;

import lombok.Getter;
import lombok.Setter;

public class Dial {

    public final static String COLOR_BLUE  = "Blue";
    public final static String COLOR_RED   = "Red";
    public final static String COLOR_GREEN = "Green";
    public final static String COLOR_WHITE = "White";

    public final static String ACTION_MOVE_ONE   = "Move 1";
    public final static String ACTION_MOVE_TWO   = "Move 2";
    public final static String ACTION_MOVE_THREE = "Move 3";
    public final static String ACTION_MOVE_FOUR  = "Move 4";
    public final static String ACTION_MELEE = "Melee";
    public final static String ACTION_REFORM = "Reform";
    public final static String ACTION_SHIFT_ONE = "Shift 1";
    public final static String ACTION_RALLY = "Rally";

    public final static String ACTION_TURN_MINUS_ONE = "Turn -1";
    public final static String ACTION_CHARGE_PLUS_ONE = "Charge +1";
    public final static String ACTION_TURN_CHARGE = "Turn Charge";
    public final static String ACTION_MORTAL = "Mortal";
    public final static String ACTION_ACTION = "Action";

    @Getter
    @Setter
    private DialSide leftDial;

    @Getter
    @Setter
    private DialSide rightDial;

}
