package com.leonmavroudi.textadventure;

/**
 * @author Leon Spikes
 * In this class is the lineReader defined.
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
