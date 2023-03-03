//Product-- Calculate the product of odd integers from 1 to 15
//CSIS 212-B03

public class Product {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 3 - Assignment #1\n");
        int product = 1;
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }
        System.out.println("The product of the odd integers from 1 to 15 is: " + product);
    }
}
