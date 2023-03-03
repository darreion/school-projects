//Circle Area -- Write an application that prompts the user for the radius of a circle
//and uses a method called circleArea to calculate the area of the circle.
//CSIS 212-B03

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 4 - Assignment #2\n");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle (in inches): ");
        double radius = scanner.nextDouble();

        // Call the circleArea method to calculate the area of the circle
        double area = circleArea(radius);

        // Print the area of the circle
        System.out.println("The area of the circle (in inches^2) is: " + area);
    }

    public static double circleArea(double radius) {
        // Calculate the area of the circle and return the result
        // Uses java.lang.Math instead of hard-coded value of pi for greater accuracy
        return Math.PI * radius * radius;

    }
}
