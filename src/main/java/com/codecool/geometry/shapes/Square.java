package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square, a = " + getA();
    }

    public static String getFormulaPerimeter() {
        return "4×a";
    }

    public static String getFormulaArea() {
        return "a×a";
    }
}
