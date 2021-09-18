package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;


import java.util.*;

import static com.codecool.geometry.utilities.FormulaProvider.*;

public class ShapeCollection {

    List<Shape> shapesCollection = new ArrayList<>();

    public void addShape(Shape shape) {
        shapesCollection.add(shape);
    }

    public void getShapesTable() {
        //TODO: Create a table for displayed objects
        int id = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String lineSeparator = "|---|---------------------|----------------------------------------|-----------|----------|-----------|------------------------------|";
        System.out.println("/------------------------------------------------------------------------------------------------------------------------------------\\\n" +
                "| ID|                Class|                                toString|  Perimeter|   Formula|       Area|                       Formula|");
        for (Shape shape : shapesCollection) {
            stringBuilder.append(String.format("%s\n| %d |%21s|%40s|%11.2f|%10s|%11.2f|%30s|\n",
                    lineSeparator,
                    id,
                    shape.getClass().getSimpleName(),
                    shape,
                    shape.calculatePerimeter(),
                    getPerimeterForShape(shape.getClass().getSimpleName()),
                    shape.calculateArea(),
                    getAreaForShape(shape.getClass().getSimpleName())));
            id++;
        }
        System.out.println(stringBuilder);
        System.out.println("\\------------------------------------------------------------------------------------------------------------------------------------/\n");

//        System.out.println(shapesCollection.get(0).getClass().getSimpleName()); // or simple name
//        System.out.println(shapesCollection.get(0).toString());
    }

    public void getLargestShapeByPerimeter() {
        Shape largestShape = shapesCollection.get(0);
        double largestPerimeter = largestShape.calculatePerimeter();
        for (Shape shape : shapesCollection) {
            if (shape.calculatePerimeter() > largestPerimeter) {
                largestShape = shape;
                largestPerimeter = largestShape.calculatePerimeter();
            }
        }
        System.out.println("\nShape with the largest perimeter is: " + largestShape.getClass().getSimpleName() + " " +  largestPerimeter + "\n");
    }

    public void getLargestShapeByArea() {
        Shape largestShape = shapesCollection.get(0);
        double largestArea = largestShape.calculateArea();
        for (Shape shape : shapesCollection) {
            if(shape.calculateArea() > largestArea) {
                largestShape = shape;
                largestArea = largestShape.calculateArea();
            }
        }
        System.out.println("\nShape with the largest area is: " + largestShape.getClass().getSimpleName() + " " +  largestArea + "\n");
    }



}
