package com.leonmavroudi.textadventure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextAdventure {

    public static void main(String[] args) {

    }

    public static String readLine() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
