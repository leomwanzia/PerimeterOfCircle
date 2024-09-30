package com.leo;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = in.nextDouble(); // reads the radius in double

        // call the calculatePerimeter method
        double perimeter = calculatePerimeter(radius);
        //print the perimeter
        System.out.println("The perimeter of the circle is: " + perimeter);

        in.close();

        //define the calculatePerimeter as private static

    }
    private static double calculatePerimeter(double radius) {

        // Area = 2 * PI * radius
        double perimeter = 2 * Math.PI * radius;

        //return the calculated perimeter
        return perimeter;

    }
}
