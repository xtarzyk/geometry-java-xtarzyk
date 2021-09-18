package com.codecool.geometry.shapes;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter();
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Triangle, a = " + a + ", b = " + b + ", c = " + c;
    }

    public static String getFormulaPerimeter() {
        return "a+b+c";
    }

    public static String getFormulaArea() {
        return "sqrt(s×(s-a)×(s-b)×(s-c))";
    }

}
