import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();  // create a Rectangle object with default values
        int choice;                             // menu choice

        do {
            // display the menu
            System.out.println("1. Set Length");
            System.out.println("2. Set Width");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            // handle the user's menu choice
            if (choice == 1) {
                try {
                    // prompt the user for the length and set it using the setLength method
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();
                    rectangle.setLength(length);
                } catch (IllegalArgumentException e) {
                    // if an exception is thrown, print the error message and continue the loop
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                try {
                    // prompt the user for the width and set it using the setWidth method
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    rectangle.setWidth(width);
                } catch (IllegalArgumentException e) {
                    // if an exception is thrown, print the error message and continue the loop
                    System.out.println(e.getMessage());
                }
            }

            // print the area and perimeter of the rectangle
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
        } while (choice != 3);
    }
}
