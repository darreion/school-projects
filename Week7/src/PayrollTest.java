//Payroll Modification Modify the payroll system of Figs 10.4 –10.9 to include
//private instance variable birthdate in class Employee. Use class Date of Fig 8.7 to represent an
//employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per
//month. Create an array of Employee variables to store references to the various employee
//objects. In a loop, calculate the payroll for each Employee (polymorphic ally), and add a $100.00
//bonus to the persons payroll amount if the current month is the one in which the Employee’s
//birthdate occurs.
//CSIS 212-B03

public class PayrollTest {
        // This is the main method, which is the entry point of the program
        public static void main(String args[]) {
                System.out.println("Darreion Bailey – Week 7 - Assignment #1\n");
                // Create a new Date object representing the current date
                Date currentDate = new Date(3, 3, 2023);
                // Print the current date to the console
                System.out.printf("Current Date is: %s\n", currentDate.toString());

                // Create a new SalaryEmployee object with the given information
                SalaryEmployee salariedEmployee = new SalaryEmployee("Darreion", "Bailey", "123-12-1234", new Date(7, 18, 1995), 999.00);
                // Create a new HourlyEmployee object with the given information
                HourlyEmployee hourlyEmployee = new HourlyEmployee("Cora", "Harper", "124-13-1235", new Date(12, 14, 1991), 35.00, 45);
                // Create a new CommEmployee object with the given information
                CommEmployee commissionEmployee = new CommEmployee("Nikki", "Nunley", "125-14-1236", new Date(6, 22, 1997), 10000000, .1);

                // Print information about the salaried employee, including their earnings
                System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
                // Print information about the hourly employee, including their earnings
                System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
                // Print information about the commission employee, including their earnings
                System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());

                // Create an array of Employee objects and add the previously created employees to it
                Employee employees[] = new Employee[3];
                employees[0] = salariedEmployee;
                employees[1] = hourlyEmployee;
                employees[2] = commissionEmployee;

                // Iterate over the employees in the array
                for (Employee currentEmployee : employees) {
                        // Print information about the current employee
                        System.out.println(currentEmployee);

                        // If the current employee is an instance of BaseCommEmployee, increase their base salary by 10%
                        if (currentEmployee instanceof BaseCommEmployee) {
                                BaseCommEmployee employee = (BaseCommEmployee) currentEmployee;
                                double oldBaseSalary = employee.getBaseSalary();
                                employee.setBaseSalary(1.10 * oldBaseSalary);
                                System.out.printf("new base salary with 10% increase is: $%,.2f\n", employee.getBaseSalary());
                        }

                        // If the current employee's birthday is in the current month, add a $100 bonus to their earnings
                        if (currentDate.getMonth() == currentEmployee.getBirthday().getMonth()) {
                                System.out.printf("earned $%,.2f. %s\n\n", currentEmployee.earnings() + 100.00, "Note: added $100 bonus to payroll for Birthday");
                        } else {
                                // Otherwise, just print their regular earnings
                                System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
                        }
                }

                // Iterate over the employees in the array again and print their class names
                for (int j = 0; j < employees.length; j++) {
                        System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getSimpleName());
                }
        }
}

