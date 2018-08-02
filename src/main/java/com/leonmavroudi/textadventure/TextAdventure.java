package com.leonmavroudi.textadventure;

public class TextAdventure {

    public static boolean key1 = false;

    public static void main(String[] args) { start(); }

    public static void start() {
        System.out.println(Start.START);
        System.out.print(Tools.PROMPT);
        String line = Typing.readLine();
        if (line.equals("") || line.equalsIgnoreCase("Y")){
            System.out.println(Start.BEGIN);
            firstRoom();
        } else if (line.equalsIgnoreCase("N")) {
            System.out.println(Start.BEGIN_2);
            firstRoom();
        } else {
            System.out.println(Start.BEGIN_3);
            firstRoom();
        }
    }

    public static void firstRoom() {
        System.out.println();
        System.out.println(Room1.START);
        System.out.print(Tools.PROMPT);
        String line = Typing.readLine();
        line.toLowerCase();
        if (line.contains("not") && line.contains("go") && line.contains("through")) {
            System.out.println();
            System.out.println(Room1.DEATH_1);
            System.out.println(Tools.RETURN_TO_RESTART);
            System.out.print(Tools.PROMPT);
            line = Typing.readLine();
            start();
        } else if (line.contains("go") && line.contains("through")){
            System.out.println(Room2.ENTER);
            secondRoom();
        } else {
            firstRoom();
        }
    }

    public static void secondRoom() {
        System.out.println(Room2.START);
        while(true) {
            System.out.print(Tools.PROMPT);
            String line = Typing.readLine();
            line.toLowerCase();
            if (line.contains("check") && line.contains("out") && line.contains("front") && line.contains("door")) {
                System.out.println(Room2.FRONT_DOOR);
                while(true){
                    System.out.print(Tools.PROMPT);
                    line = Typing.readLine();
                    line.toLowerCase();
                    if (line.contains("look") && line.contains("through") && line.contains("keyhole")) {
                        System.out.println(Room2.FRONT_DOOR_KEYHOLE_LOOK);
                    } else if (line.contains("go") && line.contains("back")) {
                        System.out.println(Room2.START);
                        break;
                    }
                }
            } else if (line.contains("check") && line.contains("out") && line.contains("table")) {

            } else if (line.contains("check") && line.contains("out") && line.contains("right") && line.contains("door")) {
                while(true){
                    System.out.print(Tools.PROMPT);
                    line = Typing.readLine();
                    line.toLowerCase();
                    if (key1 == false && line.contains("put") && line.contains("finger") && line.contains("into") && line.contains("keyhole")) {
                        System.out.println(Room2.RIGHT_DOOR_KEYHOLE_STRUGGLE);
                    } else if (line.contains("go") && line.contains("back")) {
                        System.out.println(Room2.START);
                        break;
                    }
                }
            }
        }
    }
}
