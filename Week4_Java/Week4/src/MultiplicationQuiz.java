//Multiplication Quiz -- The use of computers in education is referred
//to as computer assisted instruction (CAI). Write a program that will help an elementary school
//student learn multiplication. Use a Random object to produce 2 positive 1-digit integers. The
//program will then prompt the user with a question, such as “How much is 6 times 7?”
//The student then inputs the answer. Next, the program checks the student’s answer. If it is
//correct, display the message “Very Good!” and ask another multiple question. If the answer is
//wrong, display the message “No. Please try again.” And let the student try the same question
//repeatedly until the student finally gets it right. A separate method will be used to generate each
//new question. This method will be called once when the application begins execution and each
//CSIS 212-B03

import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 4 - Assignment #3\n");
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Start an infinite loop to generate and ask multiplication questions
        while (true) {
            // Generate two random numbers between 0 and 9 (inclusive)
            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);

            // Ask the multiplication question
            System.out.println("How much is " + number1 + " times " + number2 + "?");
            int answer = input.nextInt();

            // Keep asking the same question until the user provides the correct answer
            while (answer != (number1 * number2)) {
                System.out.println("No. Please try again.");
                answer = input.nextInt();
            }

            // Display "Very Good!" if the answer is correct
            System.out.println("Very Good!");
        }
    }
}
