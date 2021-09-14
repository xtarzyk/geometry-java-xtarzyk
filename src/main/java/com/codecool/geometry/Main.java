package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);


        while (isRunning) {
	        int option = scanner.nextInt();  // TODO read the keyboard here

            switch (option) {
                case 1:
                    // TODO Add new shape
                    printAvailableShapes();
                    shapeMaker();
                    break;
                case 2:
                    // TODO Show all shapes
                    break;
                case 3:
                    // TODO Show shape with the largest perimeter
                    break;
                case 4:
                    // TODO Show shape with the largest area
                    break;
                case 5:
                    // TODO Show formulas
                    break;
                case 0:
                    // TODO Exit
                    isRunning = false;
                    break;
            }
        }

//        Square square = new Square(35.5);
//        Rectangle rectangle = new Rectangle(10.2, 4.7);
//        Triangle triangle = new Triangle(13.2, 12.0, 10.6);
//        //Circle circle = new Circle(5);
//        RegularPentagon regularPentagon = new RegularPentagon(7.7);
//        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(4.1);
//        System.out.println(equilateralTriangle);


//        shapeCollection.addShape(circle);
//        shapeCollection.addShape(square);
//        shapeCollection.addShape(rectangle);
//        shapeCollection.addShape(regularPentagon);
//        shapeCollection.addShape(triangle);
//        shapeCollection.getShapesTable();


    }

    private static void printAvailableShapes(){
        System.out.println(
                "Select shape: \n" +
                        "1. Circle\n" +
                        "2. Rectangle\n" +
                        "3. Square\n" +
                        "4. Regular Pentagon\n" +
                        "5. Triangle\n" +
                        "6. Equilateral Triangle");
    }

    private static void shapeMaker() {

        Scanner option = new Scanner(System.in);
        Scanner param = new Scanner(System.in);
        ShapeCollection shapeCollection = new ShapeCollection();
        int shapeSelected = option.nextInt();


        switch(shapeSelected) {
            case 1:
                System.out.println("Enter value: ");
                double value = param.nextDouble();
                Circle circle = new Circle(value);
                shapeCollection.addShape(circle);
                break;
            case 2:
                System.out.println("Enter value for a: ");
                double valueA = param.nextDouble();
                System.out.println("Enter value for b: ");
                double valueB = param.nextDouble();
                Rectangle rectangle = new Rectangle(valueA, valueB);
                shapeCollection.addShape(rectangle);
                break;
            case 3:
                System.out.println("Enter value: ");
                double aDouble = param.nextDouble();
                Square square = new Square(aDouble);
                shapeCollection.addShape(square);
                break;
//            case 4:
//                System.out.println("Enter value: ");
//                double value = param.nextDouble();
//                RegularPentagon regularPentagon = new RegularPentagon(value);
//                shapeCollection.addShape(regularPentagon);
//                break;
//            case 5:
//                Triangle triangle = new Triangle(value, value, value);
//                shapeCollection.addShape(triangle);
//                break;
//            case 6:
//                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(value);
//                shapeCollection.addShape(equilateralTriangle);
//                break;
        }
    }


}
