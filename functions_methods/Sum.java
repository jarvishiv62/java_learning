package functions_methods;

import java.util.Scanner;

/**
 * This class demonstrates the use of a static method to sum two numbers.
 */

public class Sum {

    public static void main(String[] args) {
        // call the static method sum() twice
        sum();
        sum();
    }

    /**
     * This static method takes two integers as input from the user and returns their sum.
     * @return the sum of two integers
     */
    static int sum() {

        // create a new Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // prompt the user for the first number
        System.out.print("enter the first no: ");
        // read the first number from the user
        int a = in.nextInt();

        // prompt the user for the second number
        System.out.print("enter the second no: ");
        // read the second number from the user
        int b = in.nextInt();

        // calculate the sum of the two numbers
        int sum = a + b;

        // print the sum
        System.out.println("the sum = " + sum);

        // return the sum
        return sum;
    }
}
    /**
     * The code flows as follows:
     * 1. The main method is called and it calls the static method sum() twice.
     * 2. The sum() method is called and it creates a new Scanner object to read user input.
     * 3. The method prompts the user for the first number and reads it using the Scanner object.
     * 4. The method prompts the user for the second number and reads it using the Scanner object.
     * 5. The method calculates the sum of the two numbers and prints it.
     * 6. The method returns the sum.
     */

