//Multiple Checker -- Write a method isMultiple that determines, for a pair of integers, whether
//the second integer is a multiple of the first. The method will take 2 integer arguments and return
//true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder
//operator]. Incorporate this method into an application that inputs a series of pairs of integers (1
//pair at a time) and determines whether the second value in each pair is a multiple of the first.
//CSIS 212-B03
import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 4 - Assignment #1\n");
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter pairs of integers
        System.out.println("Enter pairs of integers (0 0 to quit): ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // Continue processing pairs of integers until 0 0 is entered
        while (num1 != 0 && num2 != 0) {
            // Check if the second integer is a multiple of the first
            if (isMultiple(num1, num2)) {
                System.out.println(num2 + " is a multiple of " + num1);
            } else {
                System.out.println(num2 + " is not a multiple of " + num1);
            }

            // Prompt the user to enter another pair of integers
            System.out.println("Enter pairs of integers (0 0 to quit): ");
            num1 = input.nextInt();
            num2 = input.nextInt();
        }
    }

    // Returns true if the second integer is a multiple of the first
    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }
}

