//Create an application that contains an enumeration (enum) that represents the days of the week.
//Display a list of the days, then prompt the user for a day. Display business hours for the chosen
//day.  Create your own business hours stored in an array; however, every day of the week should
//have different hours.  Although companies do not normally have different business hours every
//day of the week, programming your code with this difference will help in finding and fixing
//coding errors.
//CSIS 212-B03


import java.util.Scanner;

public class BusinessHours {
    // Define an enumeration called DayOfWeek to represent the days of the week
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 8 - Assignment #1\n");
        // Define business hours for each day of the week as a string array
        String[] businessHours = {
                "8:00 AM - 5:00 PM",
                "8:30 AM - 5:30 PM",
                "9:00 AM - 6:00 PM",
                "9:30 AM - 6:30 PM",
                "10:00 AM - 7:00 PM",
                "10:30 AM - 7:30 PM",
                "11:00 AM - 8:00 PM"
        };

        // Display a list of the days of the week
        System.out.println("Days of the week:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        // Prompt the user for a day of the week
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = scanner.nextLine().toUpperCase(); // convert the input to uppercase for case-insensitive comparison
        DayOfWeek selectedDay = DayOfWeek.valueOf(input); // get the corresponding DayOfWeek enum value from the input string

        // Display the business hours for the selected day
        System.out.println("Business hours for " + selectedDay + ": " + businessHours[selectedDay.ordinal()]);
    }
}
