//Write an application to simulate the rolling of two dice.
//The application should use an object of class Random once to roll the first die and again to roll
//the second die.  The sum of the two values should then be calculated.  Each die can show an
//integer value from 1 to 6, so the sum of the clause will vary from 2 to 12, with 7 being the most
//frequent sum, and 2 and 12 the least frequent.  Figure 6.21 shows the 36 possible combinations
//of the two die.  Your application should roll the dice 36,000 times.  Use a one-dimensional array
//to tally the number of times each possible sum appears.  Display the results in a tabular format.
//CSIS 212-B03
import java.util.Random;

public class dice_rolling {
    public static void main(String[] args) {
        System.out.println("Darreion Bailey – Week 5 - Assignment #2\n");
        final int ROLLS = 36000;
        int[] frequencies = new int[13]; // array to store the frequency of each sum

        Random random = new Random();

        // roll the dice 36,000 times and tally the frequency of each sum
        for (int i = 0; i < ROLLS; i++) {
            int die1 = 1 + random.nextInt(6); // roll the first die
            int die2 = 1 + random.nextInt(6); // roll the second die
            int sum = die1 + die2; // calculate the sum of the two dice
            frequencies[sum]++; // increment the frequency of the corresponding sum
        }

        // display the frequency of each possible sum in a tabular format
        System.out.printf("%s%10s%n", "Sum", "Frequency");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%4d%10d%n", i, frequencies[i]);
        }
    }
}
