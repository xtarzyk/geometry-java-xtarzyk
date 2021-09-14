package com.codecool.geometry.utilities;

import com.codecool.geometry.shapes.Circle;

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
        return "";
    }
}
