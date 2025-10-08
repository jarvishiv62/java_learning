package string_operations;
import java.util.Scanner;

/**
 * A program that checks if a given character is uppercase or lowercase.
 * This demonstrates basic character manipulation and conditional statements in Java.
 */
public class CaseCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a single character: ");
        
        // Read the first character of the input string
        // trim() removes any leading/trailing whitespace
        // charAt(0) gets the first character of the input
        char ch = in.next().trim().charAt(0);
        
        // Check if the character is lowercase (ASCII values 97-122)
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase");
        } 
        // If not lowercase, assume it's uppercase (for this basic example)
        else {
            System.out.println("The character is UPPERCASE");
        }
        
        // Close the scanner to prevent resource leaks
        in.close();
    }
}

/*
THEORY: CHARACTER HANDLING IN JAVA

1. Character Representation:
   - In Java, characters are represented using the 'char' data type
   - Each character has a corresponding ASCII/Unicode value
   - 'a' to 'z' : 97 to 122 (lowercase)
   - 'A' to 'Z' : 65 to 90 (uppercase)
   - '0' to '9' : 48 to 57 (digits)

2. Character Class Methods:
   - Character.isLetter(ch) : Checks if character is a letter
   - Character.isDigit(ch)  : Checks if character is a digit
   - Character.isUpperCase(ch) : Checks if character is uppercase
   - Character.isLowerCase(ch) : Checks if character is lowercase
   - Character.toUpperCase(ch) : Converts to uppercase
   - Character.toLowerCase(ch) : Converts to lowercase

3. Input Handling:
   - Scanner.next() reads input until whitespace
   - trim() removes leading/trailing whitespace
   - charAt(0) gets the first character
   
4. Edge Cases to Consider:
   - Empty input
   - Multiple characters
   - Non-alphabetic characters
   - Whitespace characters
   - Special characters

5. Possible Enhancements:
   - Add input validation
   - Handle non-alphabetic characters
   - Process multiple characters
   - Add support for Unicode characters
   - Create a method to check case

6. Common Pitfalls:
   - Not handling empty input
   - Assuming input is always valid
   - Not closing the Scanner
   - Case sensitivity issues

7. Alternative Approaches:
   - Using Character class methods
   - Regular expressions
   - Switch-case with character ranges
*/

