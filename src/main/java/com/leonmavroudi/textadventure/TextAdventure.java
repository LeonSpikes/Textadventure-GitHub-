package com.leonmavroudi.textadventure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextAdventure {

    public static final String NL = System.lineSeparator();
    public static final String PROMPT = ">_ ";
    public static final String RETURN_TO_RESTART = "Press return to restart";

    public static final String START =
            "Welcome to an easy/difficult (depends how good your writing skills are) Textadventure." + NL +
            NL + "Ready to begin? (Y/n)";

    public static final String START_BEGIN = "You chosed the beginning...";

    public static final String START_BEGIN_2 =
            "Ok... But why did you start the game if you don't wanna play?" + NL +
            "F@*$ it! I'll start the game anyway!";

    public static final String START_BEGIN_3 =
            "Seems like you are a the worst in typing..." + NL +
            "F@*$ it! I'll start the game anyway!";

    public static final String ROOM_1_START =
            "Ok... I will tell you some things about this game before you ask." + NL +
            "First of all: This is a low budget game. We have no money for an graphical engine." + NL +
            "Second: My name is Puffy. I will lead you through this game. Don't laugh about my name. My owner Carl calles me like this." + NL +
            "Third: Let's start this Motherf#@!*ng game! Meow!" + NL +
            NL +
            "ROOM ONE:" + NL +
            "In front of you is a door: What would you do?" + NL +
            "A: Go through" + NL +
            "B: Do not go through";

    public static final String ROOM_TWO_ENTER = "You got into the next room... Did you hear this? Of course not because no sound, huh? But i heared the ceiling coming down with a crushing noise.";
    public static final String DEATH_1 = "Oh! You got crushed by the ceiling because the room wasn't stable. Sorry, you died.";

    public static final String ROOM_2_START =
            NL +
            "ROOM TWO:" + NL +
            "In the middle of the room is a table, in front of you is a door an the same on your right: What would you do?" + NL +
            "A: Check out front door" + NL +
            "B: Check out table" + NL +
            "C: Check out right door";

    public static final String ROOM_2_FRONT_DOOR =
            NL +
            "You went to the front door and it's jammed: What would you do?" + NL +
            "A: Look through keyhole" + NL +
            "B: Check out table" + NL +
            "C: Check out right door";

    public static void main(String[] args) { start(); }

    public static void start() {
        System.out.println(START);
        System.out.print(PROMPT);
        String line = readLine();
        if (line.equals("") || line.equalsIgnoreCase("Y")){
            System.out.println(START_BEGIN);
            firstRoom();
        } else if (line.equalsIgnoreCase("N")) {
            System.out.println(START_BEGIN_2);
            firstRoom();
        } else {
            System.out.println(START_BEGIN_3);
            firstRoom();
        }
    }

    public static void firstRoom() {
        System.out.println();
        System.out.println(ROOM_1_START);
        System.out.print(PROMPT);
        String line = readLine();
        if (line.equalsIgnoreCase("A")){
            System.out.println(ROOM_TWO_ENTER);
            secondRoom();
        } else if (line.equalsIgnoreCase("B")){
            System.out.println();
            System.out.println(DEATH_1);
            System.out.println(RETURN_TO_RESTART);
            System.out.print(PROMPT);
            line = readLine();
            start();
        } else {
            firstRoom();
        }
    }

    public static void secondRoom() {
        System.out.println(ROOM_2_START);
        while(true) {
            System.out.print(PROMPT);
            String line = readLine();
            if (line.equalsIgnoreCase("A")) {
                System.out.println(ROOM_2_FRONT_DOOR);
                while(true){
                    System.out.print(PROMPT);
                    line = readLine();
                    if (line.equalsIgnoreCase("A")) {

                    }
                }
            } else if (line.equalsIgnoreCase("B")) {

            } else if (line.equalsIgnoreCase("C")) {

            }
        }
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
