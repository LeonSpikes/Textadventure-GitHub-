package com.leonmavroudi.textadventure.utilities;

/**
 * @author Leon Spikes
 * In this class is the readLine() method defined.
 * readLine() lets your string be filled with the commandline input.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Typing {
    public static String readLine() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
