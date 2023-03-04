public abstract class Employee
{
    private String firstName; // the first name of the employee
    private String lastName; // the last name of the employee
    private String SSN; // the social security number of the employee
    private Date birthday; // the date of birth of the employee

    public Employee(String first, String last, String ssn, Date DayOfBirth) // constructor for creating an Employee object
    {
        firstName = first;
        lastName = last;
        SSN = ssn;
        birthday = DayOfBirth;
    }

    public void setFirstName(String first) { // method for setting the first name of the employee
        firstName = first;
    }

    public String getFirstName() { // method for getting the first name of the employee
        return firstName;
    }

    public void setLastName(String last) { // method for setting the last name of the employee
        lastName = last;
    }

    public String getLastName() { // method for getting the last name of the employee
        return lastName;
    }

    public void setSSN(String ssn) { // method for setting the social security number of the employee
        SSN = ssn;
    }

    public String getSSN() { // method for getting the social security number of the employee
        return SSN;
    }

    public void setBirthday(Date DayOfBirth) { // method for setting the date of birth of the employee
        birthday = DayOfBirth;
    }

    public Date getBirthday() { // method for getting the date of birth of the employee
        return birthday;
    }

    public String toString() { // method for returning a string representation of an Employee object
        return String.format("%s %s\nsocial security number: %s\nbirthday: %s\n",
                getFirstName(), getLastName(), getSSN(), getBirthday());
    }

    public abstract double earnings(); // abstract method for calculating the earnings of an Employee object
}
