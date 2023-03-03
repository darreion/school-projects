// The DateTest class tests the Date class.
public class DateTest {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 6 - Assignment #1\n");
        // Create a new Date object with the date January 1, 2023.
        Date date = new Date(1, 1, 2023);

        // Display the date using the displayDate() method.
        date.displayDate();

        // Set the month of the date to February.
        date.setMonth(2);

        // Display the date again to show that the month has been changed.
        date.displayDate();
    }
}
