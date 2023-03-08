//Write an application containing three parallel arrays that hold 10 elements each.  The first array
//hold four-digit student ID numbers, the second array holds first names, and the third array holds
//the students’ grade point averages.  Use dialog boxes to accept a student ID number and display
//the student’s first name and grade point average.  If a match is not found, display an error
//message that includes the invalid ID number and allow the user to search for a new ID number.
//CSIS 212-B03

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 8 - Assignment #1\n");
        // Initialize parallel arrays with data for 10 students
        int[] studentIDs = {1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 1234};
        String[] firstNames = {"John", "Jane", "Bob", "Alice", "Tom", "Kate", "Mike", "Emily", "Sarah", "Chris"};
        double[] gpas = {3.5, 3.2, 2.9, 3.8, 3.7, 3.4, 3.1, 3.6, 3.9, 3.0};

        // Prompt user for student ID and search for a match
        boolean found = false;
        Scanner scanner = new Scanner(System.in); // create a Scanner object to read input from the console
        while (!found) {
            System.out.print("Enter a student ID: ");
            int id = scanner.nextInt(); // read an integer from the console
            for (int i = 0; i < studentIDs.length; i++) { // loop through the parallel arrays
                if (studentIDs[i] == id) { // if the ID matches, output the name and GPA and set found to true
                    System.out.println("Student found:");
                    System.out.println("Name: " + firstNames[i]);
                    System.out.println("GPA: " + gpas[i]);
                    found = true;
                    break; // break out of the loop since we found a match
                }
            }
            if (!found) { // if we didn't find a match, output an error message and prompt for another ID
                System.out.println("Invalid ID number: " + id);
                System.out.println("Please try again.");
            }
        }
    }
}
