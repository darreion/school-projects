// Salary -- Develop a Java application that determines the gross
//pay for each of three (3) employees.  The company pays straight time for the first 40 hours
//worked by each employee and time and a half for all hours worked in excess of 40.  You’re
//given a list of employees, their number of hours worked last week, and their hourly rates [create
//your own information/data here to input into the program].  Your program should input this
//information/data for each employee, then determine and display the employee’s gross pay.  Use
//class Scanner to input the employee data.
//CSIS 212-B03

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey - Week 2\n"); //name and assignment
        Scanner Pay = new Scanner(System.in); //create Pay scanner object
        Scanner Hours = new Scanner(System.in); //create Hours scanner object

        double pay1;        //input hourly rate
        double pay2;
        double pay3;

        double hour1;       //input hours worked
        double hour2;
        double hour3;

        double overtime1;   //initialize overtime
        double earned1;     //initialize earned
        double grossPay1;   //initialize gross pay

        double overtime2;
        double earned2;
        double grossPay2;

        double overtime3;
        double earned3;
        double grossPay3;

        System.out.print("Enter your hourly rate: ");       //prompt
        pay1 = Pay.nextDouble();        //reads input
        System.out.print("Enter your hours worked: ");
        hour1 = Hours.nextDouble();
        overtime1 = (hour1 - 40) * pay1 * 1.5;      //calculates total overtime pay
        grossPay1 = overtime1 + (40*pay1);          //calculates total pay including overtime when applicable
        earned1 = hour1*pay1;                       //calculates total pay excluding overtime when applicable
                if (hour1 > 40)         // prints pay if hours are greater than 40
                    System.out.printf("Pay for Employee 1 is $%.2f.", grossPay1);
                else        //prints pay if hours are less than 40
                    System.out.printf("Pay for Employee is $%.2f.", earned1);

//repeat steps from first employee
        System.out.print("\nEnter your hourly rate: ");
        pay2 = Pay.nextDouble();
        System.out.print("Enter your hours worked: ");
        hour2 = Hours.nextDouble();
        overtime2 = (hour2 - 40) * pay2 * 1.5;
        grossPay2 = overtime2 + (40*pay2);
        earned2 = hour2*pay2;
                if (hour2 > 40)
                    System.out.printf("Pay for Employee 2 is $%.2f.", grossPay2);
                else
                    System.out.printf("Pay for Employee 2 is $%.2f.", earned2);

        System.out.print("\nEnter your hourly rate: ");
        pay3 = Pay.nextDouble();
        System.out.print("Enter your hours worked: ");
        hour3 = Hours.nextDouble();
        overtime3 = (hour3 - 40) * pay3 * 1.5;
        grossPay3 = overtime3 + (40*pay3);
        earned3 = hour3*pay3;
                if (hour3 > 40)
                    System.out.printf("Pay for Employee 3 is $%.2f.", grossPay3);
                else
                    System.out.printf("Pay for Employee 3 is $%.2f.", earned3);
    }
} //end