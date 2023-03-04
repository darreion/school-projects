public class Date {
    private int month; // Represents the month of the date.
    private int day; // Represents the day of the date.
    private int year; // Represents the year of the date.

    // Constructs a new Date object with the given month, day, and year.
    public Date(int theMonth, int theDay, int theYear) {
        month = theMonth;
        year = theYear;
        day = checkDay(theDay);
    }

    // Sets the month of the date.
    public void setMonth(int theMonth) {
        month = theMonth;
    }

    // Returns the month of the date.
    public int getMonth() {
        if (month > 0 && month <= 12) // Validates that the month is between 1 and 12.
            return month;
        return 0;
    }

    // Checks if the given day is valid for the current month and returns it if it is.
    private int checkDay(int testDay) {
        int daysPerMonth[] =
                {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;

        if (month == 2 && testDay == 29 && (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            return testDay;

        return 0;
    }

    // Returns a string representation of the date in the format "month/day/year".
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}