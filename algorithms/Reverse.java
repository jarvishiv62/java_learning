package algorithms;
public class Reverse {
    public static void main(String[] args) {
        int num = 2345976;
        int ans = 0;
        while (num > 0) {          // while loop chal rhi hai tab tak jab num 0 se bada hai
            int rem = num % 10;     // rem nikal rhi hai 
            num /= 10;              // num ko 10 se divide karta hai kyuki hum last digit ko remove karna hai
            ans = ans * 10 + rem;   //ans ko 10 se multiply karta hai aur rem ko add karta hai kyuki hum reverse karna hai
        
        }
System.out.println(ans);
    }
}


/*
THEORY: NUMBER REVERSAL IN JAVA

1. Basic Concept:
   - Reversing a number means that the last digit becomes the first, 
     the second last becomes the second, and so on.
   - For example, 12345 becomes 54321 when reversed.

2. Algorithm Steps:
   a. Initialize reversedNum to 0
   b. While num > 0:
      - Extract the last digit: digit = num % 10
      - Append digit to reversedNum: reversedNum = reversedNum * 10 + digit
      - Remove the last digit from num: num = num / 10

3. Key Operations:
   - Modulus (% 10): Extracts the last digit
   - Integer division (/ 10): Removes the last digit
   - Multiplication and addition: Builds the reversed number

4. Edge Cases to Consider:
   - Number is 0
   - Negative numbers (handle by taking absolute value)
   - Numbers ending with 0 (e.g., 100 becomes 1, not 001)
   - Very large numbers (beyond int range)
   - Single digit numbers

5. Time and Space Complexity:
   - Time Complexity: O(d) where d is the number of digits
   - Space Complexity: O(1) as we're using constant extra space

6. Alternative Approaches:
   - Convert to String and reverse (less efficient but more readable)
   - Using StringBuilder's reverse() method
   - Using recursion (not recommended for very large numbers)

7. Common Mistakes:
   - Not handling negative numbers
   - Not considering integer overflow
   - Incorrect loop condition
   - Losing precision with floating-point numbers

8. Real-world Applications:
   - Palindrome checking
   - Number system conversions
   - Data encryption algorithms
   - Game development (e.g., scoring systems)
   - Data validation

9. Optimizations:
   - Use long instead of int to handle larger numbers
   - Early termination for single-digit numbers
   - Special handling for numbers ending with 0

10. Related Problems:
    - Check if a number is a palindrome
    - Reverse bits of a number
    - Reverse digits with overflow check
    - Reverse only even/odd positioned digits
*/

