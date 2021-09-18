package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a, a ,a);
    }

    @Override
    public String toString() {
        return "Equilateral Triangle, a = " + getA();
    }

    public static String getFormulaPerimeter() {
        return "2×π×r";
    }

    public static String getFormulaArea() {
        return "π×r×r";
    }
}
