package com.leonspikes.textadventure.meta;

import com.leonspikes.textadventure.utilities.Ansi;
import com.leonspikes.textadventure.utilities.Tools;

/**
 * In this class is all the text for the START sequence defined.
 *
 * @author Leon Spikes
 */

public class Start {
    public static final String START = Ansi.BLACK_BG + Ansi.GREEN +
            "Welcome to an easy/difficult (depends how good your writing skills are) Textadventure." + Tools.NEWLINE +
            Tools.NEWLINE + "Ready to begin? (Y/n)";

    public static final String BEGIN = "You chosed the beginning...";

    public static final String BEGIN_2 =
            "Ok... But why did you start the game if you don't wanna play?" + Tools.NEWLINE +
                    "F@*$ it! I'll start the game anyway!";

    public static final String BEGIN_3 =
            "Seems like you are a the worst in typing..." + Tools.NEWLINE +
                    "F@*$ it! I'll start the game anyway!";
}
