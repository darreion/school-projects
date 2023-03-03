//Product-- One interesting application of computers
//is to display graphs and bar charts. Write an application that reads 5 numbers between 1 and 30.
//For each number that reads, your program will display the same number of adjacent asterisks.
//For example, if your program reads the number 7, it will display *******. Display the bars of
//asterisk after you read all 5 numbers.
//CSIS 212-B03


import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 3 - Assignment #2\n");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Enter the first number between 1 and 30: ");
        num1 = input.nextInt();
        while (num1 < 1 || num1 > 30) {
            System.out.print("Invalid input. Enter the first number between 1 and 30: ");
            num1 = input.nextInt();
        }
        System.out.print("Enter the second number between 1 and 30: ");
        num2 = input.nextInt();
        while (num2 < 1 || num2 > 30) {
            System.out.print("Invalid input. Enter the second number between 1 and 30: ");
            num2 = input.nextInt();
        }
        System.out.print("Enter the third number between 1 and 30: ");
        num3 = input.nextInt();
        while (num3 < 1 || num3 > 30) {
            System.out.print("Invalid input. Enter the third number between 1 and 30: ");
            num3 = input.nextInt();
        }
        System.out.print("Enter the fourth number between 1 and 30: ");
        num4 = input.nextInt();
        while (num4 < 1 || num4 > 30) {
            System.out.print("Invalid input. Enter the fourth number between 1 and 30: ");
            num4 = input.nextInt();
        }
        System.out.print("Enter the fifth number between 1 and 30: ");
        num5 = input.nextInt();
        while (num5 < 1 || num5 > 30) {
            System.out.print("Invalid input. Enter the fifth number between 1 and 30: ");
            num5 = input.nextInt();
        }
        System.out.println();
        System.out.print("First number: ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Second number: ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Third number: ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Fourth number: ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Fifth number: ");
        for (int i = 0; i < num5; i++) {
            System.out.print("*");
        }
        System.out.println();
        input.close();
    }
}

