package com.leonmavroudi.textadventure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextAdventure {

    public static final String NL = System.lineSeparator();
    public static final String PROMPT = ">_ ";

    public static final String START_1 = "Welcome to an easy/difficult (depends how good your writing skills are) Textadventure.";
    public static final String START_2 = "Ready to begin? (Y/n)";

    public static final String ROOM_1_START_1 = "Ok... I will tell you some things about this game before you ask.";
    public static final String ROOM_1_START_2 = "First of all: This is a low budget game. We have no money for an graphical engine.";
    public static final String ROOM_1_START_3 = "Second: My name is Puffy. I will lead you through this game. Don't laugh about my name. My owner Carl calles me like this.";
    public static final String ROOM_1_START_4 = "Third: Let's start this Motherf#@!*ng game! Meow!";
    public static final String ROOM_1_START_5 = "ROOM ONE:";
    public static final String ROOM_1_START_6 = "In front of you is a door: What would you do?";
    public static final String ROOM_1_START_7 = "A: Go through";
    public static final String ROOM_1_START_8 = "B: Do not go through";

    public static final String START = START_1 + NL +
            NL +
            START_2;

    public static final String START_BEGIN = "You chosed the beginning...";
    public static final String START_BEGIN_2 = "Ok... But why did you start the game if you don't wanna play?";
    public static final String START_BEGIN_3 = "F@*$ it! I'll start the game anyway!";
    public static final String START_BEGIN_4 = "Seems like you are a the worst in typing...";
    public static final String START_BEGIN_5 = "F@*$ it! I'll start the game anyway!";

    public static final String START_BEGIN2 = START_BEGIN_2 + NL +
            START_BEGIN_3;

    public static final String START_BEGIN3 = START_BEGIN_4 + NL +
            START_BEGIN_5;

    public static final String ROOM_1_START = ROOM_1_START_1 + NL +
            ROOM_1_START_2 + NL +
            ROOM_1_START_3 + NL +
            ROOM_1_START_4 + NL +
            NL +
            ROOM_1_START_5 + NL +
            ROOM_1_START_6 + NL +
            ROOM_1_START_7 + NL +
            ROOM_1_START_8;



    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println(START);
        System.out.print(PROMPT);
        String line = readLine();
        if (line.equals("") || line.equalsIgnoreCase("Y")){
            System.out.println(START_BEGIN);
            firstRoom();
        } else if (line.equalsIgnoreCase("N")) {
            System.out.println(START_BEGIN2);
            firstRoom();
        } else {
            System.out.println(START_BEGIN3);
            firstRoom();
        }
    }

    public static void firstRoom() {
        System.out.println();
        System.out.println(ROOM_1_START);
        System.out.print(PROMPT);
        String line = readLine();
        if (line.equalsIgnoreCase("A")){
            System.out.println("You got into the next room... Did you hear this? Of course not because no sound, huh? But i heared the ceiling coming down with a crushing noise.");
            secondRoom();
        } else if (line.equalsIgnoreCase("B")){
            System.out.println();
            System.out.println("Oh! You got crushed by the ceiling because the room wasn't stable. Sorry, you died.");
            System.out.println("Press return to restart");
            System.out.print(PROMPT);
            line = readLine();
            start();
        } else {
            firstRoom();
        }
    }

    public static void secondRoom() {
        System.out.println();
        System.out.println("ROOM TWO:");
        System.out.println("In the middle of the room is a table, in front of you is a door an the same on your right: What would you do?");
        System.out.println("A: Check out front door");
        System.out.println("B: Check out table");
        System.out.println("C: Check out right door");
        while(true) {
            System.out.print(PROMPT);
            String line = readLine();
            if (line.equalsIgnoreCase("A")) {
                System.out.println("You went to the front door and it's jammed: What would you do?");
                System.out.println("A: Look through keyhole");
                System.out.println("B: Check out table");
                System.out.println("C: Check out right door");
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
