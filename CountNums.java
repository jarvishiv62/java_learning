import java.util.Scanner;

/**
 * A program that counts the occurrences of a specific digit in a given number.
 * This demonstrates number manipulation and basic control flow in Java.
 */
public class CountNums {
    public static void main(String[] args) {
        int n = 243454433; // here we are giving input number from which to count
        int count = 0; // here we are initializing count to 0
        while (n>0) // here we are running a while loop until n becomes 0
        {
            int rem = n % 10; // here we are getting the remainder of n
            if (rem==4) // here we are checking if the remainder is 4
            {
                count++;
            }
            n = n / 10; // here we are removing the last digit from n
        }
        System.out.println(count); // here we are printing the count
    }
}


/*
THEORY: DIGIT MANIPULATION IN JAVA

1. Extracting Digits:
   - Last digit: number % 10
   - Remove last digit: number / 10
   - This works because in integer division, the fractional part is discarded

2. Edge Cases to Consider:
   - Number is 0
   - Negative numbers
   - Very large numbers (beyond int range)
   - Digit to find is 0

3. Time Complexity:
   - O(d) where d is the number of digits in the number
   - For a number n, number of digits = floor(log10(n)) + 1

4. Alternative Approaches:
   - Convert number to String and count characters
   - Using recursion
   - Using streams (Java 8+)

5. Common Mistakes:
   - Not handling negative numbers
   - Infinite loops with negative numbers
   - Off-by-one errors in counting
   - Not considering the case when number is 0

6. Best Practices:
   - Always handle edge cases first
   - Use helper methods for better readability
   - Add input validation
   - Consider using long for larger numbers

7. Real-world Applications:
   - Data validation
   - Number analysis
   - Checksum calculations
   - Cryptography
   - Data compression

8. Advanced Topics:
   - Bit manipulation for binary digits
   - Regular expressions for pattern matching
   - Parallel processing for very large numbers
   - Memory-efficient algorithms for big integers
*/

