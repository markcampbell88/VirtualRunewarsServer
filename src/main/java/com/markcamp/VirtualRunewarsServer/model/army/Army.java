package com.markcamp.VirtualRunewarsServer.model.army;

import lombok.Getter;
import lombok.Setter;

public abstract class Army {

    public static String RACE_WAIQAR = "WQ";
    public static String RACE_DAQAR = "DQ";
    public static String RACE_LATARI = "LT";
    public static String RACE_UTHUK = "UT";

    // Waiqar armies
    public static String DEATH_KNIGHT_ARMY_ID = "WQ_DK";
    public static String REANIMATE_ARCHERS_ID = "WQ_RA";
    public static String ARDUS_ID = "WQ_AR";
    public static String CARRION_LANCERS_ID = "WQ_CL";
    public static String ANKAUR_MARO_ID = "WQ_AM";
    public static String REANIMATES_ID = "WQ_RE";
    public static String WRAITHS_ID = "WQ_WR";
    public static String LORD_VORUNTHUL_ID = "WQ_LV";



    @Getter
    @Setter
    protected String race;
    @Getter
    @Setter
    protected String name;

    @Getter
    protected String ID;

    @Getter
    protected Dial dial;

    @Getter
    @Setter
    protected DialPieSlice leftDialTurnSelection;
    @Getter
    @Setter
    protected DialPieSlice rightDialTurnSelection;


    public void advanceTurn()
    {
        this.leftDialTurnSelection = null;
        this.rightDialTurnSelection = null;
    }

}
