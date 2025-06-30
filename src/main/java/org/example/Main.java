package org.example;

import java.util.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double calculateCircleArea(double radius){
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle: %.2f", area);
        return area;
    }

    public static double calculateTriangleArea(double base, double height){
        double area = 0.5 * base * height;
        System.out.printf("Area of the triangle: %.2f", area);
        return area;
    }

    public static double calculateRectangleArea(double length, double width){
        double area = length * width;
        System.out.printf("Area of the rectangle: %.2f", area);
        return area;
    }


    public static void main(String[] args) {


       Scanner scan = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Choose a shape (1-3): ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the radius");
                double radius = scan.nextDouble();
                calculateCircleArea(radius);
                break;

            case 2:
                System.out.println("Enter the base: ");
                double base = scan.nextDouble();
                System.out.println("Enter the height: ");
                double height = scan.nextDouble();
                calculateTriangleArea(base, height);

                break;

            case 3:
                System.out.println("Enter the length: ");
                double length = scan.nextDouble();
                System.out.println("Enter the width: ");
                double width = scan.nextDouble();
                calculateRectangleArea(length, width);

                break;
        }


    }
}