package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "Rectangle, a = " + a + ", b = " + b;
    }

    public static String getFormulaPerimeter() {
        return "2×a+2×b";
    }

    public static String getFormulaArea() {
        return "a×b";
    }

}
