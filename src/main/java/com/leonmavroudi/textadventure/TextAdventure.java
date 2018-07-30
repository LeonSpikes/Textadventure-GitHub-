package com.leonmavroudi.textadventure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextAdventure {

    public static void main() {
        System.out.println("Welcome to an easy/difficult (depends how good your writing skills are) Textadventure.");
        System.out.println();
        System.out.println("Ready to begin? (Y/n)");
        System.out.print(">_ ");
        String line = readLine();
        if (line.equals("") || line.equals("y") || line.equals("Y")){
            System.out.println("You chosed the beginning...");
            firstRoom();
        } else if (line.equals("N") || line.equals("n")) {
            System.out.println("Ok... But why did you start the game if you don't wanna play?");
            System.out.println("F@*$ it! I'll start the game anyway!");
            firstRoom();
        } else {
            System.out.println("Seems like you are a the worst in typing...");
            System.out.println("F@*$ it! I'll start the game anyway!");
            firstRoom();
        }
    }

    public static void firstRoom() {
        System.out.println();
        System.out.println("Ok... I will tell you some things about this game before you ask.");
        System.out.println("First of all: This is a low budget game. We have no money for an graphical engine.");
        System.out.println("Second: My name is Puffy. I will lead you through this game. Don't laugh about my name. My owner Carl calles me like this.");
        System.out.println("Third: Let's start this Motherf#@!*ng game! Meow!");
        System.out.println();
        System.out.println("ROOM ONE:");
        System.out.println("In front of you is a door: What would you do?");
        System.out.println("A: Go through");
        System.out.println("B: Do not go through");
        System.out.print(">_ ");
        String line = readLine();
        if (line.equals("A")){

        } else if (line.equals("B")){
            System.out.println();
            System.out.println("Oh! You got crushed by the ceiling. Sorry, you died.");
            System.out.println("Press return to restart");
            line = readLine();
            main();
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
