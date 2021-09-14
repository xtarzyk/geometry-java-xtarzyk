package com.codecool.geometry.shapes;

import static java.lang.Math.sqrt;

public class RegularPentagon extends Shape {

    private final double a;

    public RegularPentagon(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a*sqrt(5*(5+2*sqrt(5))/4);
        //a×a×sqrt(5×(5+2×sqrt(5))/4
    }

    @Override
    public double calculatePerimeter() {
        return 5*a;
    }

    @Override
    public String toString() {
        return "Regular Pentagon, a = " + a;
    }
}
