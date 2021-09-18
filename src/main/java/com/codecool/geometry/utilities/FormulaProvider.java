package com.codecool.geometry.utilities;

import com.codecool.geometry.shapes.*;

public class FormulaProvider {

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(String shape) {
        switch (shape) {
            case "Circle":
                return Circle.getFormulaArea();
            case "Rectangle":
                return Rectangle.getFormulaArea();
            case "Triangle":
                return Triangle.getFormulaArea();
            case "Square":
                return Square.getFormulaArea();
            case "EquilateralTriangle":
                return EquilateralTriangle.getFormulaArea();
            case "RegularPentagon":
                return RegularPentagon.getFormulaArea();
        }
        return "";
    }

    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(String shape) {
        switch (shape) {
            case "Circle":
                return Circle.getFormulaPerimeter();
            case "Rectangle":
                return Rectangle.getFormulaPerimeter();
            case "Triangle":
                return Triangle.getFormulaPerimeter();
            case "Square":
                return Square.getFormulaPerimeter();
            case "EquilateralTriangle":
                return EquilateralTriangle.getFormulaPerimeter();
            case "RegularPentagon":
                return RegularPentagon.getFormulaPerimeter();
        }
        return "";
    }
}
