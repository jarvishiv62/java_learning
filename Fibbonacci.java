import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates a Scanner to read user input from the console.
        System.out.print("Enter the position in Fibonacci sequence:"); // Prompts the user for input.
        int n = input.nextInt(); // Reads an integer from the user, representing the position in the Fibonacci sequence.
        int a = 0; // First Fibonacci number.
        int b = 1; // Second Fibonacci number.
        int count = 2; // Counter to track the position in the sequence.

        while (count <= n) { // Loop until reaching the nth position.
            int temp = b; // Store current value of b.
            b = b + a; // Calculate next Fibonacci number.
            a = temp; // Update a to previous b.
            count++; // Move to the next position.
        }
        System.out.println(b); // Output the nth Fibonacci number.
    }
    
}