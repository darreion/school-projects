//Create a class called Date that includes 3 instance
//variables—a month (type int), a day (type int), and a year (type int). Provide a constructor that
//initializes the 3 instance variables and assumes the values provided are correct. Provide a set and
//a get method for each instance variable. Provide a method displayDate that displays the month,
//day, and year separated by forward slashes(/). Write a test application named DateTest that
//demonstrates class Date’s capabilities.
//CSIS 212-B03

// The Date class represents a date with a month, day, and year.
public class Date {
    private int month; // The month of the date
    private int day; // The day of the date
    private int year; // The year of the date

    // Constructs a Date object with the given month, day, and year.
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Returns the month of the date.
    public int getMonth() {
        return month;
    }

    // Sets the month of the date.
    public void setMonth(int month) {
        this.month = month;
    }

    // Returns the day of the date.
    public int getDay() {
        return day;
    }

    // Sets the day of the date.
    public void setDay(int day) {
        this.day = day;
    }

    // Returns the year of the date.
    public int getYear() {
        return year;
    }

    // Sets the year of the date.
    public void setYear(int year) {
        this.year = year;
    }

    // Displays the date in the format "MM/DD/YYYY".
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
