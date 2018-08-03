package com.leonspikes.textadventure.utilities;

/**
 * In this class is the readLine() method defined.
 * readLine() lets your string be filled with the commandline input.
 *
 * @author Leon Spikes
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Typing {

    /**
     * Reads the console input into a String.
     * @return the last input of the console
     */
    public static String readLine() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
