public class BaseCommEmployee extends Employee {
    private double baseSalary; // private instance variable

    // constructor
    public BaseCommEmployee(String first, String last, String ssn,
                            double sales, double rate,
                            double salary, int month, int day, int year) {
        super(first,last,ssn, new Date(month, day, year)); // calling the constructor of the parent class with 4 parameters
        setBaseSalary(salary); // calling the setter method to set the base salary
    }

    public void setBaseSalary(double salary){ // setter method for base salary
        if(salary >= 0.0f) // validating the input
            baseSalary = salary; // setting the instance variable
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0f"); // throwing an exception for invalid input
    }

    public double getBaseSalary(){ // getter method for base salary
        return this.baseSalary;
    }

    public double earnings(){ // method to calculate earnings
        return getBaseSalary(); // returning the base salary
    }

    public String toString(){ // overriding the toString method to return a string representation of the object
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary()); // returning the formatted string
    }
}
