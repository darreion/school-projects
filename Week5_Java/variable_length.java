//Write an application that calculates the
//product of a series of integers that are passed to method product using a variable-length
//argument list. Test your method with several calls, each with a different number of arguments.
//CSIS 212-B03
public class variable_length {

    // Method to calculate the product of a series of integers
    public static int product(int... nums) {
        // Initialize result to 1
        int result = 1;
        // Multiply each integer in the nums list with the result
        for (int num : nums) {
            result *= num;
        }
        // Return the final result
        return result;
    }

    // Main method to test the product method with different number of arguments
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 5 - Assignment #1\n");
        // Test product method with 4 arguments
        int result1 = product(2, 4, 6, 8);
        System.out.println("Product of 2, 4, 6, and 8 is " + result1);

        // Test product method with 3 arguments
        int result2 = product(1, 3, 5);
        System.out.println("Product of 1, 3, and 5 is " + result2);

        // Test product method with 1 argument
        int result3 = product(10);
        System.out.println("Product of 10 is " + result3);

        // Test product method with no arguments
        int result4 = product();
        System.out.println("Product of no numbers is " + result4);
    }
}
