package com.codecool.geometry.utilities;

public class Display {

    public static void printMenuOptions(){
        System.out.println(
                "Main menu:\n" +
                        "1. Add new shape\n" +
                        "2. Show all shapes\n" +
                        "3. Show shape with the largest perimeter\n" +
                        "4. Show shape with the largest area\n" +
                        "5. Show formulas\n" +
                        "0. Exit\n"
        );
    }

    public static void printAvailableShapes(){
        System.out.println(
                "Select shape: \n" +
                        "1. Circle\n" +
                        "2. Rectangle\n" +
                        "3. Square\n" +
                        "4. Regular Pentagon\n" +
                        "5. Triangle\n" +
                        "6. Equilateral Triangle"
        );
    }
}
