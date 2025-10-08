package control_flow;
import java.util.Scanner;

/**
 * A program that demonstrates the use of switch-case statements in Java.
 * This program takes a number input (1-7) and returns the corresponding day of the week,
 * along with whether it's a weekday or weekend.
 */
public class SwitchCase {
   public static void main(String[] args) {
      // Create a Scanner object to read user input
      Scanner input = new Scanner(System.in);
      int day = input.nextInt();

      //         // Prompt the user for input
      //         System.out.print("Enter a number (1-7) to check the day: ");

      //         // Check if the input is an integer
      //         if (input.hasNextInt()) {
      //             int dayNumber = input.nextInt();

      //             // Use switch-case to determine the day of the week
      //             switch (dayNumber) {
      //                 case 1:
      //                     System.out.println("Monday - Weekday");
      //                     break;
      //                 case 2:
      //                     System.out.println("Tuesday - Weekday");
      //                     break;
      //                 case 3:
      //                     System.out.println("Wednesday - Weekday");
      //                     break;
      //                 case 4:
      //                     System.out.println("Thursday - Weekday");
      //                     break;
      //                 case 5:
      //                     System.out.println("Friday - Weekday");
      //                     break;
      //                 case 6:
      //                     System.out.println("Saturday - Weekend");
      //                     break;
      //                 case 7:
      //                     System.out.println("Sunday - Weekend");
      //                     break;
      //                 default:
      //                     System.out.println("Invalid input! Please enter a number between 1 and 7.");
      //             }
      //         } else {
      //             // Handle non-integer input
      //             System.out.println("Error: Please enter a valid number!");
      //         }

      //         // Close the scanner to prevent resource leaks
      //         input.close();
      //     }
      // }

      switch (day) {
         case 1, 2, 3, 4, 5:
            System.out.println("Weekday");
         case 6, 7:
            System.out.println("Weekend");

      }


      
   }
}


/*
THEORY: SWITCH-CASE STATEMENTS IN JAVA

1. What are Switch-Case Statements?
   - A control flow statement that allows a variable to be tested for equality against a list of values
   - Each value is called a case, and the variable being switched on is checked for each case

2. Basic Syntax:
   switch (expression) {
       case value1:
           // code block
           break;
       case value2:
           // code block
           break;
       default:
           // default code block
   }

3. Key Features:
   - The expression can be of type: byte, short, int, char, String (Java 7+), or enum
   - The break statement is used to terminate the switch block
   - The default case is optional and runs when no other cases match
   - Cases must be constant expressions, not variables

4. When to Use Switch-Case:
   - When you have multiple conditions to check against a single variable
   - When you need better readability than multiple if-else statements
   - When working with menu-driven programs
   - When the same operation needs to be performed for multiple cases

5. Advantages:
   - More readable than multiple if-else statements
   - Potentially faster than if-else for multiple conditions
   - Cleaner code structure for multiple conditions

6. Best Practices:
   - Always include a default case
   - Don't forget break statements (unless fall-through is intended)
   - Keep the code in each case block short
   - Consider using enums for better type safety

7. Common Use Cases:
   - Menu-driven programs
   - State machines
   - Command processors
   - Vending machines
   - Calendar applications (like this one)

8. Enhanced Switch (Java 14+):
   - Arrow syntax: case -> instead of case ... :
   - Multiple case labels
   - Yield to return values
   - No fall-through by default

9. Alternatives:
   - If-else statements
   - Polymorphism (for more complex scenarios)
   - Map-based implementations (for certain use cases)
*/

