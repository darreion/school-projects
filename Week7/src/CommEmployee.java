public class CommEmployee extends Employee
{
    // Two private instance variables to store gross sales and commission rate of the employee.
    private double grossSales;
    private double commissionRate;

    // Constructor that takes in arguments including first name, last name, social security number, date of birth, sales and commission rate.
    public CommEmployee(String first, String last, String ssn, Date DayOfBirth, double sales, double rate) {
        // Calling the constructor of the parent class Employee using the 'super' keyword.
        super(first, last, ssn, DayOfBirth);
        // Setting gross sales and commission rate using the methods 'setGrossSales' and 'setCommissionRate'.
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    // A setter method to set the commission rate of the employee.
    public final void setCommissionRate(double rate) {
        // Ternary operator is used to check if the commission rate is greater than 0 and less than 1, otherwise set it to 0.
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }

    // A getter method to get the commission rate of the employee.
    public double getCommissionRate() {
        return commissionRate;
    }

    // A setter method to set the gross sales of the employee.
    public final void setGrossSales(double sales) {
        // If gross sales are less than 0, set it to 0.
        grossSales = (sales < 0.0) ? 0.0 : sales;
    }

    // A getter method to get the gross sales of the employee.
    public double getGrossSales() {
        return grossSales;
    }

    // A method to calculate the earnings of the employee based on the commission rate and gross sales.
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // A method to return a string representation of the object.
    public String toString() {
        // Using the String.format method to format the string representation of the object.
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }

}
