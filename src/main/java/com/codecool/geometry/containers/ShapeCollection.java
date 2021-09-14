package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

    List<Shape> shapesCollection = new ArrayList<>();

    public void addShape(Shape shape) {
        shapesCollection.add(shape);
    }

    public void getShapesTable() {
        //TODO: Create a table for displayed objects
        System.out.println(shapesCollection.get(0).getClass().getName()); // or simple name
        System.out.println(shapesCollection.toString());
    }

}
