import java.util.Scanner;

/**
 * A simple calculator program that performs basic arithmetic operations.
 * This program demonstrates the use of control structures and user input in Java.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;  // Variable to store the result of calculations
        
        // Main program loop - continues until user enters 'X' or 'x'
        while (true) {
            // Take operator input from user
            System.out.print("Enter the operator (+, -, *, /, %) or 'X' to exit: ");
            char op = input.next().trim().charAt(0);
            
            // Check if the operator is valid
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Take two numbers as input
                System.out.print("Enter two numbers (separated by space): ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = (num1 + num2);
                }
                if (op == '-') {
                    ans = (num1 - num2);
                }
                if (op == '*') {
                    ans = (num1 * num2);

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = (num1 / num2);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }

                if (op == '%') {
                    ans = (num1 % num2);
                }
                System.out.println("Result: " + ans);
                
            } else if (op == 'X' || op == 'x') {
                System.out.println("Exiting calculator...");
                break;  // Exit the loop
            } else {
                System.out.println("Invalid operator! Please use +, -, *, /, or %");
            }
        }
        
        // Close the scanner to prevent resource leak
        input.close();
            }
}

/*
THEORY: BASIC CALCULATOR IMPLEMENTATION

1. Program Structure:
   - Uses a continuous loop to accept multiple operations
   - Implements basic arithmetic operations (+, -, *, /, %)
   - Includes input validation and error handling

2. Key Concepts Demonstrated:
   - Control Structures: while loop, if-else, switch-case
   - User Input: Using Scanner class
   - Type Conversion: Handling different data types
   - Error Handling: Division by zero check

3. Features:
   - Continuous operation until user chooses to exit
   - Clear prompts and error messages
   - Handles both positive and negative numbers
   - Proper resource management (Scanner close)

4. Possible Enhancements:
   - Add support for decimal numbers (use double/float)
   - Add more operations (e.g., power, square root)
   - Implement a history of calculations
   - Add input validation for non-numeric inputs
   - Create a graphical user interface (GUI)

5. Common Issues and Solutions:
   - Division by zero: Handled with input validation
   - Invalid operator: User is prompted to enter a valid operator
   - Non-numeric input: Basic handling with Scanner methods
*/

