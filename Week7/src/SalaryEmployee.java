public class SalaryEmployee extends Employee
{
    // Private instance variable to store the employee's weekly salary
    private double weeklySalary;

    // Constructor that takes in the employee's first name, last name, social security number,
    // date of birth, and weekly salary
    public SalaryEmployee(String first, String last, String ssn, Date DayOfBirth, double salary)
    {
        // Call the constructor of the parent class (Employee) with the given parameters
        super(first, last, ssn, DayOfBirth);

        // Set the employee's weekly salary using the provided method
        setWeeklySalary(salary);
    }

    // Method to set the employee's weekly salary
    public final void setWeeklySalary(double salary) {
        // If the given salary is less than 0, set the weekly salary to 0
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    // Method to get the employee's weekly salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Method to calculate the employee's earnings
    public double earnings() {
        return getWeeklySalary();
    }

    // Method to return a string representation of the object
    public String toString() {
        // Return a formatted string containing the employee's name, weekly salary,
        // and the parent class's toString method
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
