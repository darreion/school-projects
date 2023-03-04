public class HourlyEmployee extends Employee
{
    // Private instance variables to store the employee's hourly wage and hours worked
    private double wage;
    private double hours;

    // Constructor that takes in the employee's first name, last name, social security number,
    // date of birth, hourly wage, and hours worked
    public HourlyEmployee(String first, String last, String ssn, Date DayOfBirth, double hourlyWage, double hoursWorked) {
        // Call the constructor of the parent class (Employee) with the given parameters
        super(first, last, ssn, DayOfBirth);

        // Set the employee's hourly wage and hours worked using the provided methods
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    // Method to set the employee's hourly wage
    public final void setWage(double hourlyWage) {
        // If the given hourly wage is less than 0, set it to 0
        wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
    }

    // Method to get the employee's hourly wage
    public double getWage() {
        return wage;
    }

    // Method to set the employee's hours worked
    public final void setHours(double hoursWorked) {
        // If the given hours worked is less than 0 or greater than 168 (the number of hours in a week),
        // set it to 0
        hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
    }

    // Method to get the employee's hours worked
    public double getHours() {
        return hours;
    }

    // Method to calculate the employee's earnings
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    // Method to return a string representation of the object
    @Override
    public String toString() {
        // Return a formatted string containing the employee's name, hourly wage, hours worked,
        // and the parent class's toString method
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
