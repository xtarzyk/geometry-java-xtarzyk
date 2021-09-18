package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.*;
import com.codecool.geometry.utilities.*;

import java.util.Scanner;

public class Main {
    static ShapeCollection shapeCollection = new ShapeCollection();


    public static void main(String[] args) {

        boolean isRunning = true;
        Scanner option = new Scanner(System.in);

        while (isRunning) {
            Display.printMenuOptions();
	        int shapeSelected = option.nextInt();
//
//            shapeCollection.addShape(new Square(12));
//            shapeCollection.addShape(new Circle(18));
//            shapeCollection.addShape(new Triangle(5, 5, 4));
//            shapeCollection.addShape(new Rectangle(2, 3));

            switch (shapeSelected) {
                case 1:
                    Display.printAvailableShapes();
                    shapeMaker();
                    break;
                case 2:
                    shapeCollection.getShapesTable();
                    break;
                case 3:
                    shapeCollection.getLargestShapeByPerimeter();
                    break;
                case 4:
                    shapeCollection.getLargestShapeByArea();
                    break;
                case 5:
                    Display.printAvailableShapes();
                    shapeFormulas();
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }



    public static void shapeMaker() {

        Scanner option = new Scanner(System.in);
        Scanner param = new Scanner(System.in);
        int shapeSelected = option.nextInt();


        switch(shapeSelected) {
            case 1:
                System.out.println("Enter value: ");
                double r = param.nextDouble();
                Circle circle = new Circle(r);
                shapeCollection.addShape(circle);
                break;
            case 2:
                System.out.println("Enter value for a: ");
                double a = param.nextDouble();
                System.out.println("Enter value for b: ");
                double b = param.nextDouble();
                Rectangle rectangle = new Rectangle(a, b);
                shapeCollection.addShape(rectangle);
                break;
            case 3:
                System.out.println("Enter value: ");
                double squareA = param.nextDouble();
                Square square = new Square(squareA);
                shapeCollection.addShape(square);
                break;
            case 4:
                System.out.println("Enter value: ");
                double aRP = param.nextDouble();
                RegularPentagon regularPentagon = new RegularPentagon(aRP);
                shapeCollection.addShape(regularPentagon);
                break;
            case 5:
                System.out.println("Enter value for a: ");
                double aTriangle = param.nextDouble();
                System.out.println("Enter value for b: ");
                double bTriangle = param.nextDouble();
                System.out.println("Enter value for c: ");
                double cTriangle = param.nextDouble();
                Triangle triangle = new Triangle(aTriangle, bTriangle, cTriangle);
                shapeCollection.addShape(triangle);
                break;
            case 6:
                System.out.println("Enter value: ");
                double aEquilateralTriangle = param.nextDouble();
                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(aEquilateralTriangle);
                shapeCollection.addShape(equilateralTriangle);
                break;
        }
    }

    public static void shapeFormulas() {
        Scanner option = new Scanner(System.in);
        int shapeSelected = option.nextInt();
        switch (shapeSelected) {
            case 1:
                System.out.println(
                        "Circle area formula: " +
                                FormulaProvider.getAreaForShape("Circle") +
                                ", Circle perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("Circle")
                );
                break;
            case 2:
                System.out.println(
                        "Rectangle area formula: " +
                                FormulaProvider.getAreaForShape("Rectangle") +
                                ", Rectangle perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("Rectangle")
                );
                break;
            case 3:
                System.out.println(
                        "Square area formula: " +
                                FormulaProvider.getAreaForShape("Square") +
                                ", Square perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("Square")
                );
            case 4:
                System.out.println(
                        "Regular Pentagon area formula: " +
                                FormulaProvider.getAreaForShape("RegularPentagon") +
                                ", Regular Pentagon perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("RegularPentagon")
                );
                break;
            case 5:
                System.out.println(
                        "Triangle area formula: " +
                                FormulaProvider.getAreaForShape("Triangle") +
                                ", Triangle perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("Triangle")
                );
                break;
            case 6:
                System.out.println(
                        "Equilateral Triangle area formula: " +
                                FormulaProvider.getAreaForShape("EquilateralTriangle") +
                                ", Equilateral Triangle perimeter formula: " +
                                FormulaProvider.getPerimeterForShape("EquilateralTriangle")
                );
                break;
        }
    }


}
